package Samples;

import java.util.Arrays;

public class ThreeSum {

	public static void main(String[] args) {
		int[] arr = { 12, 34, 9, 16, 20, 25, 15, 36, 24, 0 };
		int sum = 60;
		threeSum(arr, sum);
	}

	static void threeSum(int[] arr, int sum) {
		Arrays.sort(arr);

		int high = arr.length - 1;
		for (int i = 0; i < high; i++) {
			int low = i + 1;
			while (low < high) {
				if (arr[i] + arr[low] + arr[high] == sum) {
					System.out.println("\nThe numbers are: " + arr[i] + " " + arr[low] + " " + arr[high]);
					break;
				} else if (arr[i] + arr[low] + arr[high] < sum) {
					low++;
				} else
					high--;
			}
		}
	}

}
