package greedy;

import java.util.Scanner;

public class gasstation {
	public static int canCompleteCircuit(int[] gas, int[] cost) {
		int start = gas.length - 1;
		int end = 0;
		int sum = gas[start] - cost[start];

		while (start > end) {
			if (sum >= 0) {
				sum += gas[end] - cost[end];
				end++;
			} else {
				start--;
				sum += gas[start] - cost[start];
			}
		}
		return sum >= 0 ? start : -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int ngas = scn.nextInt();
		int[] gas = new int[ngas];

		for (int i = 0; i < ngas; i++)
			gas[i] = scn.nextInt();

		int ncost = scn.nextInt();
		int[] cost = new int[ncost];

		for (int i = 0; i < ncost; i++)
			cost[i] = scn.nextInt();

		System.out.println(canCompleteCircuit(gas, cost));
	}

}
