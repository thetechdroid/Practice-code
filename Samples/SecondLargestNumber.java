package Samples;

public class SecondLargestNumber {

	public static void main(String[] args) {
		int[] arr = { 12, 34, 56, -11, 9, 59, 145,298};

		secondLargest(arr);

	}

	static void secondLargest(int[] arr) {

		int length = arr.length;
		int max = 0, sec = 0;

		for (int i = 0; i < length; i++) {
			if (arr[i] >= max) {
				sec = max;
				max = arr[i];
			}
		}

		System.out.println("The greatest num in array is : " + max);
		System.out.println("The second greatest num in array is : " + sec);

	}

}
