import java.util.*;

public class PrintingSubsequence {
    public static void main(String[] args) {
        int arr[] = new int[] { 1, 2, 3 };
        ArrayList<Integer> ds = new ArrayList<>();
        func(ds, 0, arr);
    }

    static void func(ArrayList<Integer> ds, int ind, int[] arr) {
        // base case
        int n = arr.length;
        if (ind == n) {
            for (int i : ds) {
                System.out.print(i + " ");
            }
            System.out.println();
            return;
        }
        ds.add(arr[ind]);
        // take
        func(ds, ind + 1, arr);
        ds.remove(ds.size() - 1);
        // not take
        func(ds, ind + 1, arr);
    }
}
