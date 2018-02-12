//
//public class Substraction {
//
//	public static void main(String[] args) {
//
//		int a = 100, b = 24;
//
//		int subtraction = sub(a, b);
//		System.out.print(subtraction);
//
//	}
//
//	private static int sub(int a, int b) {
//
//		while (b != 0) {
//			int borrow = ~a & b;
//			a = a ^ b;
//			b = borrow << 1;
//		}
//	return a;
//	}
//
//}