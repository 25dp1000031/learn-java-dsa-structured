package Patterns.NeetCode150.Recursion.Algorithms.QuickSort;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = { 4, 7, 2, 1, 3, 9, 8 };
        AlgorithmQuickSort.Qs(arr, 0, arr.length - 1);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}

class AlgorithmQuickSort {
    public static void Qs(int[] arr, int low, int high) {
        if (low < high) {
            int pivotIndex = Partition_Index(arr, low, high);
            Qs(arr, low, pivotIndex - 1);
            Qs(arr, pivotIndex + 1, high);
        }

    }

    public static int Partition_Index(int[] arr, int low, int high) {
        int pivot = arr[low];
        int i = low;
        int j = high;

        while (i < j) {
            while (i <= high - 1 && arr[i] <= pivot) {
                i++;
            }

            while (j >= low + 1 && arr[j] > pivot) {
                j--;
            }

            if (i < j) {
                swap(arr, i, j);
            }
        }

        swap(arr, low, j);
        return j;
    }

    public static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}