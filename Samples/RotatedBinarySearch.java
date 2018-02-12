package Samples;

import java.util.Arrays;

public class RotatedBinarySearch {

	public static void main(String[] args) {

		int[] arr = { 1, 3, 4, 5, 61, 8, 132, 24, 56, 78, 89 };
		int[] sortArr = sortedArray(arr);

		System.out.print("\nThe sorted array is: "); // 1 3 4 5 8 24 56 61 78 89 132 
		for (int i : sortArr) {
			System.out.print(i + " ");
		}

		int[] rotArr = rotatedArray(arr, 4);

		System.out.print("\nThe rotated array is: "); // 24 56 61 78 89 132 1 3 4 5 8 
		for (int i : rotArr) {
			System.out.print(i + " ");
		}

		int num = 89;
		int output = rotatedBS(rotArr, 0, rotArr.length - 1, num);

		if (output == -1)
			System.out.print("\nThe number is not present in the array");
		else
			System.out.print("\nThe index of the number is: " + output);

	}

	private static int rotatedBS(int[] arr, int start, int end, int num) {

		if (start > end)
			return -1;

		int mid = start + (end - start) / 2;

		if (arr[mid] == num) {
			//System.out.print("\nThe index of the number is: " + mid);
			return mid;
		}

		if (arr[start] <= arr[mid]) {
			if (num >= arr[start] && num <= arr[mid])
				return rotatedBS(arr, start, mid - 1, num);
			else
				return rotatedBS(arr, mid + 1, end, num);
		}

		if (num >= arr[mid] && num <= arr[end])
			return rotatedBS(arr, mid + 1, end, num);
		else
			return rotatedBS(arr, start, mid - 1, num);

	}

	private static int[] rotatedArray(int[] arr, int i) {
		reverse(arr, 0, i);
		reverse(arr, i + 1, arr.length - 1);
		reverse(arr, 0, arr.length - 1);
		return arr;
	}

	private static void reverse(int[] arr, int start, int end) {
		while (start < end) {
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}
	}

	private static int[] sortedArray(int[] arr) {
		Arrays.sort(arr);
		return arr;
	}

}
