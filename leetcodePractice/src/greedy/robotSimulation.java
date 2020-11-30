package greedy;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class robotSimulation {
	public static int robotSim(int[] commands, int[][] obstacles) {
//		store all the obstacles in the hashset
		Set<String> set = new HashSet<>();
		for (int[] obs : obstacles)
			set.add(obs[0] + " " + obs[1]);

//		make a direction matrix
		int[][] dir = new int[][] { { 0, 1 }, { 1, 0 }, { 0, -1 }, { -1, 0 } };
		int d = 0, x = 0, y = 0, result = 0;

		for (int c : commands) {
//			according to commands
			if (c == -1) {
				d++;
				if (d == 4)
					d = 0;
			} else if (c == -2) {
				d--;
				if (d == -1)
					d = 3;
			} else {
//				setting coordinates after obstacles
				while (c-- > 0 && set.contains((x + dir[d][0]) + " " + (y + dir[d][1]))) {
					x = x + dir[d][0];
					y = y + dir[d][1];
				}
			}
//			max of all distances
			result = Math.max(result, x * x + y * y);
		}
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();

		int[] commands = new int[n];
		for (int i = 0; i < n; i++)
			commands[i] = scn.nextInt();

		int n2 = scn.nextInt();
		int[][] obstacles = new int[n2][];
		for (int i = 0; i < n2; i++)
			for (int j = 0; j < n2; j++)
				obstacles[i][j] = scn.nextInt();

		System.out.println(robotSim(commands, obstacles));
	}

}
