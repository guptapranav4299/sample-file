package practiceQuestions;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class stringcompress {
	public static void stringCompression(String s) {

		for (int i = 0; i < s.length(); i++) {
			int count = 1;
			while (i < s.length() - 1 && s.charAt(i) == s.charAt(i + 1)) {
				count++;
				i++;
			}
			System.out.print(s.charAt(i));
			System.out.print(count);
		}
	}

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		String s = scn.next();
		stringCompression(s);
	}

}
