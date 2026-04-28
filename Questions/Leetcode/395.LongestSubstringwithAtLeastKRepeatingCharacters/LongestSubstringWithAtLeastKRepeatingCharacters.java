import java.util.*;

public class LongestSubstringWithAtLeastKRepeatingCharacters {
    public static void main(String[] args) {
        String s = "aaabb";
        int k = 3;
        Solution sol = new Solution();
        System.out.println(sol.longestSubstring(s, k));
    }

}

class Solution {
    public int longestSubstring(String s, int k) {
        int left = 0;
        int right = 0;
        int count = 0;
        int max_count = 0;
        if (s.length() == 1 && k == 1) {
            return 1;
        }
        HashMap<Character, Integer> map = new HashMap<>();
        char[] arr = s.toCharArray();
        while (right < s.length()) {
            map.put(arr[right], map.getOrDefault(arr[right], 0) + 1);
            boolean flag = true;
            for (char key : map.keySet()) {
                if (map.get(key) < k) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                count = right - left;
                max_count = Math.max(max_count, count);
            }
            right++;
        }
        if (max_count == 0) {
            return 0;
        }
        return max_count + 1;
    }
}