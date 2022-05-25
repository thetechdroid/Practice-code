public class StringToInt {

    public static void main(String[] args) {

        String s = "7685758765785875626";

        int distance = findInt(s);
        print(distance);

    }

    private static int findInt(String s) {

        int max = Integer.MAX_VALUE;
        int min = Integer.MIN_VALUE;

        String str = s.trim();

        if (str.isEmpty()) {
            return 0;
        }

        if (str.charAt(0) == '-' && str.length() > 11) { // if string is too long then it cant be int
            return min;
        }

        if (str.charAt(0) != '-' && str.length() > 10) { // if string is too long then it cant be int
            return max;
        }


        int i = 0, flag = 1, result = 0;

        if(str.charAt(0) == '-'){
            i = 1;
            flag = -1;
        }

        if(str.charAt(0) == '+'){
            i = 1;
        }



        while(i < str.length()){
            if(str.charAt(i) >= '0' && str.charAt(i) <= '9' ){
                int charValue = str.charAt(i) - '0'; // str.charAt(i) returns the ASCII code of the character, so we need to subtract 0 from it
                result = result * 10 + charValue;
                if (result > max) {
                    break;
                }
            }else{
                break;
            }
            i++;
        }


        if(result*flag > max) return max;
        if(result*flag < min) return min;

        return result *flag;

    }


    private static void print(int value) {
        System.out.println("The int value is: " + value);
    }

    private static void print(char value) {
        System.out.println("The char value is: " + value);
    }

}
