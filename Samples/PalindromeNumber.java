package Samples;

public class PalindromeNumber {

	public static void main(String[] args) {

		int num = 2345432;
		checkPalindrome(num);
	}

	static void checkPalindrome(int num) {

		if (num <= 0)
			return;

		int div = 1;
		while (num / div >= 10) {
			div = div * 10;
		}

		while (num != 0) {
			
			int num_f = num / div;
			int num_l = num % div;
			
			if (num_f != num_l) {
				System.out.print("Not a palindrome number");
				return;
			}
			num/=10;
			div/= 10;
			num_f = num/div;
			
			//num_f = (num_f) / div;
			//num_l = (num_f) % div;
		}

		System.out.print("Palindrome number");

	}

}
