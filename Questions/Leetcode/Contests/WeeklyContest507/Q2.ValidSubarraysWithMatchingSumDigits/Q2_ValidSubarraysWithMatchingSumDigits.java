public class Q2_ValidSubarraysWithMatchingSumDigits {
    public static void main(String[] args) {
        int[] nums = { 1, 100, 1 };
        int x = 1;
        Solution sol = new Solution();
        int res = sol.countValidSubarrays(nums, x);
        System.out.println(res);
    }
}

class Solution {
    public int countValidSubarrays(int[] nums, int x) {
        int count = 0;
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            long sum = 0;
            for (int j = i; j < n; j++) {
                sum += nums[j];
                if (firstDigitof(sum) == x && lastDigitof(sum) == x) {
                    count++;
                }
            }
        }
        return count;
    }

    long firstDigitof(long n) {
        while (n >= 10) {
            n /= 10;
        }
        return n;
    }

    long lastDigitof(long n) {
        n %= 10;
        return n;
    }
}