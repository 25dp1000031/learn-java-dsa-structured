import java.util.*;

public class RotateArrayOptimal {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 4, 5, 6, 7 };
        int k = 3;
        Solution sol = new Solution();
        sol.rotate(nums, k);
        for (int i : nums) {
            System.err.print(" " + i + " ");
            // 5 6 7 1 2 3 4
        }
    }
}

class Solution {
    public void rotate(int[] nums, int k) {
        if (nums.length != 1) {
            k = k % nums.length;
            reverse(nums, 0, nums.length - 1);
            reverse(nums, 0, k - 1);
            reverse(nums, k, nums.length - 1);
        }
    }

    public void reverse(int[] arr, int left, int right) {
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }
}