import java.util.*;

public class Q1_MaximumManhattanDistanceAfterAllMoves {
    public static void main(String[] args) {
        String moves = "U_R";
        Solution sol = new Solution();
        int res = sol.maxDistance(moves);
        System.out.println(res);
    }
}

class Solution {
    public int maxDistance(String moves) {
        int x = 0;
        int y = 0;
        int z = 0;
        for (char c : moves.toCharArray()) {
            if (c == 'U') {
                y += 1;
            } else if (c == 'D') {
                y -= 1;
            } else if (c == 'L') {
                x -= 1;
            } else if (c == 'R') {
                x += 1;
            } else {
                z++;
            }
        }
        int formula = Math.abs(x) + Math.abs(y);
        return formula + z;
    }
}