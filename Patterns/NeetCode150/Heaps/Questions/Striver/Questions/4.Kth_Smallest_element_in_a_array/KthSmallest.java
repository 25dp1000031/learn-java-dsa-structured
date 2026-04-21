import java.util.Collections;
import java.util.PriorityQueue;

public class KthSmallest {
    public static void main(String[] args) {
        int[] nums = { 10, 5, 4, 3, 48, 6, 2, 33, 53, 10 };
        int k = 4;
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for (int i : nums) {
            pq.add(i);
            if (pq.size() > k) {
                pq.remove();
            }
        }
        // return pq.peek();
        System.out.println(pq.peek());
    }
}
