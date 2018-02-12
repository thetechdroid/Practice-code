package Samples;

public class BuySellStocks {

	public static void main(String[] args) {
		int[] arr = { 12, 34, 45, 24, 89, 56, 8, 92, 103, 22 };
		buySell(arr);
	}

	private static void buySell(int[] arr) {

		int len = arr.length;
		int maxProfit = 0;
		int lastMin = arr[0];
		int lowest = 0;int max = 0;

		for (int i = 1; i < len; i++) {
			lastMin = Math.min(lastMin, arr[i-1]);
			lowest = lastMin;
			if (maxProfit < (arr[i] - lastMin)) {
				maxProfit = arr[i] - lastMin;
				max = arr[i];
		}
		}
		System.out.println("The maximum profit is: " + maxProfit + " ( Buy " + lowest + " -> sold " + max + ")");

	}

}
