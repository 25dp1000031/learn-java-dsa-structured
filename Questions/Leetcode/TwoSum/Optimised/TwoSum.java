package Questions.TwoSum.Optimised;

import java.util.*;

public class TwoSum {
    public static void main(String[] args) {
        int arr[] = { 2, 7, 11, 15 };
        int target = 9;
        int[] result = InnerTwoSum(arr, target);
        System.out.println(Arrays.toString(result));
    }

    static int[] InnerTwoSum(int arr[], int target) { // arr = {2,7,11,15} , target = 9
        HashMap<Integer, Integer> TempMap = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int complement = target - arr[i];
            if (TempMap.containsKey(complement)) {
                return new int[] { TempMap.get(complement), i };
            }
            TempMap.put(arr[i], i);
        }
        return new int[] { -1, -1 };
    }
}

// Optimised version