import java.util.Scanner;

public class SumOfNnumbersUsingRecusion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int res = SumOfNNumbersCleanCode(n);
        System.out.println(res);
        sc.close();
    }

    // using backtrack
    static int SumOfNNumbers(int i, int n) {
        if (i < 1) {
            return 0;
        }
        return i + SumOfNNumbers(i - 1, n);
    }

    // cleaner version of the same would be :
    static int SumOfNNumbersCleanCode(int n) {
        if (n < 1) {
            return 0;
        }
        return n + SumOfNNumbersCleanCode(n - 1);
    }
}