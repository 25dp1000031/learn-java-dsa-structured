import java.util.*;

public class LongestRepeatingCharacterReplacement {
    public static void main(String[] args) {
        String s = "ABAB";
        int k = 2;
        int res = Solution.characterReplacement(s, k);
        System.out.println(res);
    }
}

class Solution {
    public static int characterReplacement(String s, int k) {
        char[] arr = s.toCharArray();
        int maxLenCount = 0;
        int left = 0;
        int n = arr.length;
        int maxFreq = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        for (int right = 0; right < n; right++) {
            map.put(arr[right], map.getOrDefault(arr[right], 0) + 1);
            maxFreq = Math.max(maxFreq, map.get(arr[right]));
            while ((right - left + 1) - maxFreq > k) {
                map.put(arr[left], map.get(arr[left]) - 1);
                if (map.get(arr[left]) == 0) {
                    map.remove(arr[left]);
                }
                left++;
            }
            maxLenCount = Math.max(maxLenCount, right - left + 1);
        }
        return maxLenCount;
    }
}