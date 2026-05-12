public class ProductofArrayExceptSelf {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 4 };
        Solution sol = new Solution();
        int[] res = sol.productExceptSelf(nums);
        for (int i : res) {
            System.out.print(" " + i + " ");
        }
    }
}

class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] answer = new int[n];

        // prefix
        answer[0] = 1;
        for (int i = 1; i < n; i++) {
            answer[i] = answer[i - 1] * nums[i - 1];
        }

        // suffix
        int right = 1;
        for (int j = n - 1; j >= 0; j--) {
            answer[j] *= right;
            right *= nums[j];
        }
        return answer;
    }
}