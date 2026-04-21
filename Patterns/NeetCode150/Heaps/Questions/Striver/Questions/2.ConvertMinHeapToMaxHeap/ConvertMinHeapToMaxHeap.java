import java.util.ArrayList;

public class ConvertMinHeapToMaxHeap {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4 };
        Solution sol = new Solution();
        for (int i = (arr.length / 2) - 1; i >= 0; i--) {
            sol.Heapify(i, arr);
        }
        sol.printArray(arr, arr.length);
    }
}

class Solution {

    int parent(int index) {
        return index / 2;
    }

    int left(int index) {
        return index * 2 + 1;
    }

    int right(int index) {
        return index * 2 + 2;
    }

    void swap(int first, int second, int[] arr) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    void Heapify(int index, int arr[]) {
        int left = left(index);
        int right = right(index);
        int max = index;
        if (left < arr.length && arr[left] > arr[max]) {
            max = left;
        }
        if (right < arr.length && arr[right] > arr[max]) {
            max = right;
        }
        if (max != index) {
            swap(index, max, arr);
            Heapify(max, arr);
        }
    }

    void printArray(int arr[], int size) {
        for (int i = 0; i < size; ++i)
            System.out.print(arr[i] + " ");
    }
}