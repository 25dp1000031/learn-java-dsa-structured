package Questions.CodeChefs.ChefandNextGen;

import java.util.*;
import java.io.*;

public class ChefandNextGen {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        StringTokenizer st;
        while (t-- > 0) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            if ((a * b) > (x * y)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
