package Questions.CodeForces.Contests.Contest_2236.B_TatarTVShow;

import java.util.*;
import java.io.*;

public class B_TatarTVShow {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int len = Integer.parseInt(st.nextToken());
            int flipable = Integer.parseInt(st.nextToken());
            String str = br.readLine();
            int count_Zero = 0;
            for (char i : str.toCharArray()) {
                if (i == '0') {
                    count_Zero++;
                }
            }
            if (count_Zero == flipable) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }

        }
    }
}
