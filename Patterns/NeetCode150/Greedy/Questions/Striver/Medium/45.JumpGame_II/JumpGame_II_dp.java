import java.util.*;

public class JumpGame_II_dp {

    public static void main(String[] args) {
        int[] nums = { 2, 3, 1, 1, 4 };
        Solution sol = new Solution();
        int res = sol.jump(nums);
        System.out.println(res);
    }
}

class Solution {
    public int jump(int[] nums) {
        int[] dp = new int[nums.length];
        Arrays.fill(dp, Integer.MAX_VALUE);

        dp[0] = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 1; j <= nums[i] && i + j < nums.length; j++) {
                dp[i + j] = Math.min(dp[i + j], dp[i] + 1);
            }
        }
        return dp[dp.length - 1];
    }
}