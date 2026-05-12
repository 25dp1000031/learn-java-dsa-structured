import java.util.*;

public class MinimumNumberofFrogsCroaking {
    public static void main(String[] args) {
        String croakOfFrogs = "crcoakroak";
        Solution sol = new Solution();
        System.out.println(sol.minNumberOfFrogs(croakOfFrogs));
        ;
    }
}

class Solution {
    public int minNumberOfFrogs(String croakOfFrogs) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (char c : croakOfFrogs.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        int check = map.get('c');
        if (map.size() > 5) {
            return -1;
        }
        for (char c : map.keySet()) {
            if (map.get(c) != check) {
                return -1;
            }
        }
        return check;
    }
}

// same as minimum platforms