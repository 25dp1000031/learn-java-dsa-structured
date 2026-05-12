package Patterns.NeetCode150.Greedy.Questions.Striver.Medium.Nmeetingsinoneroom;

import java.util.*;

public class Nmeetingsinoneroom {
    public static void main(String[] args) {
        int start[] = { 1, 3, 0, 5, 8, 5 };
        int end[] = { 2, 4, 6, 7, 9, 9 };
        Solution sol = new Solution();
        System.out.println(sol.maxMeetings(start, end));
    }
}

class Solution {
    // Function to find the maximum number of meetings that can
    // be performed in a meeting room.
    public int maxMeetings(int start[], int end[]) {
        // add your code here
        List<int[]> list = new ArrayList<>();
        for (int i = 0; i < end.length; i++) {
            list.add(new int[] { end[i], start[i], i + 1 });
        }
        // sort the list by endtime
        list.sort(Comparator.comparingInt(a -> a[0]));
        ArrayList<Integer> result = new ArrayList<>();
        int lastEnd = -1;
        for (int[] m : list) {
            if (m[1] > lastEnd) {
                result.add(m[2]);
                lastEnd = m[0];
            }
        }
        return result.size();
    }
}
