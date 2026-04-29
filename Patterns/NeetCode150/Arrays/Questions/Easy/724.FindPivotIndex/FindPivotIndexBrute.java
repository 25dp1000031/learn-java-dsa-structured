public class FindPivotIndexBrute {
    public static void main(String[] args) {
        int[] nums = { 1, 7, 3, 6, 5, 6 };
        Solution sol = new Solution();
        System.out.println(sol.pivotIndex(nums));
    }
}

class Solution {
    public int pivotIndex(int[] nums) {
        int[] prefix_arr = new int[nums.length];
        prefix_arr[0] = nums[0];

        for (int i = 1; i < prefix_arr.length; i++) {
            prefix_arr[i] = prefix_arr[i - 1] + nums[i];
        }

        for (int i = 0; i < nums.length; i++) {
            int left = getPrefix(prefix_arr, 0, i - 1);
            int right = getPrefix(prefix_arr, i + 1, nums.length - 1);

            if (left == right) {
                return i;
            }
        }
        return -1;
    }

    int getPrefix(int[] prefix_arr, int first, int second) {
        if (first > second) {
            return 0;
        }
        if (first == 0) {
            return prefix_arr[second];
        }
        return prefix_arr[second] - prefix_arr[first - 1];
    }
}