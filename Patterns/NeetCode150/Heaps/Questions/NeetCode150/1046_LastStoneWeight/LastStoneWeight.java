import java.util.*;

public class LastStoneWeight {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] stones = { 2, 7, 4, 1, 8, 1 };
        System.out.println(sol.lastStoneWeight(stones));
    }
}

class Solution {
    public int lastStoneWeight(int[] stones) {
        // by default java has a minHeap
        if (stones.length == 0) {
            return 0;
        }

        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for (int i : stones) {
            pq.add(i);
        }
        while (pq.size() > 1) {
            int y = pq.remove();
            int x = pq.remove();

            if (y != x) {
                pq.add(y - x);
            }
        }
        if (pq.size() == 0) {
            return 0;
        } else {
            return pq.remove();
        }
    }
}