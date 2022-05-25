package Arrays;

public class RotateArrayRight {


    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8};
        print("==== Before =====");
        print(array);
        print("==== After =====");
        print(rotatedArray(array));
    }


    private static int[] rotatedArray(int[] array) {

        // lets rotate it by 3 and then by 12

        int d = 1;
        int length = array.length;

        if (array.length == 0) {
            return new int[]{};
        }

        if (d > length) {
            d = d % length;
        }

        reverse(array, 0, length - 1);
        reverse(array, 0, d - 1);
        reverse(array, d, length - 1);

        return array;

    }

    private static void reverse(int[] array, int s, int e) {
        int l = array.length;

        if (l == 0) {
            return;
        }

        int start = s;
        int end = e;
        while (start < end) {
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;
            start++;
            end--;
        }
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
