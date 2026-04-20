// package Patterns.NeetCode150.DynammicProgramming.Patterns.1.LinearDP;

public interface LinearDp {
    public static void main(String[] args) {

    }
}

class explanation {
    // in this variation of dp you build the answer step by step from left to right
    // for example take climbing stairs -> we have to return a number of distinct
    // ways we can get to a goal by 1 or 2 stairs
    int climbingstairs(int n) {
        if (n <= 2) {
            // at 2 there are only 2 ways that is either 2 or 1 + 1
            // thus
            return 2;
        }
        int[] dp = new int[n + 1];
        // look for patterns here
        // to reach n --> you could either do n-1 or n-2 those are the only two
        // possibilities --> which or translates to + right ?
        // so we can do (n-1) + (n-2) --> (yes i learned this while preparing gate 2026
        // T_T)
        // now simply convert that to dp
        // thus
        dp[1] = 1;
        dp[2] = 2;
        for (int i = 3; i < dp.length; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[n];
    }

    // lets take another variation :
    int MinimumCostClimbingStairs(int[] cost) {
        // here we need to find the min cost to get to the top of the floor (we need the
        // cost not how many steps)
        // so we store the cost in the dp array and not the steps
        // so theoritically speaking each i-1 and i-2 will store its cost
        int n = cost.length;
        int[] dp = new int[n];
        dp[0] = cost[0];
        dp[1] = cost[1];
        // for 3 it woudl be like cost of 0 + cost of 1 or cost of 1 directly so same
        // thing i-1 + i-2
        for (int i = 2; i < n; i++) {
            dp[i] = cost[i] + Math.min(dp[i - 1], dp[i - 2]);
        }
        return Math.min(dp[n - 1], dp[n - 2]);
    }

    // in this question our purpose is to simply find the max robbing money by a
    // robber if he cannot rob the adjacent houses
    int rob(int[] nums) { // think what can be done here start from a base testcase
        // for example : [1,2,3,1] -- ans : 4 how ? 1 + 3 ...
        // to achieve this we need to understand which house to rob and which to not and
        // also to maximize the rob money
        // so we use a dp array to store the max rob money for that house but with a
        // variation of skipping a house
        // basically we on each house are looking at the optimal subproblem i mean not
        // each but like at every step
        int n = nums.length;
        if (n == 1)
            return nums[0];
        if (n == 1)
            return Math.max(nums[1], nums[0]);
        int[] dp = new int[n];
        dp[0] = nums[0];
        dp[1] = Math.max(nums[1], nums[0]);
        for (int i = 2; i < n; i++) {
            dp[i] = Math.max(dp[i - 1], dp[i - 2] + nums[i]);
        }
        // seems like we can just do max (dp array) but here we defined the dp array in
        // such a way that we need return the last element of the array
        // that is best till the last house
        // so
        return dp[n - 1];
    }
}

// Climbing Stairs
// Min Cost Climbing Stairs
// House Robber
// Coin Change
// Partition Equal Subset Sum
// LIS
// Decode Ways

// 🔵 3. Simple sequence DP (optional but useful)
// Longest Increasing Subsequence

// 👉 Covers:

// Medium DP pattern
// Sometimes appears as “medium/hard”
// 🟠 4. String DP (light coverage)
// Decode Ways

// 👉 Only to understand:

// String decision DP