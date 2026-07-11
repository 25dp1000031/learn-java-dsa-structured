package DataStructures.Heaps.InBrief;

import java.util.*;

public class Inbrief {
    public static void main(String[] args) {

    }
}

class UnderstandingPriorityQueues {

    public static void main(String[] args) {

        // ==========================================================
        // 1. Default Priority Queue (Min Heap)
        // ==========================================================
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        pq.offer(10);
        pq.offer(5);
        pq.offer(20);
        pq.offer(1);

        System.out.println("Min Heap:");
        while (!pq.isEmpty()) {
            System.out.print(pq.poll() + " ");
        }
        // Output: 1 5 10 20

        System.out.println("\n");

        // ==========================================================
        // 2. Max Heap
        // ==========================================================
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());

        maxHeap.offer(10);
        maxHeap.offer(5);
        maxHeap.offer(20);
        maxHeap.offer(1);

        System.out.println("Max Heap:");
        while (!maxHeap.isEmpty()) {
            System.out.print(maxHeap.poll() + " ");
        }
        // Output: 20 10 5 1

        System.out.println("\n");

        // ==========================================================
        // 3. Priority Queue of int[]
        // Comparator is REQUIRED because arrays don't implement Comparable
        // ==========================================================
        // Sort according to first element
        PriorityQueue<int[]> heap = new PriorityQueue<>(
                (a, b) -> Integer.compare(a[0], b[0]));

        heap.offer(new int[] { 3, 100 });
        heap.offer(new int[] { 1, 500 });
        heap.offer(new int[] { 2, 200 });

        System.out.println("int[] sorted by first element:");

        while (!heap.isEmpty()) {
            int[] arr = heap.poll();
            System.out.println(Arrays.toString(arr));
        }

        /*
         * Output:
         * [1, 500]
         * [2, 200]
         * [3, 100]
         */

        System.out.println();

        // ==========================================================
        // 4. Sort int[] by second element
        // ==========================================================
        PriorityQueue<int[]> secondValueHeap = new PriorityQueue<>(
                (a, b) -> Integer.compare(a[1], b[1]));

        secondValueHeap.offer(new int[] { 5, 80 });
        secondValueHeap.offer(new int[] { 1, 20 });
        secondValueHeap.offer(new int[] { 2, 50 });

        System.out.println("int[] sorted by second element:");

        while (!secondValueHeap.isEmpty()) {
            System.out.println(Arrays.toString(secondValueHeap.poll()));
        }

        System.out.println();

        // ==========================================================
        // 5. Max Heap of int[]
        // ==========================================================
        PriorityQueue<int[]> maxArrayHeap = new PriorityQueue<>(
                (a, b) -> Integer.compare(b[0], a[0]));

        maxArrayHeap.offer(new int[] { 5, 10 });
        maxArrayHeap.offer(new int[] { 1, 20 });
        maxArrayHeap.offer(new int[] { 9, 30 });

        System.out.println("Max Heap of int[] by first element:");

        while (!maxArrayHeap.isEmpty()) {
            System.out.println(Arrays.toString(maxArrayHeap.poll()));
        }

        System.out.println();

        // ==========================================================
        // 6. Priority Queue of ArrayList<Integer>
        // Comparator REQUIRED
        // ==========================================================
        PriorityQueue<ArrayList<Integer>> pqList = new PriorityQueue<>(
                (a, b) -> Integer.compare(a.get(0), b.get(0)));

        pqList.offer(new ArrayList<>(Arrays.asList(3, 40)));
        pqList.offer(new ArrayList<>(Arrays.asList(1, 10)));
        pqList.offer(new ArrayList<>(Arrays.asList(2, 30)));

        System.out.println("ArrayList sorted by first element:");

        while (!pqList.isEmpty()) {
            System.out.println(pqList.poll());
        }

        System.out.println();

        // ==========================================================
        // 7. Pair-like Example (Useful in Dijkstra)
        // ==========================================================
        // {distance, node}
        PriorityQueue<int[]> dijkstraPQ = new PriorityQueue<>(
                (a, b) -> Integer.compare(a[0], b[0]));

        dijkstraPQ.offer(new int[] { 10, 1 });
        dijkstraPQ.offer(new int[] { 5, 2 });
        dijkstraPQ.offer(new int[] { 8, 3 });

        System.out.println("Dijkstra style:");

        while (!dijkstraPQ.isEmpty()) {
            int[] curr = dijkstraPQ.poll();
            System.out.println("Distance = " + curr[0] + ", Node = " + curr[1]);
        }

        System.out.println();

        // ==========================================================
        // 8. Useful Methods
        // ==========================================================
        PriorityQueue<Integer> demo = new PriorityQueue<>();

        demo.offer(10);
        demo.offer(5);
        demo.offer(15);

        System.out.println("Top element : " + demo.peek()); // 5

        System.out.println("Removed : " + demo.poll()); // 5

        System.out.println("New Top : " + demo.peek()); // 10

        System.out.println("Contains 15 : " + demo.contains(15));

        System.out.println("Size : " + demo.size());

        demo.clear();

        System.out.println("Is Empty : " + demo.isEmpty());
    }
}