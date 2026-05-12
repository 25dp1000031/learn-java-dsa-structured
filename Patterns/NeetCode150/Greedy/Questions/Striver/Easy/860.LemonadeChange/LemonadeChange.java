import java.util.*;

public class LemonadeChange {
    public static void main(String[] args) {
        int[] bills = { 5, 5, 5, 10, 20 };

        System.out.print("Queue of customers: ");
        for (int bill : bills)
            System.out.print(bill + " ");
        System.out.println();

        Solution stand = new Solution();
        boolean ans = stand.lemonadeChange(bills);

        if (ans)
            System.out.println("It is possible to provide change for all customers.");
        else
            System.out.println("It is not possible to provide change for all customers.");
    }
}

class Solution {
    public boolean lemonadeChange(int[] bills) {
        int five = 0;
        int ten = 0;
        for (int i = 0; i < bills.length; i++) {
            if (bills[i] == 5) {
                five++;
            } else if (bills[i] == 10) {
                if (five > 0) {
                    five--;
                    ten++;
                } else {
                    return false;
                }
            } else {
                if (ten > 0 && five > 0) {
                    ten--;
                    five--;
                } else if (five >= 3) {
                    five -= 3;
                } else {
                    return false;
                }
            }
        }
        return true;
    }
}