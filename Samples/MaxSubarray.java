package Samples;

public class MaxSubarray {

	public static void main(String[] args) {

		int[] arr = { -2, -1, -3, 4, 5, 6, -7, -8, -9 };
		maxSubarr(arr);

	}

	private static void maxSubarr(int[] arr) {

		int newSum = arr[0];
		int max = arr[0];

		for (int i = 0; i < arr.length; i++) {
			newSum = Math.max(newSum + arr[i], arr[i]);
			max = Math.max(max, newSum);
		}

		System.out.println(max);

	}

}
