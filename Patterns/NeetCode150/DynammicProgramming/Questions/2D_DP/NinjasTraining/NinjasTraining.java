public class NinjasTraining {
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
        return func(n - 1, 3, mat);
    }

    public int func(int index, int last, int[][] mat) {
        if (index == 0) {
            int maxi = 0;
            for (int task = 0; task <= 2; task++) {
                if (task != last) {
                    maxi = Math.max(maxi, mat[0][task]);
                }
            }
            return maxi;
        }
        int maxi = 0;
        for (int task = 0; task <= 2; task++) {
            if (task != last) {
                int points = mat[index][task] + func(index - 1, task, mat);
                maxi = Math.max(maxi, points);
            }
        }
        return maxi;
    }
}