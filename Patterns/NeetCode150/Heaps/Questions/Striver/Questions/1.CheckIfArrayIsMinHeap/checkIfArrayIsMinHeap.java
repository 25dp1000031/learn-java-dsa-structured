import java.util.*;

public class checkIfArrayIsMinHeap {
    public static void main(String[] args) {
        solution sol = new solution();
        int[] nums1 = { 10, 20, 30, 21, 23 };
        ArrayList<Integer> arr1 = new ArrayList<>();
        for (int n : nums1) {
            arr1.add(n);
        }

        int[] nums2 = { 10, 20, 30, 25, 15 };

        ArrayList<Integer> arr2 = new ArrayList<>();
        for (int n : nums2) {
            arr2.add(n);
        }

        // printing for nums 1
        System.out.println("The Given Nums is : ");
        for (int n : nums1) {
            System.out.print(n + " ");
        }
        System.out.println();
        System.out.println("is it a heap : " + sol.isMinHeap(arr1));
        System.out.println();
        // printing for nums 2
        System.out.println("The Given Nums is : ");
        for (int n : nums2) {
            System.out.print(n + " ");
        }
        System.out.println();
        System.out.println("is it a heap : " + sol.isMinHeap(arr2));
    }
}

class solution {
    int left(int index) {
        return index * 2 + 1;
    }

    int right(int index) {
        return index * 2 + 2;
    }

    Boolean isMinHeap(ArrayList<Integer> arr) {

        for (int i = 0; i < arr.size(); i++) {
            int left = left(i);
            int right = right(i);
            int min = i;
            if (left < arr.size() && arr.get(left) < arr.get(i)) {
                min = left;
            }
            if (right < arr.size() && arr.get(right) < arr.get(i)) {
                min = right;
            }
            if (min != i) {
                return false;
            }
        }
        return true;
    }
}

// link :
// https://takeuforward.org/data-structure/check-if-an-array-represents-a-min-heap
// Input: nums = [10, 20, 30, 21, 23]
// Output: true
// Explanation: Each node has a lower or equal value than its children.

// Input: nums = [10, 20, 30, 25, 15]
// Output: false
// Explanation: The node with value 20 has a child with value 15, thus it is not
// a min-heap.