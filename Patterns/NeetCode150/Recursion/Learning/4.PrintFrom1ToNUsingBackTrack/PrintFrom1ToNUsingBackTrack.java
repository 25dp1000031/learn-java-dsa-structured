import java.util.Scanner;

public class PrintFrom1ToNUsingBackTrack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        print(n, n);
        sc.close();
    }

    static void print(int i, int n) {
        if (i < 1) {
            return;
        }
        print(i - 1, n);
        System.out.println(i);
    }
}