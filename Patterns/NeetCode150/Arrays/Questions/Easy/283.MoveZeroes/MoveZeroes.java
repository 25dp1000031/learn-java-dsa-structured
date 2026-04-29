public class MoveZeroes {
    public static void main(String[] args) {
        int[] nums = { 0, 1, 0, 3, 12 };
        Solution sol = new Solution();
        sol.moveZeroes(nums);
        for (int i : nums) {
            System.out.println(" " + i + " ");
        }
    }
}

class Solution {
    public void moveZeroes(int[] nums) {
        int p = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                swap(nums, p, i);
                p++;
            }
        }
    }

    // yea, java doesn't have a swap function bruh --> sike
    void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}