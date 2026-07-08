public class ConcatenationofArray {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 1 };
        Solution sol = new Solution();
        int[] res = sol.getConcatenation(nums);
        for (int res2 : res) {
            System.out.print(res2 + " ");
        }
    }
}

class Solution {
    public int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int[] arr = new int[2 * n];
        for (int i = 0; i < n; i++) {
            arr[i] = nums[i];
            arr[i + n] = nums[i];
        }
        return arr;
    }
}