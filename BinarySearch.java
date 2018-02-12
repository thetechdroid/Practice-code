import java.util.Arrays;

public class BinarySearch {

	public static void main(String[] args) {

		int arr[] = { 23, 12, 11, 67, 78, 33, 45, -34, 10, 5, 9 };
		int num = -4;

		Arrays.sort(arr);
		System.out.print("\n");

		System.out.print("Searching for " + num + " \n");

		for (int i : arr)
			System.out.print(i + " ");

		//int index = BS(arr, num, 0, arr.length - 1); // iterative solution
		int index = BSR(arr, num, 0, arr.length - 1); // recursive solution

		if (index != -1) {
			System.out.print("\nElement found at index: " + index);
		} else
			System.out.print("\nElement not found");

	}

	public static int BS(int[] arr, int num, int low, int end) {
		if (low > end) {
			return -1;
		}
		while (low <= end) {
			int mid = (low + end) / 2;
			if (arr[mid] == num)
				return mid;
			else if (num < arr[mid])
				end = mid - 1;
			else
				low = mid + 1;
		}
		return -1;
		
	}

	public static int BSR(int[] arr, int num, int low, int end) {
		int mid = (low + end) / 2;
		if (low > end)
			return -1;
		if (arr[mid] == num) {
			return mid;
		} else if (arr[mid] < num) {
			return BSR(arr, num, mid + 1, end);
		} else {
			return BSR(arr, num, low, mid - 1);
		}
	}

}


//public class BinarySearchTest{
//	
//	@Test
//	public static checkIfArrayNull() {
//		assertEquals(msg,actual,expected);
//	}
//	
//	
//}








