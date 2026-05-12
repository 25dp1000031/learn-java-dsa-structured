import java.util.*;
import java.io.*;;

public class DreamoonAndStairs {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        System.out.println(Solution.climb(n, m));
    }
}

class Solution {
    static int climb(int n, int m) {
        // int maxMoves = n;
        int minMoves = (n + 1) / 2;

        int res = minMoves;
        while (res <= n) {
            if (res % m == 0) {
                return res;
            }
            res++;
        }
        return -1;
    }
}