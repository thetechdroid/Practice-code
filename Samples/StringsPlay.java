package Samples;

public class StringsPlay {

	public static void main(String[] args) {

		String str = "he is a tall guy";
		String strnew = "he,.is$#*&tall;'guy";
		str = str.replaceAll("\\s", "");
		// System.out.print(str);
		reverseWithoutSplChars(strnew);

	}

	private static void reverseWithoutSplChars(String strnew) {

		char[] arr = strnew.toCharArray();
		int start = 0;
		int end = arr.length - 1;

		while (start < end) {

			if (!isAlphabet(arr[start]) || (!isAlphabet(arr[end]))) {
				start++;
				end--;
			}
			if (isAlphabet(arr[start]) && isAlphabet(arr[end])) {
				char temp = arr[start];
				arr[start] = arr[end];
				arr[end] = temp;
				start++;
				end--;
			}
		}

		StringBuilder sb = new StringBuilder(strnew);
		sb.reverse();
		System.out.print("The reversed array is : " + sb.toString());

		System.out.print("\nThe reversed array is : ");
		for (char c : arr)
			System.out.print(c);

	}

	private static boolean isAlphabet(char c) {
		return ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z') || (c >= '0' && c <= '9'));
	}

}
