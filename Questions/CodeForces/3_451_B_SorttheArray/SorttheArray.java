import java.util.*;
import java.io.*;

public class SorttheArray {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        int l = 0;
        int r = n - 1;
        while (l < n - 1 && arr[l] <= arr[l + 1]) {
            l++;
        }
        if (l == n - 1) {
            System.out.println("yes");
            System.out.println("1 1");
            return;
        }
        while (r > 0 && arr[r] >= arr[r - 1]) {
            r--;
        }
        reverse(arr, l, r);
        // check if sorted now
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                System.out.println("no");
                return;
            }
        }
        System.out.println("yes");
        System.out.println((l + 1) + " " + (r + 1));
    }

    public static void reverse(int[] arr, int first, int second) {
        int left = first;
        int right = second;
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }
}