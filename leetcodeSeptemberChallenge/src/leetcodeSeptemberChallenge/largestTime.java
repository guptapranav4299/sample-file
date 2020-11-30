package leetcodeSeptemberChallenge;

import java.util.Scanner;

public class largestTime {
	static int max = -1;

	public static String largestTimeFromDigits(int[] arr) {
		permutate(arr, 0);

		if (max == -1)
			return "";
		else
			return String.format("%02d:%02d", max / 60, max % 60);
	}

	private static void permutate(int[] arr1, int start) {
		if (start == arr1.length) {
			buildTime(arr1);
			return;
		}

		for (int i = start; i < arr1.length; i++) {
			swap(arr1, i, start);
			permutate(arr1, start + 1);
			swap(arr1, i, start);
		}
	}

	private static void buildTime(int[] arr) {
		int hour = arr[0] * 10 + arr[1];
		int minute = arr[2] * 10 + arr[3];

		if (hour < 24 && minute < 60)
			max = Math.max(max, hour * 60 + minute);
	}

	private static void swap(int[] arr, int i, int j) {
		if (i == j)
			return;
		else {
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int[] arr = new int[n];

		for (int i = 0; i < n; i++)
			arr[i] = scn.nextInt();

		System.out.println(largestTimeFromDigits(arr));
	}

}
