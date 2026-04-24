import java.util.*;

class Solution {
    public static void main(String[] args) {
        int[] nums = { 4, 3, 2, 7, 8, 2, 3, 1 };
        Solution s = new Solution();
        List<Integer> arr = s.findDuplicates(nums);
        for (Integer integer : arr) {
            System.out.print(integer + " ");
        }
    }

    public List<Integer> findDuplicates(int[] nums) {
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            int index = Math.abs(nums[i]) - 1;
            if (nums[index] < 0) {
                arr.add(Math.abs(nums[i]));
            } else {
                nums[index] = -nums[index];
            }
        }
        return arr;
    }
}