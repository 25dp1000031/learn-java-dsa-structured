import java.util.*;

public class LetterCasePermutation {
    public static void main(String[] args) {
        String s = "a1b2";
        Solution sol = new Solution();
        sol.letterCasePermutation(s).stream().forEach(i -> System.out.print(i + " "));
    }
}

class Solution {
    public List<String> letterCasePermutation(String s) {
        ArrayList<String> list = new ArrayList<>();
        func(0, list, "", s);
        return list;
    }

    public void func(int index, ArrayList<String> list, String str, String s) {
        if (index == s.length()) {
            list.add(str);
            return;
        }
        // skip digits
        else if (Character.isDigit(s.charAt(index))) {
            func(index + 1, list, str + s.charAt(index), s);
        } else {
            // Lower
            func(index + 1, list, str + Character.toLowerCase(s.charAt(index)), s);
            // upper
            func(index + 1, list, str + Character.toUpperCase(s.charAt(index)), s);
        }
    }
}