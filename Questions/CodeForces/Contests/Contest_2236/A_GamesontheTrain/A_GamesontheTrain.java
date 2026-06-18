package Questions.CodeForces.Contests.Contest_2236.A_GamesontheTrain;

import java.util.*;
import java.io.*;;

public class A_GamesontheTrain {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine());
            int arr[] = new int[n];
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int i = 0; i < arr.length; i++) {
                arr[i] = Integer.parseInt(st.nextToken());
            }
            int max = max(arr);
            int H = max + 1;
            int maxH = 0;
            for (int i : arr) {
                int diff = H - i;
                maxH = Math.max(maxH, diff);
            }
            System.out.println(maxH);
        }
    }

    static int max(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int i : arr) {
            max = Math.max(max, i);
        }
        return max;
    }
}