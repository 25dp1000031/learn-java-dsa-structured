import java.util.*;

public class MinimumNumberofPushesToTypeWordII {
    public static void main(String[] args) {
        String word = "xyzxyzxyzxyz";
        System.out.println(new Solution().minimumPushes(word));
    }
}

class Solution {
    public int minimumPushes(String word) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < word.length(); i++) {
            map.put(word.charAt(i), map.getOrDefault(word.charAt(i), 0) + 1);
        }
        PriorityQueue<box> maxHeap = new PriorityQueue<>((a, b) -> (b.value - a.value));
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            Character k = entry.getKey();
            int value = entry.getValue();
            maxHeap.add(new box(k, value));
        }
        int n = 0;
        int ans = 0;
        while (!maxHeap.isEmpty()) {
            int curr_val = maxHeap.poll().value;
            n++;
            if (n <= 8) {
                ans += curr_val;
            } else if (n <= 16) {
                ans += curr_val * 2;
            } else if (n <= 24) {
                ans += curr_val * 3;
            } else {
                ans += curr_val * 4;
            }
        }
        return ans;
    }
}

class box {
    Character c;
    int value;

    box(Character c, int value) {
        this.c = c;
        this.value = value;
    }
}