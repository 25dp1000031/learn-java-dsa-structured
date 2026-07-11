import java.util.ArrayList;
import java.util.Arrays;

public class SortAnArray {
    public static void main(String[] args) {
        int[] nums = { 5, 2, 3, 1 };
        Solution sol = new Solution();
        int[] arr = sol.sortArray(nums);
        Arrays.stream(arr).forEach(a -> System.out.print(a + " "));
    }
}

class Solution {
    public int[] sortArray(int[] nums) {
        MergeSort(nums, 0, nums.length - 1);
        return nums;
    }

    public void MergeSort(int[] arr, int left, int right) {
        if (left >= right) {
            return;
        }
        int mid = left + (right - left) / 2;
        MergeSort(arr, left, mid);
        MergeSort(arr, mid + 1, right);
        merge(arr, left, mid, right);
    }

    public void merge(int[] arr, int left, int mid, int right) {
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