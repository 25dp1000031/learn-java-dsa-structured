// package Patterns.NeetCode150.DynammicProgramming.Questions.4.FrogJumpGFG;

public class FrogJumpGFG {
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] height = new int[] { 20, 30, 40, 20 };
        int res = s.minCost(new int[] { 30, 20, 50, 10, 40 });
        System.out.println(res);
    }
}

class Solution {
    int minCost(int[] height) {
        // code here
        if (height.length == 1)
            return 0;
        int[] dp = new int[height.length];
        dp[0] = 0;
        dp[1] = Math.abs(height[1] - height[0]);
        for (int i = 2; i < dp.length; i++) {
            dp[i] = Math.min(dp[i - 2] + Math.abs(height[i] - height[i - 2]),
                    dp[i - 1] + Math.abs(height[i] - height[i - 1]));
        }
        return (dp[dp.length - 1]);
    }
}