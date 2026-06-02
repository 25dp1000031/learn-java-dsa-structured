public class ReverseString {
    public static void main(String[] args) {
        char[] s = new char[] { 'h', 'e', 'l', 'l', 'o' };
        Solution.reverseString(s);
        for (char c : s) {
            System.out.println(c + " ");
        }
    }
}

class Solution {
    public static void reverseString(char[] s) {
        int ptr1 = 0;
        int ptr2 = s.length - 1;
        reverseHelper(s, ptr1, ptr2);
    }

    static void reverseHelper(char[] arr, int ptr1, int ptr2) {
        if (ptr1 >= ptr2) {
            return;
        }
        swap(arr, ptr1, ptr2);
        reverseHelper(arr, ptr1 + 1, ptr2 - 1);
    }

    static void swap(char[] arr, int first, int second) {
        char temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}