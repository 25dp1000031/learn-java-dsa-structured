import java.util.*;

public class TaskScheduler {
    public static void main(String[] args) {

        Solution sol = new Solution();
        char[] tasks = { 'A', 'A', 'A', 'B', 'B', 'B' };
        int n = 2;
        System.out.println(sol.leastInterval(tasks, n));
    }
}

class Solution {
    public int leastInterval(char[] tasks, int n) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (char c : tasks) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        PriorityQueue<Integer> pqMax = new PriorityQueue<>(Collections.reverseOrder());
        for (Integer freq : map.values()) {
            pqMax.add(freq);
        }
        // actual unit of time to return
        int time = 0;

        while (!pqMax.isEmpty()) {
            ArrayList<Integer> list = new ArrayList<>();
            // to keep track of the gap we need to implement so its more like A _ _ A so 2 +
            // 1 right ?
            int cycle = n + 1;
            // i tells us how many slots we've filled ok
            int i = 0;
            while (i < cycle & !pqMax.isEmpty()) {
                int maxFreq = pqMax.remove();
                maxFreq--;

                if (maxFreq > 0) {
                    list.add(maxFreq);
                }
                // we processed one unit so increment time by one unit and one slot is filled so
                // we increment i by one
                time++;
                i++;
            }
            // add whatever more tasks are left into pq back
            for (int rem : list) {
                pqMax.add(rem);
            }
            // here if the tasks are still left but we have used up the slots or gap then we
            // add that to the time to say like a slot is idle
            if (!pqMax.isEmpty()) {
                time += cycle - i;
            }
        }
        return time;
    }
}