import java.io.*;
import java.util.*;

public class ABeautifulMatrix {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int row = 0;
        int col = 0;
        for (int i = 1; i <= 5; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 1; j <= 5; j++) {
                int value = Integer.parseInt(st.nextToken());
                if (value == 1) {
                    row = i;
                    col = j;
                }
            }
        }
        int moves = Math.abs(row - 3) + Math.abs(col - 3);
        System.out.println(moves);
    }
}
