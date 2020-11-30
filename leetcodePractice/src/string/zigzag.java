package string;

import java.util.Scanner;

public class zigzag {

	public static String zigZagConversion(String s, int numRows) {
		StringBuilder[] sb = new StringBuilder[numRows];
		char[] c = s.toCharArray();
		int len = s.length();

		for (int i = 0; i < numRows; i++)
			sb[i] = new StringBuilder();

		int i = 0;
		while (i < len) {
			for (int index = 0; index < numRows && i < len; index++)
				sb[index].append(c[i++]);

			for (int index = numRows - 2; index >= 1 && i < len; index--) {
				sb[index].append(c[i++]);
			}
		}

		for (i = 1; i < numRows; i++)
			sb[0].append(sb[i]);

		return sb[0].toString();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		String s = scn.next();
		int numRows = scn.nextInt();

		zigZagConversion(s, numRows);

	}

}
