package Islands;

import java.util.Arrays;

public class DupSortedArray {

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4, 1, 2, 6, 7, 8, 8 };
		Arrays.sort(arr);
		printArray(arr);
		removeDups(arr);
	}

	private static void printArray(int[] arr) {
		System.out.print("\n"); 
		for (int am : arr)
			System.out.print(" " + am);
	}

	private static void removeDups(int[] arr) { 
		if (arr.length == 0 || arr.length == 1)
			return;

		else {
			int j = 0, i = 1;
			while (i < arr.length) {
				if (arr[j] == arr[i]) {
					i++;
				} else {
					j++;
					arr[j] = arr[i];
					i++;
				}
			}
			int array[] = Arrays.copyOf(arr, j+1); // needed as the input array is copying itself in the end
			printArray(array);
		}
	}

}
