package Patterns.NeetCode150.Arrays.Questions.Easy.IntegerOverflowQuestions.Add2Arrays;

import java.util.ArrayList;

public class Add2Arrays {
    public static void main(String[] args) {
        int[] arr1 = { 5, 6, 7 };
        int[] arr2 = { 3, 4, 4, 6 };
        Solution sol = new Solution();
        ArrayList<Integer> list = sol.addArrays(arr1, arr2);
        list.forEach(i -> System.out.println(i + " "));
    }
}

class Solution {
    public ArrayList<Integer> addArrays(int[] arr1, int[] arr2) {
        int carry = 0;
        int i = arr1.length - 1;
        int j = arr2.length - 1;
        ArrayList<Integer> list = new ArrayList<>();
        while (i >= 0 || j >= 0) {
            int sum = 0;
            if (i >= 0) {
                sum += arr1[i];
            }
            if (j >= 0) {
                sum += arr2[j];
            }
            sum += carry;
            int rem = sum % 10;
            carry = sum / 10;
            list.add(0, rem);
            i--;
            j--;
        }
        if (carry != 0) {
            list.addFirst(carry);
        }
        return list;
    }
}