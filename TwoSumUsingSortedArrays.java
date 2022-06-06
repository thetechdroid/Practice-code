package numbers;

import kotlin.collections.ArraysKt;

import java.util.ArrayList;
import java.util.List;

public class TwoSumUsingSortedArrays {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5, 7, 8, 9};
        int value = 12;
        ArraysKt.sort(arr);
        List<List<Integer>> result = findTwoSumPairs(arr, value);
        print(result);
    }


    public static List<List<Integer>> findTwoSumPairs(int[] arr, int value) {
        List<List<Integer>> result = new ArrayList<>();

        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            if (arr[start] + arr[end] == value) {
                List<Integer> temp = new ArrayList<>();
                temp.add(arr[start]);
                temp.add(arr[end]);
                result.add(temp);

                start++;
                end--;

            } else if (arr[start] + arr[end] > value) {
                end--;
            } else {
                start++;
            }
        }



        return result;
    }


    public static void print(List<List<Integer>> result) {
        for (List<Integer> pair : result) {
            System.out.println(pair.get(0) + " and " + pair.get(1) + " match two sum requirement");
        }
        System.out.println(" ");
    }

    public static void print(int[] result) {
        for (int i : result) {
            System.out.print(i + " ");
        }
        System.out.println(" ");
    }

    public static void print(int num1, int num2) {
        System.out.print(num1 + " and " + num2 + " are two sum pairs");
    }

}
