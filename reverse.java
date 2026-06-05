public class reverse {
    public static void main(String[] args) {
        int[] arr = new int[] { 1, 2, 3, 4, 5 };
        reverseHelper(arr);
        for (int i : arr) {
            System.out.println(i + " ");
        }
    }

    static void reverseHelper(int[] arr) {
        int left = 0;
        int right = arr.length - 1;
        while (left <= right) {
            swap(arr, left, right);
            left++;
            right--;
        }
    }

    static void swap(int arr[], int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
