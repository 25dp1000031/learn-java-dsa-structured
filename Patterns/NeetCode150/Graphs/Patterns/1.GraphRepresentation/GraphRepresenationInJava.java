import java.util.*;

// u and v denote two specific nodes in a graph
public class GraphRepresenationInJava {
    public static void main(String[] args) {
        AdjList.func();
    }
}

class AdjMatrix {
    public static void func() {
        int n = 3, m = 3;
        int adj[][] = new int[n + 1][n + 1];

        // edge 1--2
        adj[1][2] = 1;
        adj[2][1] = 1;

        // edge 2--3
        adj[2][3] = 1;
        adj[3][2] = 1;

        // edge 1--3
        adj[1][3] = 1;
        adj[3][1] = 1;

        // its more like
        // adj[u][v] = 1;
        // adj[v][u] = 1;
    }
}

class AdjList {
    public static void func() {
        int n = 3, m = 3;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        // we create n + 1 nested arrayList
        for (int i = 0; i <= n; i++) {
            adj.add(new ArrayList<Integer>());
        }

        // edge 1--2
        adj.get(1).add(2);
        adj.get(2).add(1);

        // edge 2--3
        adj.get(2).add(3);
        adj.get(3).add(2);

        // edge 1--3
        adj.get(1).add(3);
        adj.get(3).add(1);

        // its more like
        // adj.get(u).add(v)
        // adj.get(v).add(v)

        for (int i = 1; i < n; i++) {
            for (int j = 0; j < adj.get(i).size(); j++) {
                System.out.print(adj.get(i).get(j) + " ");
            }
            System.out.println();
        }
    }
}

class Grid {
    // given us as
    // 1 1 0
    // 0 1 0
    // 1 0 1
    // for example here 1 is like land and 0 is water
    // each cell is a node -> here 9 nodes
}