package Samples;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class LongestConsecutiveSubsequence {

	public static void main(String[] args) {

		int[] arr = { 12, 15, 16, -2, 1, 2, 3, 4, 5, 6, 89 };
		LCS(arr);
	}

	private static void LCS(int[] arr) {

		int max = 1;

		Set<Integer> set = new HashSet<>();
		Set<Integer> tset = new TreeSet<>();

		for (int i : arr)
			set.add(i);

		for (int i : arr) {

			int count = 1;
			int left = i - 1;
			int right = i + 1;

			while (set.contains(left)) {
				tset.add(left);
				count++;
				set.remove(left);
				left--;
			}

			while (set.contains(right)) {
				tset.add(right);
				count++;
				set.remove(right);
				right++;
			}
			max = Math.max(max, count);
		}

//		System.out.print(" " + max);

		for (int i : tset)
		System.out.print(" " + i);
			
		
		
	}

}
