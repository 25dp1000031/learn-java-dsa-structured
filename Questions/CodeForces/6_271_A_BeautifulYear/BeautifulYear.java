import java.io.*;
import java.util.*;

public class BeautifulYear {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int year = Integer.parseInt(br.readLine());
        Solution sol = new Solution();
        int res = sol.BeautifulYearSolution(year);
        System.out.println(res);
    }
}

class Solution {
    public Boolean isDistinct(int year) {
        StringBuilder sb = new StringBuilder();
        sb.append(year);
        HashSet<Character> set = new HashSet<>();
        for (char c : sb.toString().toCharArray()) {
            if (!set.add(c)) {
                return false;
            }
        }
        return true;
    }

    public int BeautifulYearSolution(int year) {
        while (true) {
            year++;
            if (isDistinct(year)) {
                return year;
            }
        }
    }
}