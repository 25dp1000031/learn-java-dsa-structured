import java.util.HashMap;

public class NumberOfSubstringsContainingAllThreeCharacters {
    public static void main(String[] args) {
        String s = "abcabc";
        System.out.println(Solution.numberOfSubstrings(s));
    }
}

class Solution {
    public static int numberOfSubstrings(String s) {
        char[] arr = s.toCharArray();
        int left = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        int arraysCount = 0;
        int n = arr.length;
        for (int right = 0; right < n; right++) {
            map.put(arr[right], map.getOrDefault(arr[right], 0) + 1);
            while (map.getOrDefault('a', 0) >= 1 && map.getOrDefault('b', 0) >= 1 && map.getOrDefault('c', 0) >= 1) {
                arraysCount += n - right;
                map.put(arr[left], map.get(arr[left]) - 1);
                left++;
            }
        }
        return arraysCount;
    }
}