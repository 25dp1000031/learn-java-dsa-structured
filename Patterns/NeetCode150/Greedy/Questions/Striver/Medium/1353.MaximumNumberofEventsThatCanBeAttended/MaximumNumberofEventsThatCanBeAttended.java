import java.util.*;

public class MaximumNumberofEventsThatCanBeAttended {
    public static void main(String[] args) {
        int[][] events = { { 1, 2 }, { 2, 3 }, { 3, 4 } };
        Solution sol = new Solution();
        System.out.println(sol.maxEvents(events));
    }
}

class Solution {
    public int maxEvents(int[][] events) {
        ArrayList<int[]> list = new ArrayList<>();
        for (int i = 0; i < events.length; i++) {
            list.add(new int[] { events[i][1], events[i][0], i + 1 });
        }
        list.sort(Comparator.comparingInt(a -> a[0]));
        ArrayList<Integer> res = new ArrayList<>();
        int lastTime = -1;
        for (int[] m : list) {
            if (m[0] > m[1] && m[0] > lastTime) {
                res.add(m[2]);
                lastTime = m[0];
            }
        }
        return res.size();
    }
}