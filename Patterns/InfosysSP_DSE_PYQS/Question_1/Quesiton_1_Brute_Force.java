package Patterns.InfosysSP_DSE_PYQS.Question_1;

import java.util.Scanner;

public class Quesiton_1_Brute_Force {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String number = sc.next();
        String d = sc.next();
        char digit = d.charAt(0);

        int max = Integer.MIN_VALUE;

        for (int i = 0; i < number.length(); i++) {
            if (number.charAt(i) == digit) {
                String ans_num = number.substring(0, i) + number.substring(i + 1);
                int val = Integer.parseInt(ans_num);
                if (val > max) {
                    max = val;
                }
            }
        }
        System.out.println(String.valueOf(max));
        // System.out.println(number);
        // System.out.println(digit);

        sc.close();
    }
}

// algorithm - brute force

// step 1 : take input of number and the digit provided

// step 2 : take in how would the answer look like without the given digit,
// left(:i) and right the digit(i:)

// step 3 : append the multiple answers to a arr and return the max of the arr