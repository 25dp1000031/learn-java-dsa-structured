public class ValidPalindrome {
    public static void main(String[] args) {
        String s = "race a car";
        boolean res = Solution.isPalindrome(s);
        System.out.println(SolutionCleaner.isPalindrome(s));
        System.out.println(res);
    }
}

class Solution {
    public static boolean isPalindrome(String s) {
        String resTrim = Trim(s);
        char[] temp = reverse(resTrim.toCharArray(), 0);
        StringBuilder sb = new StringBuilder();
        sb.append(temp);
        if (sb.toString().equals(resTrim)) {
            return true;
        } else {
            return false;
        }
    }

    static String Trim(String s) {
        String res = (s.replaceAll("[^a-zA-Z0-9]", "")).toLowerCase();
        return res;
    }

    static char[] reverse(char[] arr, int ptr) {
        int ptr2 = arr.length - ptr - 1;
        if (ptr >= ptr2) {
            return arr;
        }
        swap(arr, ptr, ptr2);
        reverse(arr, ptr + 1);
        return arr;
    }

    static void swap(char[] arr, int first, int second) {
        char temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}

// i know too big of code but hey its a learning experience

class SolutionCleaner {
    static String Trim(String s) {
        String res = (s.replaceAll("[^a-zA-Z0-9]", "")).toLowerCase();
        return res;
    }

    public static boolean isPalindrome(String s) {
        String resTrim = Trim(s);
        return checker(resTrim, 0);
    }

    static boolean checker(String s, int i) {
        int n = s.length();
        if (i >= n / 2) {
            return true;
        }
        if (s.charAt(i) != s.charAt(n - i - 1)) {
            return false;
        }
        return checker(s, i + 1);
    }
}