import java.util.*;

public class JumpGame_II_greedy {

    public static void main(String[] args) {
        int[] nums = { 2, 3, 1, 1, 4 };
        Solution sol = new Solution();
        int res = sol.jump(nums);
        System.out.println(res);
    }
}

class Solution {
    public int jump(int[] nums) {
        int currentRange = 0;
        int maxJump = 0;
        int jump = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            maxJump = Math.max(maxJump, nums[i] + i);
            if (i == currentRange) {
                jump++;
                currentRange = maxJump;
            }
        }
        return jump;
    }
}