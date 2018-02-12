
public class AddSub {

	public static void main(String[] args) {

		int a = 24, b = 13;

		int c = a - (-b); // subtract operator

		// if (a != 0) { // a diff logic
		//
		// while (a > 0) {
		// b++;
		// a--;
		// }
		//
		// while (a < 0) {
		// b--;
		// a++;
		// }
		// }

		// int sum = addUsingOperators(a, b);
		// int sum = addUsingOperatorsR(a, b);
		int sub = subOperator(a, b);

		// System.out.print(sum);
		System.out.print("\n" + sub);

	}

	private static int subOperator(int a, int b) {

		if (b == 0)
			return a;
		if (a == 0)
			return -b;

		int x = a ^ b;
		int y = ~(a & b) << 1;

		return subOperator(x,y);

	}

	private static int addUsingOperatorsR(int a, int b) {

		while (b != 0) {
			int carry = a & b;
			a = a ^ b;
			b = carry << 1;
		}
		return a;
	}

	private static int addUsingOperators(int a, int b) {

		if (b == 0)
			return a;

		int sum = a ^ b;
		int carry = (a & b) << 1;

		return addUsingOperators(sum, carry);

	}

}