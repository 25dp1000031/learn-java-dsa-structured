public class SetMatrixZeroesBetter {
    public static void main(String[] args) {
        // Example matrix
        int[][] matrix = { { 1, 1, 1 }, { 1, 0, 1 }, { 1, 1, 1 } };

        // Create Solution object
        Solution sol = new Solution();
        // Modify matrix
        sol.setZeroes(matrix);

        // Print result
        for (int[] row : matrix) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }
}

class Solution {
    public void setZeroes(int[][] matrix) {
        int rowLen = matrix.length;
        int colLen = matrix[0].length;

        int[] FlagRow = new int[rowLen];
        int[] ColRow = new int[colLen];

        for (int i = 0; i < rowLen; i++) {
            for (int j = 0; j < colLen; j++) {
                if (matrix[i][j] == 0) {
                    FlagRow[i] = 1;
                    ColRow[j] = 1;
                }
            }
        }
        for (int i = 0; i < rowLen; i++) {
            for (int j = 0; j < colLen; j++) {
                if (FlagRow[i] == 1 || ColRow[j] == 1) {
                    matrix[i][j] = 0;
                }
            }
        }
    }
}