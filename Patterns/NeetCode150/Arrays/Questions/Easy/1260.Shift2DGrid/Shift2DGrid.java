import java.util.*;

public class Shift2DGrid {
    public static void main(String[] args) {
        int[][] grid = { { 3, 8, 1, 9 }, { 19, 7, 2, 5 }, { 4, 6, 11, 10 }, { 12, 0, 21, 13 } };
        int k = 4;
        Solution sol = new Solution();
        sol.shiftGrid(grid, k).stream().forEach((i) -> System.out.print(i + " "));
    }
}

class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        int rows = grid.length;
        int cols = grid[0].length;
        int[][] arr = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                int index = i * cols + j;
                int newIndex = (index + k) % (rows * cols);
                int newRow = newIndex / cols;
                int newCol = newIndex % cols;
                arr[newRow][newCol] = grid[i][j];
            }
        }
        List<List<Integer>> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            List<Integer> temp = new ArrayList<>();
            for (int j = 0; j < arr[0].length; j++) {
                temp.add(arr[i][j]);
            }
            list.add(temp);
        }
        return list;
    }
}