package Patterns.NeetCode150.Recursion.Algorithms.MergeSort;

import java.util.*;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = new int[] { 8, 3, 5, 4 };
        AlgorithmsMergeSort ms = new AlgorithmsMergeSort();
        ms.MergeSort(arr, 0, arr.length - 1);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}

class AlgorithmsMergeSort {
    void MergeSort(int[] arr, int left, int right) {
        if (left >= right)
            return;
        int mid = left + (right - left) / 2;
        MergeSort(arr, left, mid);
        MergeSort(arr, mid + 1, right);
        Merge(arr, left, mid, right);
    }

    void Merge(int[] arr, int left, int mid, int right) {
        ArrayList<Integer> list = new ArrayList<>();
        int low = left;
        int high = mid + 1;
        while (low <= mid && high <= right) {
            if (arr[low] <= arr[high]) {
                list.add(arr[low]);
                low++;
            } else {
                list.add(arr[high]);
                high++;
            }
        }
        while (low <= mid) {
            list.add(arr[low]);
            low++;
        }
        while (high <= right) {
            list.add(arr[high]);
            high++;
        }
        for (int i = left; i <= right; i++) {
            arr[i] = list.get(i - left);
        }
    }
}
