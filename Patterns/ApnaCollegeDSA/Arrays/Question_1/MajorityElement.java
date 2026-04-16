package Patterns.ApnaCollegeDSA.Arrays.Question_1;

import java.util.*;

public class MajorityElement {
    public static void main(String[] args) {
        Solution s = new Solution();
        // Boyer-Moore voting algo
        s.majorityElement(new int[] { 3, 2, 3 });
        // using hashmap
        int ans = s.majorityElementUsingHashmaps(new int[] { 3, 2, 3 });
        System.out.println(ans);
    }
}

class Solution {
    // Boyer-Moore voting algo
    public int majorityElement(int[] nums) {
        int freq = 0;
        int ans = 0;
        for (int n : nums) {
            if (freq == 0) {
                ans = n;
            }
            if (ans == n) {
                freq++;
            } else {
                freq--;
            }
        }
        return ans;
    }

    // using hashmap
    int majorityElementUsingHashmaps(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i : nums) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        int max_value = Integer.MIN_VALUE;
        int max_key = Integer.MIN_VALUE;
        for (Map.Entry<Integer, Integer> entries : map.entrySet()) {
            if (entries.getValue() > max_value) {
                max_value = entries.getValue();
                max_key = entries.getKey();
            }
        }
        return max_key; // 3
    }
}
