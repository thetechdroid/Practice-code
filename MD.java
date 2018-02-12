
public class MD {

	public static void main(String[] args) {

		int a = 100, b = 24;

		int mul = mul(a, b);
		System.out.print(mul);

		//int div = div(a, b);
		//System.out.print("Dividend here is" + div);

	}

	 static int mul(int a, int b) {
		int temp = a;
		while (b>1) {
			a = a + temp;
			b--;
		}
		return a*b;
	}

	 static int div(int a, int b) {

		while (b != 0) {
			int borrow = ~a & b;
			a = a ^ b;
			b = borrow << 1;
		}
		return a;
	}

}