package string;

import java.util.HashSet;
import java.util.Scanner;

public class longestSubstring {
	public static int longestsubstring(String str) {
		int max = 0;
		int i = 0;
		int j = 0;
		HashSet<Character> set = new HashSet<>();

		while (j < str.length()) {
			if (!set.contains(str.charAt(j))) {
				set.add(str.charAt(j));
				j++;
				max = Math.max(set.size(), max);
			} else {
				set.remove(str.charAt(i));
				i++;
			}
		}
		return max;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		String str = scn.next();

		System.out.println(longestsubstring(str));

	}

}
