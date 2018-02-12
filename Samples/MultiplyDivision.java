
package Samples;

import java.util.Arrays;

public class MultiplyDivision {

	public static void main(String[] args) {
		int a = 67;
		int b = 10;
		// System.out.print("Multiplication of a and b is: " + mul(a, b));
		div(a, b);
	}

	private static void div(int a, int b) {
		int div = 0, rem = 0;
		while (a > b) {
			a = a - b;
			div++;
		}
		rem = a;
		System.out.print("Divisor of a/b is: " + div + "\n");
		System.out.print("Remainder of a/b is: " + rem);
	}

	private static int mul(int a, int b) {
		int temp = a;
		if (a == 0 || b == 0)
			return 0;
		while (b > 1) {
			a = a + temp;
			b--;
		}
		return a;

	}

}
