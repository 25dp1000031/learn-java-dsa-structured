package Questions.CodeChefs.CounttheNotebooks;

import java.util.*;
import java.io.*;

public class CounttheNotebooks {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        StringTokenizer st;
        while (t-- > 0) {
            st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int ans = n * 10;
            System.out.println(ans);
        }
    }
}
