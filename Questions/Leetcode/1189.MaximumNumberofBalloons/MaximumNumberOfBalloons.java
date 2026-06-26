import java.util.*;

public class MaximumNumberOfBalloons {
    public static void main(String[] args) {
        String text = "loonbalxballpoon";
        Solution sol = new Solution();
        int res = sol.maxNumberOfBalloons(text);
        System.out.println(res);
    }
}

class Solution {
    public int maxNumberOfBalloons(String text) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (char i : text.toCharArray()) {
            if ("balloon".contains(String.valueOf(i))) {
                map.put(i, map.getOrDefault(i, 0) + 1);
            }
        }
        int min_value = Math.min(Math.min(map.getOrDefault('b', 0), map.getOrDefault('a', 0)),
                Math.min(map.getOrDefault('l', 0) / 2, map.getOrDefault('o', 0) / 2));
        min_value = Math.min(min_value, map.getOrDefault('n', 0));
        return min_value;
    }
}
