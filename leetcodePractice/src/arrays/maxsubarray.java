package arrays;

import java.util.Scanner;

public class maxsubarray {

	public static int maxSubArray(int[] arr, int n) {
		int res = 0;

		for (int i = 0; i < n; i++) {
			int currCount = 0;

			while (i < n && arr[i] >= 0) {
				currCount++;
				i++;
			}
			res = Math.max(res, currCount);

		}
		return res;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int[] arr = new int[n];

		for (int i = 0; i < n; i++)
			arr[i] = scn.nextInt();

		System.out.println(maxSubArray(arr, n));
	}

}
