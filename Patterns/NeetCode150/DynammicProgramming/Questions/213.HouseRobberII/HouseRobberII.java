public class HouseRobberII {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 1 };
        Solution sol = new Solution();
        int res = sol.rob(nums);
        System.out.println(res);
    }
}

class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        if (n == 1) {
            return nums[0];
        }
        // case 1 = excluding first
        int ans1 = robHelper(nums, 1, n - 1);
        // case 2 = excluding last
        int ans2 = robHelper(nums, 0, n - 2);
        return Math.max(ans1, ans2);
    }

    public int robHelper(int[] arr, int start, int end) {
        int n = end + 1;
        int[] dp = new int[n];
        dp[start] = arr[start];
        dp[start + 1] = Math.max(arr[start], arr[start + 1]);
        for (int i = start + 2; i <= end; i++) {
            dp[i] = Math.max(dp[i - 1], dp[i - 2] + arr[i]);
        }
        return dp[n - 1];
    }
}