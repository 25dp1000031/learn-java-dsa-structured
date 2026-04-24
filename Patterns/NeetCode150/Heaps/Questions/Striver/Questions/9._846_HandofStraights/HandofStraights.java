import java.util.TreeMap;

public class HandofStraights {
    public static void main(String[] args) {
        Solution sol = new Solution();

        int[] hand1 = { 1, 2, 3, 6, 2, 3, 4, 7, 8 };
        int groupSize1 = 3;
        System.out.println(sol.isNStraightHand(hand1, groupSize1)); // true

        int[] hand2 = { 1, 2, 3, 4, 5 };
        int groupSize2 = 4;
        System.out.println(sol.isNStraightHand(hand2, groupSize2)); // false
    }
}

class Solution {
    public boolean isNStraightHand(int[] hand, int groupSize) {
        // edge case
        if (hand.length % groupSize != 0) {
            return false;
        }
        TreeMap<Integer, Integer> map = new TreeMap<>();
        for (int i : hand) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        while (!map.isEmpty()) {
            int start = map.firstKey();
            int freq = map.get(start);
            // sequence of x + 1, x + 2, x + 3, ..... groupSize - 1
            for (int i = 0; i < groupSize; i++) {
                int card = start + i;
                if (!map.containsKey(card) || map.get(card) < freq) {
                    return false;
                }
                // decrease the freq
                if (map.get(card) == freq) {
                    map.remove(card);
                } else {
                    map.put(card, map.get(card) - freq);
                }
            }
        }
        return true;
    }
}