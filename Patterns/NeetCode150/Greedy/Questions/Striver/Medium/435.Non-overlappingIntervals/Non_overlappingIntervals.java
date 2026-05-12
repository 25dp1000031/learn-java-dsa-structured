import java.util.*;

public class Non_overlappingIntervals {
    public static void main(String[] args) {
        int[][] intervals = { { 1, 2 }, { 2, 3 }, { 3, 4 }, { 1, 3 } };
        Solution sol = new Solution();
        System.out.println(sol.eraseOverlapIntervals(intervals));
    }
}

class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> a[1] - b[1]);

        int count = 0;
        int lastEnd = Integer.MIN_VALUE;
        for (int[] i : intervals) {
            if (i[0] >= lastEnd) {
                count++;
                lastEnd = i[1];
            }
        }
        return intervals.length - count;
    }
}