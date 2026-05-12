import java.util.*;

public class ArrayLeaders {
    public static void main(String[] args) {
        int[] arr = { 16, 17, 4, 3, 5, 2 };
        ArrayList<Integer> res = new ArrayList<>();
        res = Solution.leaders(arr);
        for (Integer integer : res) {
            System.out.print(" " + integer + " ");
        }
    }
}

class Solution {
    static ArrayList<Integer> leaders(int arr[]) {
        // code here
        int n = arr.length - 1;
        int maxRight = Integer.MIN_VALUE;
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] >= maxRight) {
                list.add(arr[i]);
            }
            // update maxRight
            maxRight = Math.max(maxRight, arr[i]);
        }
        reverse(list, 0, list.size() - 1);
        return list;
    }

    // i should have just used Collections.reverse(list) // but im stupid
    public static void reverse(ArrayList<Integer> list, int left, int right) {
        while (left < right) {
            swap(list, left, right);
            left++;
            right--;
        }
    }

    public static void swap(ArrayList<Integer> list, int first, int second) {
        int temp = list.get(first);
        list.set(first, list.get(second));
        list.set(second, temp);
    }
}