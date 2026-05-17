import java.util.*;

public class LongestSubstringWithoutRepeatingCharacters {
    public static void main(String[] args) {
        String s = "pwwkew";
        System.out.println(Solution.lengthOfLongestSubstring(s));
    }
}

class Solution {
    public static int lengthOfLongestSubstring(String s) {
        int left = 0;
        char[] arr = s.toCharArray();
        HashSet<Character> set = new HashSet<>();
        int maxCount = 0;
        for (char right : arr) {
            while (set.contains(right)) {
                set.remove(arr[left]);
                left++;
            }
            set.add(right);
            maxCount = Math.max(maxCount, set.size());
        }
        return maxCount;
    }
}