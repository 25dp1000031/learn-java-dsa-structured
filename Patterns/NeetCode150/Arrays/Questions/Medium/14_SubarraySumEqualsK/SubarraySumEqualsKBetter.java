public class SubarraySumEqualsKBetter {
    public static void main(String[] args) {
        // Input array
        int[] arr = { 3, 1, 2, 4 };

        // Target sum
        int k = 6;

        // Create Solution object
        Solution sol = new Solution();

        // Call function and store result
        int result = sol.subarraySum(arr, k);

        // Print the count of subarrays
        System.out.println("The number of subarrays is: " + result);
    }
}

class Solution {
    public int subarraySum(int[] nums, int k) {
        int[] prefix = new int[nums.length];
        prefix[0] = nums[0];
        for (int i = 1; i < prefix.length; i++) {
            prefix[i] = nums[i] + prefix[i - 1];
        }

        int n = nums.length;
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i; j < nums.length; j++) {
                int sum = 0;
                sum += getPrefix(prefix, i, j);
                if (sum == k) {
                    count++;
                }
            }
        }
        return count;
    }

    public int getPrefix(int[] arr, int first, int second) {
        if (first == 0) {
            return arr[second];
        }
        return arr[second] - arr[first - 1];
    }
}