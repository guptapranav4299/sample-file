package arrays;

import java.util.HashMap;
import java.util.Scanner;

public class sumK {

//	Approach-1 Naive Approach o(n^2)

	public static void getPairsCount(int[] arr, int n, int sum) {
		int count = 0;

		for (int i = 0; i < n; i++)
			for (int j = 0; j < n; j++)
				if (arr[i] + arr[j] == sum)
					count++;

		System.out.println(count);
	}

//	approach-2 store the elements in hashmap and then add other elements to the hasmap and then check if the 
//	we get the desired sum
//	time-o(n) 

	public static int getPairsOpt(int[] arr, int n, int sum) {
		HashMap<Integer, Integer> map = new HashMap<>();

		for (int i = 0; i < n; i++) {

			if (!map.containsKey(arr[i]))
				map.put(arr[i], 0);

			map.put(arr[i], map.get(arr[i + 1]));
		}

		int count = 0;

		for (int i = 0; i < n; i++) {
			if (map.get(sum - arr[i]) != null)
				count = count + map.get(sum - arr[i]);

			if (sum - arr[i] == arr[i])
				count--;

		}

		return count / 2;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int[] arr = new int[n];

		for (int i = 0; i < n; i++)
			arr[i] = scn.nextInt();

		int sum = scn.nextInt();
		getPairsCount(arr, n, sum);
		System.out.println(getPairsOpt(arr, n, sum));
	}

}
