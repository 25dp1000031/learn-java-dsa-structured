public class JumpGame {
    public static void main(String[] args) {
        int[] nums = { 2, 3, 1, 1, 4 };
        Solution sol = new Solution();
        System.out.println(sol.canJump(nums));
    }
}

class Solution {
    public boolean canJump(int[] nums) {
        int maxJump = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i > maxJump) {
                return false;
            }
            maxJump = Math.max(maxJump, i + nums[i]);
        }
        if (maxJump >= nums.length - 1) {
            return true;
        } else {
            return false;
        }
    }
}

// explanation in onenote

class SolutionWhile {
    public boolean canJump(int[] nums) {
        int maxCurr = 0;
        int r = 0;
        int n = nums.length;
        while (r <= maxCurr && r < n) {
            maxCurr = Math.max(maxCurr, r + nums[r]);
            r++;
        }
        return (r == n);
    }
}