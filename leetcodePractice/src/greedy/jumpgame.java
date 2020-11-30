package greedy;

import java.util.Scanner;

public class jumpgame {

//	start from last position and see if we can reach
	public static boolean canJump(int[] arr) {
		int lastGoodPosition = arr.length - 1;

		for (int i = arr.length - 1; i >= 0; i--) {
			if (i + arr[i] >= lastGoodPosition)
				lastGoodPosition = i;
		}
		return lastGoodPosition == 0;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int[] arr = new int[n];

		for (int i = 0; i < n; i++)
			arr[i] = scn.nextInt();

		System.out.println(canJump(arr));

	}

}
