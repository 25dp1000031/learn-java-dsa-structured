import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.IntStream;

public class UnderStandingTheMostImportantAlgorithmsInBrief {
    public static void main(String[] args) {
        // new BinarySearch(new int[] { 5, 6, 7, 8, 9 }, 5, 7);
        new MergeSort(5, new int[] { 7, 4, 3, 8, 1 });
    }
}

class BinarySearch {
    int n;
    int[] arr;
    int target;

    BinarySearch(int[] arr, int n, int target) {
        this.target = target;
        this.n = n;
        this.arr = arr;
        System.out.println("BinarySearch Recursive : " + bsRecursive(arr, 0, n - 1, target));
        System.out.println("BinarySearch WhileLoop : " + bsLoop(arr, n, target));
    }

    int bsRecursive(int[] arr, int left, int right, int target) {
        if (left > right) {
            return -1;
        }
        int mid = left + (right - left) / 2;
        if (arr[mid] == target) {
            return mid;
        } else if (arr[mid] < target) {
            return bsRecursive(arr, mid + 1, right, target);
        } else {
            return bsRecursive(arr, left, mid - 1, target);
        }
    }

    int bsLoop(int[] arr, int n, int target) {
        int left = 0;
        int right = n - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }
}

class MergeSort {
    int[] arr;
    int n;

    MergeSort(int n, int[] arr) {
        this.arr = arr;
        this.n = n;
        ms(arr, 0, n - 1);
        System.out.print("(MergeSort) Sorted arr : [");
        IntStream.range(0, n).forEach(i -> {
            System.out.print(i != (n - 1) ? arr[i] + ", " : arr[i]);
        });
        System.out.print("]");
    }

    void ms(int[] arr, int left, int right) {
        if (left >= right) {
            return;
        }
        int mid = left + (right - left) / 2;
        ms(arr, left, mid);
        ms(arr, mid + 1, right);
        merge(arr, left, mid, right);
    }

    void merge(int[] arr, int left, int mid, int right) {
        int low = left;
        int high = mid + 1;
        ArrayList<Integer> list = new ArrayList<>();
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