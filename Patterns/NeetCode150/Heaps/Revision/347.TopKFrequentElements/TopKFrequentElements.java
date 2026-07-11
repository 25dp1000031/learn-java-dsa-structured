import java.util.*;

public class TopKFrequentElements {
    public static void main(String[] args) {
        int[] nums = { 1, 1, 1, 2, 2, 3 };
        int k = 2;
        Solution sol = new Solution();
        Arrays.stream(sol.topKFrequent(nums, k)).forEach(i -> System.out.print(i + " "));
    }
}

class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        Arrays.stream(nums).forEach(i -> map.put(i, map.getOrDefault(i, 0) + 1));
        PriorityQueue<int[]> minHeap = new PriorityQueue<>((a, b) -> Integer.compare(b[1], a[1]));
        map.forEach((key, value) -> minHeap.add(new int[] { key, value }));
        int[] res = new int[k];
        for (int i = 0; i < k; i++) {
            res[i] = minHeap.poll()[0];
        }
        return res;
    }
}
