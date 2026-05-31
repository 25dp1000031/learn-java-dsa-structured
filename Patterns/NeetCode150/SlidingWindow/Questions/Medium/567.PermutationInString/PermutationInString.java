import java.util.HashMap;

public class PermutationInString {
    public static void main(String[] args) {
        String s1 = "ab";
        String s2 = "eidbaooo";
        System.out.println(Solution.checkInclusion(s1, s2));
    }
}

class Solution {
    public static boolean checkInclusion(String s1, String s2) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (char i : s1.toCharArray()) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        char[] arr = s2.toCharArray();
        int n = arr.length;
        int window = s1.length();
        int left = 0;
        for (int right = 0; right < n; right++) {
            map.put(arr[right], map.getOrDefault(arr[right], 0) - 1);
            if (right - left + 1 > window) {
                map.put(arr[left], map.getOrDefault(arr[left], 0) + 1);
                left++;
            }
            if (right - left + 1 == window) {
                boolean flag = true;
                for (Integer i : map.values()) {
                    if (i != 0) {
                        flag = false;
                        break;
                    }
                }
                if (flag) {
                    return true;
                }
            }
        }
        return false;
    }
}