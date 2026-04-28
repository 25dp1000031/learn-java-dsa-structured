import java.util.*;
import java.io.*;

public class YoungPhysicist {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        int sx = 0;
        int sy = 0;
        int sz = 0;
        while (t-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            int z = Integer.parseInt(st.nextToken());
            sx += x;
            sy += y;
            sz += z;
        }
        if (sx == 0 && sy == 0 && sz == 0) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}