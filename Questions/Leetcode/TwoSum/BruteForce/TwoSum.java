package Questions.TwoSum.BruteForce;

import java.util.*;

public class TwoSum {
    public static void main(String[] args) {
        int arr[] = { 2, 7, 11, 15 };
        int target = 9;
        int[] result = InnerTwoSum(arr, target);
        System.out.println(Arrays.toString(result));
    }

    static int[] InnerTwoSum(int arr[], int target) { // arr = {2,7,11,15} , target = 9
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                // int complement = target - arr[i];
                if (arr[i] + arr[j] == target) {
                    return new int[] { i, j };
                }
            }
        }
        return new int[] { -1, -1 };
    }
}
