import java.util.*;

public class N_Queens {
    public static void main(String[] args) {
        int n = 4;
        (new Solution().solveNQueens(n)).forEach(i -> System.out.print(i + " "));
    }
}

class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> ans = new ArrayList<>();
        List<StringBuilder> board = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            board.add(new StringBuilder(".".repeat(n)));
        }
        func(0, board, ans, n);
        return ans;
    }

    public void func(int col, List<StringBuilder> board, List<List<String>> ans, int n) {
        if (col == n) {
            List<String> temp = new ArrayList<>();
            board.forEach(row -> temp.add(row.toString()));
            ans.add(temp);
            return;
        }

        for (int row = 0; row < n; row++) {
            if (isSafe(row, col, board, n)) {
                board.get(row).setCharAt(col, 'Q');
                func(col + 1, board, ans, n);
                board.get(row).setCharAt(col, '.');
            }
        }
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
