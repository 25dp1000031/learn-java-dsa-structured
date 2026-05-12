import java.util.*;

public class MinimumDeletionsToMakeCharacterFrequenciesUnique {
    public static void main(String[] args) {
        String str = "aaabbbcc";
        Solution sol = new Solution();
        System.out.println(sol.minDeletions(str));
        ;
    }
}

class Solution {
    public int minDeletions(String s) {
        TreeMap<Character, Integer> map = new TreeMap<>();
        for (char i : s.toCharArray()) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        int countDel = 0;
        Set<Integer> seen = new HashSet<>();
        for (char c : map.keySet()) {
            int freq = map.get(c);
            while (freq > 0) {
                if (!seen.contains(freq)) {
                    seen.add(freq);
                    break;
                }
                freq--;
                countDel++;

            }
        }
        return countDel;
    }
}