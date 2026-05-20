public class DecodeWays {
    public static void main(String[] args) {
        String s = "123";
        System.out.println(Solution.numDecodings(s));
    }
}

class Solution {
    public static int numDecodings(String s) {
        int n = s.length();
        int dp[] = new int[n + 1];
        // edge case
        if (n == 0 || s.charAt(0) == '0') {
            return 0;
        }

        // base cases
        dp[0] = 1;
        dp[1] = 1;
        for (int i = 2; i <= n; i++) {
            // one digit check
            char one = s.charAt(i - 1);
            if (one != '0') {
                dp[i] += dp[i - 1];
            }
            // two digit check
            int two = Integer.parseInt(s.substring(i - 2, i));
            if (two >= 10 && two <= 26) {
                dp[i] += dp[i - 2];
            }
        }
        return dp[n];
    }
}