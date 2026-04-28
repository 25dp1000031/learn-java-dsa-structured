import java.util.HashMap;

public class SubarraySumEqualsKOptimal {
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
        HashMap<Integer, Integer> prefix_Map = new HashMap<>();
        prefix_Map.put(0, 1); // base case
        int prefix_sum = 0;
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            prefix_sum += nums[i];
            int sum = prefix_sum - k;
            // we check if sum is in the hashmap
            if (prefix_Map.containsKey(sum)) {
                count += prefix_Map.get(sum);
            }
            // update the map to get the subarray count
            prefix_Map.put(prefix_sum, prefix_Map.getOrDefault(prefix_sum, 0) + 1);
        }
        return count;
    }
}