package Samples;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class TwoSum {

	public static void main(String[] args) {
		int[] arr = { 12, 34, 9, 4, 25, 89, 33, 25, 33, 30, 28, 98 };
		int sum = 58;
		// twoSum1(arr, sum);
		twoSum2(arr, sum);
	}

	static void twoSum1(int[] arr, int sum) {
		int low = 0, high = arr.length - 1;
		Arrays.sort(arr);

		while (low <= high) {
			if (arr[low] + arr[high] == sum) {
				System.out.println("The pair is : " + arr[low] + " " + arr[high]);
				low++;
				high--;
			} else if (arr[low] + arr[high] > sum)
				high--;
			else
				low++;
		}
	}

	static void twoSum2(int[] arr, int sum) {

		Map<Integer, Integer> map = new HashMap<>();
		for (int i : arr) {
			if (map.containsKey(sum - i))
				System.out.println("The pair is present: " + i + " " + (sum - i));
			else
				map.put(i, sum - i);
		}

	}

}
