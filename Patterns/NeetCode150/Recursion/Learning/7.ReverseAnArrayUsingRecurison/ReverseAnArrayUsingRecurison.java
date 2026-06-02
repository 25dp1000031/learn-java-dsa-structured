public class ReverseAnArrayUsingRecurison {
    public static void main(String[] args) {
        int[] arr = new int[] { 1, 2, 3, 4, 2 };
        reverse(arr, 0, arr.length - 1);
        for (int i : arr) {
            System.out.println(i + " ");
        }
    }

    public static void reverse(int[] arr, int ptr, int ptr2) {
        if (ptr == ptr2) {
            return;
        }
        swap(ptr, ptr2, arr);
        reverse(arr, ptr + 1, ptr2 - 1);
    }

    public static void swap(int first, int second, int[] arr) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
