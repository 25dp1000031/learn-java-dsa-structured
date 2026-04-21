import java.util.*;

public class KthLargestElementinanArray {
    public static void main(String[] args) {
        int[] nums = { 3, 2, 1, 5, 6, 4 };
        int k = 2;
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        // by default a pq is a min heap but to make it a max heap just use the
        // comparator
        // PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        // or
        // PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> b - a);
        for (int n : nums) {
            pq.add(n);
            // the heap will be built but do we need the whole of heap ? we only need the
            // last two
            if (pq.size() > k) {
                pq.poll();
            }
        }
        System.out.println(pq.peek());
        // return pq.peek();
    }
}
