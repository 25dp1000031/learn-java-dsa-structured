
public class MinimumSizeSubarraySumOptimal {
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

class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int left = 0;
        int sum = 0;
        int minLen = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            while (sum >= target) {
                minLen = Math.min(minLen, i - left + 1);
                sum -= nums[left];
                left++;
            }
        }
        return minLen == Integer.MAX_VALUE ? 0 : minLen;
    }
}