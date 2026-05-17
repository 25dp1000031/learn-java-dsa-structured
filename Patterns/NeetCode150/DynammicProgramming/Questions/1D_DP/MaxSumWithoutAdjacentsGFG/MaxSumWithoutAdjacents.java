public class MaxSumWithoutAdjacents {
    public static void main(String[] args) {
        int arr[] = { 5, 5, 10, 100, 10, 5 };
        System.out.println(Solution.findMaxSum(arr));
    }
}

class Solution {
    static int findMaxSum(int arr[]) {
        // code here
        int n = arr.length;
        if (n == 1) {
            return arr[0];
        }
        if (n == 2) {
            return Math.max(arr[0], arr[1]);
        }

        int dp[] = new int[n];
        dp[0] = arr[0];
        dp[1] = Math.max(arr[0], arr[1]);
        for (int i = 2; i < n; i++) {
            dp[i] = Math.max(dp[i - 1], dp[i - 2] + arr[i]);
        }
        return dp[n - 1];
    }
}