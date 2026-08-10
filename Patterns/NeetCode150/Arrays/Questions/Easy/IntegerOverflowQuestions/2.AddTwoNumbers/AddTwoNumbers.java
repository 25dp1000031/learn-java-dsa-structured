import java.util.*;

public class AddTwoNumbers {
    public static void main(String[] args) {
        ListNode l1_1 = new ListNode(2);
        ListNode l1_2 = new ListNode(4);
        ListNode l1_3 = new ListNode(3);
        l1_1.next = l1_2;
        l1_2.next = l1_3;

        ListNode l2_1 = new ListNode(5);
        ListNode l2_2 = new ListNode(6);
        ListNode l2_3 = new ListNode(4);
        l2_1.next = l2_2;
        l2_2.next = l2_3;

        Solution sol = new Solution();
        ListNode curr = sol.addTwoNumbers(l1_1, l2_1);
        while (curr != null) {
            System.out.print(curr.val + " ");
            curr = curr.next;
        }
    }
}

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode curr1 = l1;
        ListNode curr2 = l2;
        ListNode res = new ListNode();
        ListNode resptr = res;
        int carry = 0;
        while (curr1 != null || curr2 != null) {
            int sum = 0;
            if (curr1 != null) {
                sum += curr1.val;
            }
            if (curr2 != null) {
                sum += curr2.val;
            }
            sum += carry;
            carry = sum / 10;
            int rem = sum % 10;
            resptr.next = new ListNode(rem);
            resptr = resptr.next;
            if (curr1 != null)
                curr1 = curr1.next;
            if (curr2 != null)
                curr2 = curr2.next;
        }
        if (carry != 0) {
            resptr.next = new ListNode(carry);
        }
        return res.next;
    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}