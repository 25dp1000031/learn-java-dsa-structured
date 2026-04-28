import java.util.*;

public class MaximumSumCombination {
    public static void main(String[] args) {
        Solution obj = new Solution();
        int[] nums1 = { 7, 3 };
        int[] nums2 = { 1, 6 };
        int k = 2;

        List<Integer> result = obj.topKSumPairs(nums1, nums2, k);
        for (int val : result) {
            System.out.print(val + " ");
        }
        System.out.println();
    }
}

class Solution {
    public ArrayList<Integer> topKSumPairs(int[] a, int[] b, int k) {
        // now the last elements are going to the largest now to check which in both ?
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for (int i : a) {
            for (int j : b) {
                int sum = i + j;
                minHeap.add(sum);
                if (minHeap.size() > k) {
                    minHeap.remove();
                }
            }
        }
        ArrayList<Integer> list = new ArrayList<>();
        while (!minHeap.isEmpty()) {
            list.add(minHeap.remove());
        }
        Collections.reverse(list);
        return list;
    }
}

// exceeds the time limit
