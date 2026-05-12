public class NextPermutationOptimal {
    public static void main(String[] args) {
        int[] nums = { 3, 2, 1 };
        Solution sol = new Solution();
        sol.nextPermutation(nums);
        for (int i : nums) {
            System.out.print(" " + i + " ");
        }
    }
}

class Solution {
    public void nextPermutation(int[] nums) {
        int bpIdx = -1;
        // breaking point that is element that is just smaller than its next element
        for (int i = nums.length - 2; i >= 0; i--) {
            if (nums[i] < nums[i + 1]) {
                bpIdx = i;
                break;
            }
        }
        if (bpIdx == -1) {
            reverse(nums, 0, nums.length - 1);
            return;
        }
        // just greater element than breaking point
        for (int i = nums.length - 1; i > bpIdx; i--) {
            if (nums[bpIdx] < nums[i]) {
                swap(nums, bpIdx, i);
                break;
            }
        }
        // reverse the right part of the bp
        reverse(nums, bpIdx + 1, nums.length - 1);
    }

    // helper functions
    public void swap(int[] nums, int first, int second) {
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }

    public void reverse(int[] nums, int left, int right) {
        while (left < right) {
            swap(nums, left, right);
            left++;
            right--;
        }
    }
}