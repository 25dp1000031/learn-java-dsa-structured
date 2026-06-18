package Questions.CodeForces.Contests.Contest_2236.C_OmskProgrammers;

import java.util.*;
import java.io.*;

public class C_Omsk_Programmers {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int x = Integer.parseInt(st.nextToken());
            int ops = 0;
            int diff = Math.abs(a - b);
            if (diff == 1) {
                ops++;
                System.out.println(ops);
                continue;
            }

        }
    }
}