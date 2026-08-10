import java.util.*;

public class RunningSumOf1dArray {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 4 };
        Solution sol = new Solution();
        Arrays.stream(sol.runningSum(nums)).forEach((i) -> System.out.print(i + " "));
    }
}

class Solution {
    public int[] runningSum(int[] nums) {
        int n = nums.length;
        int[] arr = new int[n];
        int prefixSum = 0;
        for (int i = 0; i < n; i++) {
            prefixSum += nums[i];
            arr[i] = prefixSum;
        }
        return arr;
    }
}