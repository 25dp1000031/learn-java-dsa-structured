import java.util.*;

public class ClimbingStairs {
    public static void main(String[] args) {
        int n = 3;
        int res = SolutionWithArrayList.climbStairs(n);
        System.out.println("With ArrayList : " + res);
        int res2 = SolutionWithArray.climbStairs(n);
        System.out.println("With Array : " + res2);
    }
}

class SolutionWithArrayList {
    public static int climbStairs(int n) {
        if (n == 1) {
            return 1;
        }
        if (n == 2) {
            return 2;
        }

        ArrayList<Integer> dp = new ArrayList<>();
        dp.add(1);
        dp.add(2);
        for (int i = 2; i < n; i++) {
            int cal = dp.get(i - 2) + dp.get(i - 1);
            dp.add(cal);
        }
        return dp.get(dp.size() - 1);
    }
}

class SolutionWithArray {
    public static int climbStairs(int n) {
        if (n == 1) {
            return 1;
        }
        if (n == 2) {
            return 2;
        }

        int[] dp = new int[n];
        dp[0] = 1;
        dp[1] = 2;
        for (int i = 2; i < n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[dp.length - 1];
    }
}