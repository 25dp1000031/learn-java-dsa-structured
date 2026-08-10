import java.util.*;

public class AddToArrayFormOfInteger {
    public static void main(String[] args) {
        int[] num = { 1, 2, 0, 0 };
        int k = 34;
        Solution sol = new Solution();
        sol.addToArrayForm(num, k).forEach(i -> System.out.print(i + " "));
    }
}

class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        int i = num.length - 1;
        int carry = 0;
        List<Integer> list = new ArrayList<>();
        while (i >= 0 || k > 0) {
            int sum = 0;
            if (i >= 0) {
                sum += num[i];
            }
            if (k >= 0) {
                sum += k % 10;
            }
            sum += carry;
            int rem = sum % 10;
            carry = sum / 10;
            list.add(0, rem);
            k = k / 10;
            i--;
        }
        if (carry != 0) {
            list.addFirst(carry);
        }
        return list;
    }
}