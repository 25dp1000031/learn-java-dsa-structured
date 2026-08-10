import java.util.*;

public class N_QueensII {
    public static void main(String[] args) {
        int n = 4;
        System.out.println(new Solution().totalNQueens(n));
    }
}

class Solution {
    public int totalNQueens(int n) {
        List<StringBuilder> board = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            board.add(new StringBuilder(".".repeat(n)));
        }
        return func(0, board, n);
    }

    public int func(int col, List<StringBuilder> board, int n) {
        if (col == n) {
            return 1;
        }

        int count = 0;

        for (int row = 0; row < n; row++) {
            if (isSafe(row, col, board, n)) {
                board.get(row).setCharAt(col, 'Q');
                count += func(col + 1, board, n);
                board.get(row).setCharAt(col, '.');
            }
        }
        return count;
    }

    public boolean isSafe(int row, int col, List<StringBuilder> board, int n) {
        // check the upper diagonal
        int duprow = row;
        int dupcol = col;
        while (row >= 0 && col >= 0) {
            if (board.get(row).charAt(col) == 'Q') {
                return false;
            }
            row--;
            col--;
        }
        row = duprow;
        col = dupcol;

        // check the column, only column needs to be checked
        while (col >= 0) {
            if (board.get(row).charAt(col) == 'Q') {
                return false;
            }
            col--;
        }

        row = duprow;
        col = dupcol;
        // check the lower diagonal
        while (row < n && col >= 0) {
            if (board.get(row).charAt(col) == 'Q') {
                return false;
            }
            row++;
            col--;
        }
        return true;
    }
}
