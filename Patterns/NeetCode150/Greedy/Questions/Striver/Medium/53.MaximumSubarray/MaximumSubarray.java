
public class MaximumSubarray {
    public static void main(String[] args) {
        int[] nums = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
        System.out.println(Solution.maxSubArray(nums));
    }
}

class Solution {
    public static int maxSubArray(int[] nums) {
        int n = nums.length;
        int left = 0; // i just like using left even tho it has no use here T_T
        int maxSum = Integer.MIN_VALUE;
        int prefix = 0;
        for (int right = 0; right < n; right++) {
            prefix += nums[right];
            maxSum = Math.max(maxSum, prefix);
            if (prefix < 0) {
                left = right;
                prefix = 0;
            }
        }
        return maxSum;
    }
}