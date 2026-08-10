import java.util.*;

public class ValidSudoku {
    public static void main(String[] args) {
        char[][] board = { { '5', '3', '.', '.', '7', '.', '.', '.', '.' },
                { '6', '.', '.', '1', '9', '5', '.', '.', '.' }, { '.', '9', '8', '.', '.', '.', '.', '6', '.' },
                { '8', '.', '.', '.', '6', '.', '.', '.', '3' }, { '4', '.', '.', '8', '.', '3', '.', '.', '1' },
                { '7', '.', '.', '.', '2', '.', '.', '.', '6' }, { '.', '6', '.', '.', '.', '.', '2', '8', '.' },
                { '.', '.', '.', '4', '1', '9', '.', '.', '5' }, { '.', '.', '.', '.', '8', '.', '.', '7', '9' } };
        System.out.println(new Solution().isValidSudoku(board));
    }
}

class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashMap<Integer, Character> rows = new HashMap<>();
        HashMap<Integer, Character> cols = new HashMap<>();
        HashMap<Integer, Character> SubBoard = new HashMap<>();

        for (int r = 0; r < 9; r++) {
            for (int c = 0; c < 9; c++) {
                if (board[r][c] == '.') {
                    continue;
                }
                if (rows.containsValue(board[r][c]) || cols.containsValue(board[r][c])
                        || SubBoard.containsValue(board[r][c])) {
                    return false;
                }
                cols.put(c, board[r][c]);
                rows.put(c, board[r][c]);
                SubBoard.put(c, board[r][c]);
            }
        }
        return true;
    }
}