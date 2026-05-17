public class BinarySubarraysWithSum {
    public static void main(String[] args) {
        int[] nums = { 1, 0, 1, 0, 1 };
        int goal = 2;
        int res = Solution.numSubarraysWithSum(nums, goal);
        System.out.println(res);
    }
}

class Solution {
    public static int numSubarraysWithSum(int[] nums, int goal) {
        int ans = funcHelper(nums, goal) - funcHelper(nums, goal - 1);
        return ans;
    }

    public static int funcHelper(int[] nums, int goal) {
        int subarrayCount = 0;
        int left = 0;
        int sum = 0;

        for (int right = 0; right < nums.length; right++) {
            if (goal < 0)
                return 0;
            sum += nums[right];
            while (sum > goal) {
                sum -= nums[left];
                left++;
            }
            subarrayCount += right - left + 1;
        }
        return subarrayCount;
    }
}