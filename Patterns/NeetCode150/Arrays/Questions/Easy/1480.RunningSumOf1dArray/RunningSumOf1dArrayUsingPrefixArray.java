import java.util.*;

public class RunningSumOf1dArrayUsingPrefixArray {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 4 };
        Solution sol = new Solution();
        Arrays.stream(sol.runningSum(nums)).forEach((i) -> System.out.print(i + " "));
    }
}

class Solution {
    public int[] runningSum(int[] nums) {
        int n = nums.length;
        int[] prefixArr = new int[n];
        prefixArr[0] = nums[0];
        for (int i = 1; i < n; i++) {
            prefixArr[i] = prefixArr[i - 1] + nums[i];
        }
        // int[] arr = new int[n];

        return prefixArr;
    }

    // int getPrefix(int first, int second, int[] arr) {
    // if (first == 0) {
    // return arr[second];
    // }
    // return arr[second] - arr[first - 1];
    // }
}