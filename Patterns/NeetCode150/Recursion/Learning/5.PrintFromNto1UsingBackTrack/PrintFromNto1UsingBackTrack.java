import java.util.Scanner;

// n to 1
public class PrintFromNto1UsingBackTrack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        print(1, n);
        sc.close();
    }

    static void print(int i, int n) {
        if (i > n) {
            return;
        }
        print(i + 1, n);
        System.out.println(i);
    }
}
