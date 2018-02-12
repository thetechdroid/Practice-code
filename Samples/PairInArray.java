package Samples;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class PairInArray {

	public static void main(String[] args) {

		int[] arr = { 2, 11, 15, 6, 12, 14 };
		int sum = 26;
		int length = arr.length - 1;
		//findPair(arr, length, sum);
		findPairSortedWay(arr, length, sum);

	}

	static void findPair(int[] arr, int length, int sum) {
		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < length; i++) {
			if (map.containsKey(sum - arr[i])) {
				System.out.println("Pair found at index:" + map.get(sum - arr[i]) + " and " + i);
				return;
			}
			map.put(arr[i], i);
		}
	}

	static void findPairSortedWay(int[] arr, int length, int sum) {
		Arrays.sort(arr);
		
		int low = 0;
		int high = length;
		
		while(low<high) {
			
			if (arr[low] + arr[high] ==sum) {
				System.out.println("Pair found at sorted index: " + low +  " and "+ high);
			low++;
			high--;
			
			}
			else if (arr[low] + arr[high] > sum)
				high--;
			
			else 
				low++;
		}
		
		
		
	}

}
