package Patterns.ApnaCollegeDSA.Arrays.Question_4;

class Single_Number {
    public static void main(String[] args) {
        Solution s = new Solution();
        // int[] nums = { 2, 2, 1 };
        s.singleNumber(new int[] { 2, 2, 1 });
    }
}

class Solution {
    public int singleNumber(int[] nums) {
        int x = 0;
        for (int n : nums) {
            x ^= n;
        }
        return x;
    }
}