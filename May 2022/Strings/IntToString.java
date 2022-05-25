public class IntToString {

    public static void main(String[] args) {

        int n = -239;

        String distance = findString(n);
        print(distance);

    }

    private static String findString(int n) { // "-239"

        int max = Integer.MAX_VALUE;
        int min = Integer.MIN_VALUE;

        if (n == 0) return "0";

        if (n > max) {
            return "value greater than integer max value";
        }

        if (n < min) {
            return "value less than integer min value";
        }

        StringBuilder builder = new StringBuilder();
        int flag = 1;

        if (n < 0) {
            flag = -1;
        }


        int num = Math.abs(n);
        while (num > 0) {
            int lastDigit = num % 10;
            builder.append(lastDigit);
            num /= 10;
        }

        if (flag < 0) {
            builder.append("-");
        }


        return builder.reverse().toString();


    }


    private static void print(String value) {
        System.out.println("The string value is: " + value);
    }

}
