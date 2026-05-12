import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Borze {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        char[] str_arr = str.toCharArray();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str_arr.length; i++) {
            if (str_arr[i] == '.') {
                sb.append(0);
            } else if (str_arr[i] == '-') {
                if (str_arr[i + 1] == '.') {
                    sb.append(1);
                } else {
                    sb.append(2);
                }
                i++;
            }

        }
        System.out.println(sb.toString());
    }
}