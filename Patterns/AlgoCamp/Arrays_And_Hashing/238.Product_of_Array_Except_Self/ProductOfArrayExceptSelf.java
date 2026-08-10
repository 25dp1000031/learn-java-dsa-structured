import java.util.*;

public class ProductOfArrayExceptSelf {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 4 };
        Solution sol = new Solution();
        Arrays.stream(sol.productExceptSelf(nums)).forEach((i) -> System.out.print(i + " "));
    }
}

class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] prefixProductArr = new int[n];
        int[] suffixProductArr = new int[n];

        prefixProductArr[0] = nums[0];
        for (int i = 1; i < n; i++) {
            prefixProductArr[i] = prefixProductArr[i - 1] * nums[i];
        }
        suffixProductArr[n - 1] = nums[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            suffixProductArr[i] = nums[i] * suffixProductArr[i + 1];
        }
        int[] ans = new int[n];
        ans[0] = suffixProductArr[1];
        ans[n - 1] = prefixProductArr[n - 2];
        for (int i = 1; i < n - 1; i++) {
            ans[i] = prefixProductArr[i - 1] * suffixProductArr[i + 1];
        }
        return ans;
    }
}