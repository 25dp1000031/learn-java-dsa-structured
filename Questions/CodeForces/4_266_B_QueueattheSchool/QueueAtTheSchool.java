import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class QueueAtTheSchool {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int t = Integer.parseInt(st.nextToken());
        String str = br.readLine();
        Solution sol = new Solution();
        char[] res = sol.ChangeBToG(str, t);
        for (char r : res) {
            System.out.print(r);
        }
    }
}

class Solution {
    char[] ChangeBToG(String str, int t) {
        char[] strArr = str.toCharArray();
        while (t-- > 0) {
            for (int i = 0; i < strArr.length - 1; i++) {
                if (strArr[i] == 'B' && strArr[i + 1] == 'G') {
                    strArr[i] = 'G';
                    strArr[i + 1] = 'B';
                    i++;
                }
            }
        }

        return strArr;
    }
}