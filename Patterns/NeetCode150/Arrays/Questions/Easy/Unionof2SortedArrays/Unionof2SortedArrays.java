package Patterns.NeetCode150.Arrays.Questions.Easy.Unionof2SortedArrays;

import java.util.ArrayList;

public class Unionof2SortedArrays {
    public static void main(String[] args) {
        int[] a = { 1, 2, 3, 4, 5 };
        int[] b = { 1, 2, 3, 6, 7 };
        ArrayList<Integer> arr = Solution.findUnion(a, b);
        for (Integer integer : arr) {
            System.out.println(" " + integer + " ");
        }
    }
}

class Solution {
    public static ArrayList<Integer> findUnion(int a[], int b[]) {
        // code here
        ArrayList<Integer> arr = new ArrayList<>();
        int p1 = 0;
        int p2 = 0;
        while (p1 < a.length && p2 < b.length) {
            if (a[p1] == b[p2]) {
                arr.add(a[p1]);
                p1++;
                p2++;
            } else if (a[p1] > b[p2]) {
                arr.add(a[p1]);
                p1++;
            } else {
                arr.add(b[p2]);
                p2++;
            }
        }
        if (p1 != a.length - 1) {
            while (p1 < a.length) {
                arr.add(a[p1]);
                p1++;
            }
        }
        if (p2 != b.length - 1) {
            while (p2 < b.length) {
                arr.add(b[p2]);
                p2++;
            }
        }
        return arr;
    }
}
