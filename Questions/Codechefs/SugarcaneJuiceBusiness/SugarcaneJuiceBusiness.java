package Questions.CodeChefs.SugarcaneJuiceBusiness;

import java.util.*;
import java.io.*;

public class SugarcaneJuiceBusiness {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        StringTokenizer st;
        while (t-- > 0) {
            st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int income = n * 50;
            int expense = (int) Math.ceil(0.7 * income);
            int profit = income - expense;
            System.out.println(profit);
        }
    }
}
