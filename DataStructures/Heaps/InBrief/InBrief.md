# useful comparator snippets

```java

// Min Heap (default)
PriorityQueue<Integer> pq = new PriorityQueue<>();

// Max Heap
PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

// int[] by first element
PriorityQueue<int[]> pq = new PriorityQueue<>(
    (a, b) -> Integer.compare(a[0], b[0])
);

// int[] by second element
PriorityQueue<int[]> pq = new PriorityQueue<>(
    (a, b) -> Integer.compare(a[1], b[1])
);

// int[] by first ascending, second ascending
PriorityQueue<int[]> pq = new PriorityQueue<>(
    (a, b) -> {
        if (a[0] == b[0])
            return Integer.compare(a[1], b[1]);
        return Integer.compare(a[0], b[0]);
    }
);

// int[] by first ascending, second descending
PriorityQueue<int[]> pq = new PriorityQueue<>(
    (a, b) -> {
        if (a[0] == b[0])
            return Integer.compare(b[1], a[1]);
        return Integer.compare(a[0], b[0]);
    }
);

// ArrayList<Integer> by first element
PriorityQueue<ArrayList<Integer>> pq = new PriorityQueue<>(
    (a, b) -> Integer.compare(a.get(0), b.get(0))
);

// Strings by length
PriorityQueue<String> pq = new PriorityQueue<>(
    Comparator.comparingInt(String::length)
);

// Custom class by field
PriorityQueue<Node> pq = new PriorityQueue<>(
    Comparator.comparingInt(node -> node.distance)
);
```
