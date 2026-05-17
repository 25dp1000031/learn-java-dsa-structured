import java.util.*;

public class PartitionEqualsSubsetSumMemoization {
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
        sum /= 2;
        int[][] dp = new int[n][sum + 1];
        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }
        boolean res = knapSack(n - 1, sum, nums, dp);
        return res;
    }

    public static boolean knapSack(int index, int target, int[] arr, int[][] dp) {
        // base cases :
        if (target == 0)
            return true;
        if (index == 0)
            return (arr[index] == target);
        // pre computation
        if (dp[index][target] != -1) {
            return dp[index][target] == 1;
        }
        // Not Taken
        boolean notTaken = knapSack(index - 1, target, arr, dp);
        boolean Taken = false;
        if (arr[index] <= target) {
            Taken = knapSack(index - 1, target - arr[index], arr, dp);
        }
        boolean res = Taken || notTaken;
        if (res) {
            dp[index][target] = 1;
        } else {
            dp[index][target] = 0;
        }
        return res;
    }
}