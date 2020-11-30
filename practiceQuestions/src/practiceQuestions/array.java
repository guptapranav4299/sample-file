package practiceQuestions;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int t = scn.nextInt();
		while (t-- > 0) {
			Set<Integer> set = new HashSet<>();
			int s = scn.nextInt();
			int a[] = new int[s];
			for (int i = 0; i < s; i++) {
				a[i] = scn.nextInt();
				if (Integer.signum(a[i]) < 0) {
					a[i] = -1 * a[i];
				}
				set.add(a[i]);
			}
			System.out.println(set.size());
		}
	}

}
