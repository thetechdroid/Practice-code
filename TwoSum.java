package numbers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5, 7, 8, 9};
        int value = 12;

        List<List<Integer>> result = findTwoSumPairs(arr, value);
        print(result);
    }


    public static List<List<Integer>> findTwoSumPairs(int[] arr, int value) {
        List<List<Integer>> result = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();

        for (int n : arr) {
            if (map.containsKey(value - n)) {
                List<Integer> temp = new ArrayList<>();
                temp.add(n);
                temp.add(value - n);
                result.add(temp);
            } else {
                map.put(n, value - n);
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

}
