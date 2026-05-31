import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class WeirdAlgorithm {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Long n = Long.parseLong(br.readLine());
        Solution.func(n);
    }
}

class Solution {
    public static void func(Long n) {
        System.out.print(n + " ");
        if (n == 1) {
            return;
        } else if (n % 2 == 0) {
            n = n / 2;
        } else {
            n = (n * 3) + 1;
        }
        func(n);
    }
}