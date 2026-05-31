
public class NinjasTrainingDP {
    public static void main(String[] args) {
        int[][] mat = {
                { 1, 2, 5 },
                { 3, 1, 1 },
                { 3, 3, 3 }
        };
        Solution sol = new Solution();
        System.out.println(sol.maximumPoints(mat));
    }
}

class Solution {
    public int maximumPoints(int mat[][]) {
        // code here
        int n = mat.length;
        int[][] dp = new int[n][4];
        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[i].length; j++) {
                dp[i][j] = -1;
            }
            // or
            // Arrays.fill(dp[i], -1);
        }

        return func(n - 1, 3, mat, dp);
    }

    public int func(int index, int last, int[][] mat, int[][] dp) {
        if (dp[index][last] != -1) {
            return dp[index][last];
        }
        if (index == 0) {
            int maxi = 0;
            for (int task = 0; task <= 2; task++) {
                if (task != last) {
                    maxi = Math.max(maxi, mat[0][task]);
                }
            }
            dp[index][last] = maxi;
            return dp[index][last];
        }
        int maxi = 0;
        for (int task = 0; task <= 2; task++) {
            if (task != last) {
                int points = mat[index][task] + func(index - 1, task, mat, dp);
                maxi = Math.max(maxi, points);
            }
        }
        dp[index][last] = maxi;
        // return maxi;
        return dp[index][last];
    }
}