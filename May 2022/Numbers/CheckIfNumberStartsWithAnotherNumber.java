package numbers;

public class CheckIfNumberStartsWithAnotherNumber {

    // TC : O(n) in both cases, SC : O(1)
    public static void main(String[] args) {

        int num1 = 12345;
        int num2 = 12;
        int num3 = 123;

        print("==== Before =====");
        print(num1 + " starts with " + num2 + " " + isNumberPrefix(num1, num2));
        print(num1 + " starts with " + num3 + " " + isNumberPrefix(num1, num3));
        print("==== After =====");
    }

    // trying to check if num2 is a prefix of num1
    private static boolean isNumberPrefix(int num1, int num2) {
        if (num1 <= 0 || num2 <= 0 || num2 > num1) {
            return false;
        }

        String number1 = String.valueOf(num1);
        String number2 = String.valueOf(num2);


        // Solution 1 : Using string function
        boolean result1 = number1.startsWith(number2);


        // Solution 2 : Using for loop
        boolean result2 = true;


        char[] array1 = number1.toCharArray();
        char[] array2 = number2.toCharArray();

        int shorterLength = array1.length - array2.length > 0 ? array2.length : array1.length;

        for (int i = 0; i < shorterLength; i++) {
            if(array1[i] != array2[i]){
                return false;
            }
        }

        return result2;
    }


    private static void print(int[] array) {
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println(" ");
    }

    private static void print(String str) {
        System.out.println(str + " ");
    }

}
