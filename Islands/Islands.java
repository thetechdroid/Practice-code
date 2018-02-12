package Islands;

public class Islands {

	public static void main(String[] args) {
		char[][] arr = { { 1, 0, 1, 0 }, { 0, 0, 0, 1 }, { 1, 1, 0, 0 }, { 1, 0, 1, 0 } };
		findIslands(arr);
		// System.out.println("the number of islands here are: " + count);

	}

	private static void findIslands(char[][] arr) {

		if (arr == null || arr.length == 0 || arr[0].length == 0)
			return;

		int rows = arr.length;
		int columns = arr[0].length;

		System.out.println("rows : " + rows + ", Columns : " + columns);

		int count = 0;

		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				if (arr[i][j] == '1') {
					if ((i == 0 || arr[i][j] == '0') && (j == 0 || arr[i][j] == '0')) {
						System.out.println("I am inside");
						count++;
					}
				}
			}

		}
		System.out.println("the number of islands here are: " + count);
		// return count;
	}

	private static void merge(char[][] arr, int i, int j) {

		int rows = arr.length;
		int columns = arr[0].length;

		if (i < 0 || i >= rows || j < 0 || j >= columns)
			return;

		arr[i][j] = '1';

		merge(arr, i - 1, j);

		if (i + 1 < rows)
			merge(arr, i + 1, j);

		merge(arr, i, j - 1);

		if (j + 1 < columns)
			merge(arr, i, j + 1);

		return;

	}

}
