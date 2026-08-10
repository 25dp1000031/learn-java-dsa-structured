import java.util.*;

public class RunningSumOf1dArray_O_1_Complexity {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 4 };
        Solution sol = new Solution();
        Arrays.stream(sol.runningSum(nums)).forEach((i) -> System.out.print(i + " "));
    }
}

class Solution {
    public int[] runningSum(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            nums[i] += nums[i - 1];
        }
        return nums;
    }
}