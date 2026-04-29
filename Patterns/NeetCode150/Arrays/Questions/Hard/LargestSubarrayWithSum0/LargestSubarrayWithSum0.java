package Patterns.NeetCode150.Arrays.Questions.Hard.LargestSubarrayWithSum0;

import java.util.HashMap;

public class LargestSubarrayWithSum0 {
    public static void main(String[] args) {
        int[] arr = { 15, -2, 2, -8, 1, 7, 10, 23 };
        Solution sol = new Solution();
        int res = sol.maxLength(arr);
        System.out.println(res);
    }
}

class Solution {
    int maxLength(int arr[]) {
        // code here
        HashMap<Integer, Integer> map = new HashMap<>();
        int prefix_sum = 0;
        int maxLen = 0;
        for (int i = 0; i < arr.length; i++) {
            prefix_sum += arr[i];

            if (prefix_sum == 0) {
                maxLen = i + 1;
            }

            int seen = prefix_sum - 0; // prefix[i] - prefix[j] = 0 // same as subarray with k sum

            if (map.containsKey(seen)) {
                maxLen = Math.max(maxLen, i - map.get(seen));
            } else {
                map.put(prefix_sum, i);
            }
        }
        return maxLen;
    }
}