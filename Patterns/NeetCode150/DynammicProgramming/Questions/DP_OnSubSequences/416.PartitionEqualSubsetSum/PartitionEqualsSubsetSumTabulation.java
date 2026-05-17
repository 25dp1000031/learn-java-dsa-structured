public class PartitionEqualsSubsetSumTabulation {
    public static void main(String[] args) {
        int[] nums = { 1, 5, 11, 5 };
        System.out.println(Solution.canPartition(nums));
    }
}

class Solution {
    public static boolean canPartition(int[] nums) {
        int n = nums.length;
        int sum = 0;
        for (int i : nums) {
            sum += i;
        }
        if (sum % 2 != 0) {
            return false;
        }
        int target = sum / 2;
        boolean[][] dp = new boolean[n][target + 1];
        for (int i = 0; i < dp.length; i++) {
            dp[i][0] = true;
        }
        if (nums[0] <= target) {
            dp[0][nums[0]] = true;
        }
        for (int index = 1; index < dp.length; index++) {
            for (int k = 1; k <= target; k++) {
                boolean notTaken = dp[index - 1][k];
                boolean Taken = false;
                if (nums[index] <= k) {
                    Taken = dp[index - 1][k - nums[index]];
                }
                dp[index][target] = notTaken || Taken;
            }
        }
        return dp[n - 1][target];
    }
}