package Patterns.NeetCode150.Recursion.LearningKunalKushwahaPlaylist.ReverseANumber;

public class ReverseANumber {
    public static void main(String[] args) {
        int n = 1842; // 2481
        StringBuilder s = new StringBuilder();
        int ans = reversenumber(s, n);
        System.out.println(ans);
        int ans2 = reversenumberWithoutStringBuilder(n, 0);
        System.out.println(ans2);
    }

    static int reversenumber(StringBuilder res, int n) {
        if (n < 10) {
            res.append(n);
            return Integer.parseInt(res.toString());
        }
        int x = n % 10;
        res.append(x);
        return reversenumber(res, n / 10);
    }

    static int reversenumberWithoutStringBuilder(int n, int sum) {
        if (n == 0) {
            return sum;
        }
        int x = n % 10;
        sum = sum * 10 + x;
        return reversenumberWithoutStringBuilder(n / 10, sum);
    }
}
