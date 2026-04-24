import java.util.*;

public class TopKFrequentElements {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] nums = { 1, 1, 1, 2, 2, 3 };
        /*
         * ArrayList<Integer> nums2 = new ArrayList<>();
         * for (int i : nums) {
         * nums2.add(i);
         * }
         */
        int k = 2;
        int[] result = sol.topKFrequent(nums, k);
        System.out.print("[");
        for (int i : result) {
            System.out.print(" " + i + " ");
        }
        System.out.print("]");
    }
}

class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        // by default java pq is a min heap dont forget we did and it took hours to
        // debug
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder()); // maxheap and not minheap
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] list = new int[k];
        for (int i : nums) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        for (Integer values : map.values()) {
            pq.add(values);
        }
        for (int i = 0; i < k; i++) {
            int value = pq.remove();
            for (int key : map.keySet()) {
                if (map.get(key) == value) {
                    list[i] = key;
                    map.remove(key);
                    break;
                }
            }
        }
        return list;
    }
}