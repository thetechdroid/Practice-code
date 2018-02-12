public class OuterOne {

	static int v1 = 123;
	private int v2 = 234;
	static private int v3 = 7987897;
	
	
	public static void main(String[] args) {

		OuterOne.InnerOne in = new OuterOne.InnerOne();
		//InnerOne.runThis(new OuterOne());
		//in.displayValues();
		in.printThis(v1);
		
	}

	 private void doThis() {
		System.out.print(" Outer class's static method\n");
	}

	 private void doThis(String str) {
		System.out.print(" Outer class's static method with String input: " + str);
	}
	
	 static class InnerOne {

		static void runThis(OuterOne out) {
			out.doThis();
			out.doThis("Asshole");
		}
		static void printThis(int v2) {
			System.out.println("V2: " + v2);
		}
		
		static void displayValues() {
			System.out.println("V1: " + v1);
			//System.out.println("V2: "+v2);
			System.out.println("V3: "+v3);
		}		
		
	}

}
