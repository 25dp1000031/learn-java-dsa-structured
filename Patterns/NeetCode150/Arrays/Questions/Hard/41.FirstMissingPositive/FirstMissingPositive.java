import java.util.Arrays;

public class FirstMissingPositive {
    public static void main(String[] args) {
        int[] nums = { -1, -2, -3, 7, 8, 9, 11, 12 };
        Solution sol = new Solution();
        System.out.println(sol.firstMissingPositive(nums));
    }
}

class Solution {
    public int firstMissingPositive(int[] nums) {
        Arrays.sort(nums);
        int i = 0;
        while (i < 0) {
            i++;
        }
        if (nums[i] != 1) {
            return 1;
        } else {
            int max_num = nums.length - 1;
            while (max_num != 0) {
                max_num -= nums[i];
                i++;
            }
            if (nums[i] == 0) {
                return nums[nums.length - 1] + 1;
            } else {
                return max_num;
            }
        }
    }
}