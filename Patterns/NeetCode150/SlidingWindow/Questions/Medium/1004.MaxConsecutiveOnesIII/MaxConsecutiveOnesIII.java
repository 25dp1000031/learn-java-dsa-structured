public class MaxConsecutiveOnesIII {
    public static void main(String[] args) {
        int[] nums = { 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 0, 0, 0, 1, 1, 1, 1 };
        int k = 3;
        System.out.println(Solution.longestOnes(nums, k));
    }
}

class Solution {
    public static int longestOnes(int[] nums, int k) {
        int left = 0;
        int maxCount = 0;
        int zeroCount = 0;
        for (int right = 0; right < nums.length; right++) {
            if (nums[right] == 0) {
                zeroCount++;
            }
            while (zeroCount > k) {
                while (nums[left] != 0) {
                    left++;
                }
                zeroCount--;
                left++;
            }
            int currMax = right - left + 1;
            maxCount = Math.max(maxCount, currMax);
        }
        return maxCount;
    }
}