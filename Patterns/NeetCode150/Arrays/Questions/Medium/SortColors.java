package Patterns.NeetCode150.Arrays.Questions.Medium;

public class SortColors {
    public static void main(String[] args) {
        int[] nums1 = { 2, 0, 2, 1, 1, 0 }; // testcase 1
        Solution.sortColors(nums1);
        for (int i : nums1) {
            System.out.print(" " + i + " ");
        }
        System.out.println();
        int[] nums2 = { 2, 0, 1 }; // testcase 2
        Solution.sortColors(nums2);
        for (int i : nums2) {
            System.out.print(" " + i + " ");
        }
    }
}

class Solution {
    public static void sortColors(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        int mid = 0;
        while (mid <= right) {
            if (nums[mid] == 0) {
                swap(nums, left, mid);
                left++;
                mid++;
            } else if (nums[mid] == 1) {
                mid++;
            } else {
                swap(nums, mid, right);
                right--;
            }
        }
    }

    public static int[] swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
        return arr;
    }
}