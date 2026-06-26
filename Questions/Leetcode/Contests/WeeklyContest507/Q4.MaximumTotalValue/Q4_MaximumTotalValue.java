import java.util.*;

public class Q4_MaximumTotalValue {
    public static void main(String[] args) {
        int[] value = { 6, 5, 4 };
        int[] decay = { 2, 1, 1 };
        int m = 4;
        Solution sol = new Solution();
        int res = sol.maxTotalValue(value, decay, m);
        System.out.println(res);
    }
}

class Solution {
    public int maxTotalValue(int[] value, int[] decay, int m) {
        PriorityQueue<long[]> pq = new PriorityQueue<>((a, b) -> Long.compare(b[0], a[0]));

        for (int i = 0; i < decay.length; i++) {
            pq.add(new long[] { value[i], decay[i] });
        }
        long total = 0;
        while (m-- > 0 && !pq.isEmpty()) {
            long[] x = pq.remove();
            long val = x[0];
            long dec = x[1];

            if (val <= 0) {
                continue;
            }

            total = (total + val) % 1_000_000_007;
            pq.add(new long[] { val - dec, dec });
        }
        return (int) total;

    }
}