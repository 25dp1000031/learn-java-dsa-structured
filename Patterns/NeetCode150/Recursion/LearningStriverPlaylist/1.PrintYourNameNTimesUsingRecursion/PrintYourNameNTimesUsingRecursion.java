import java.util.*;

public class PrintYourNameNTimesUsingRecursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        print(1, n);
        sc.close();
    }

    public static void print(int i, int n) {
        if (i > n) {
            return;
        }
        System.out.println("Aayush");
        print(i + 1, n);
    }
}
