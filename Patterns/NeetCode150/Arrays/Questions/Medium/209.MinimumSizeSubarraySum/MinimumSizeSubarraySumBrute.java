
public class MinimumSizeSubarraySumBrute {
    public static void main(String[] args) {
        // testcase 1
        int target = 7;
        int[] nums = { 2, 3, 1, 2, 4, 3 };
        Solution sol = new Solution();
        int res = sol.minSubArrayLen(target, nums);
        System.out.println(res); // 2
        // testcase 2
        int target2 = 11;
        int[] nums2 = { 1, 1, 1, 1, 1, 1, 1, 1 };
        int res2 = sol.minSubArrayLen(target2, nums2);
        System.out.println(res2); // 0
    }
}

// O(n^2)
class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int[] prefix = new int[nums.length];
        prefix[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            prefix[i] = prefix[i - 1] + nums[i];
        }
        int minLen = Integer.MAX_VALUE;
        for (int i = 0; i < prefix.length; i++) {
            for (int j = i; j < prefix.length; j++) {
                if (getPrefix(prefix, i, j) >= target) {
                    int len = j - i + 1;
                    minLen = Math.min(minLen, len);
                }
            }
        }
        return minLen == Integer.MAX_VALUE ? 0 : minLen;
    }

    int getPrefix(int prefix[], int first, int second) {
        if (first == 0) {
            return prefix[second];
        }
        return prefix[second] - prefix[first - 1];
    }
}