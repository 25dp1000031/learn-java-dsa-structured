package Questions.Add_two_numbers;

import java.util.ArrayList;

public class AddTwoNumbers {

    // Add two lists of digits with carry, returns ArrayList of digits
    ArrayList<Integer> AddLists(ArrayList<Integer> l1, ArrayList<Integer> l2) {
        ArrayList<Integer> l3 = new ArrayList<>();
        int carry = 0;
        for (int i = 0; i < l1.size(); i++) {
            int sum = l1.get(i) + l2.get(i) + carry;
            carry = sum / 10;
            l3.add(sum % 10);
        }
        if (carry > 0) {
            l3.add(carry);
        }
        return l3;
    }

    // Convert ListNode to ArrayList<Integer>
    ArrayList<Integer> Convert(ListNode l) {
        ArrayList<Integer> arr = new ArrayList<>();
        ListNode curr = l;
        while (curr != null) {
            arr.add(curr.val);
            curr = curr.next;
        }
        return arr;
    }

    // Convert ArrayList to ListNode
    ListNode convert_back(ArrayList<Integer> l) {
        ListNode l3 = new ListNode(0);
        ListNode curr = l3;
        for (int i = 0; i < l.size(); i++) {
            curr.next = new ListNode(l.get(i));
            curr = curr.next;
        }
        return l3.next;
    }

    // Display the linked list
    void Display(ListNode l1) {
        ListNode current = l1;
        while (current != null) {
            System.out.print(current.val + (current.next != null ? " -> " : ""));
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(2, new ListNode(4, new ListNode(3))); // 342
        ListNode l2 = new ListNode(5, new ListNode(6, new ListNode(4))); // 465

        AddTwoNumbers adder = new AddTwoNumbers();

        ArrayList<Integer> convert_l1 = adder.Convert(l1);
        ArrayList<Integer> convert_l2 = adder.Convert(l2);

        ArrayList<Integer> resultList = adder.AddLists(convert_l1, convert_l2);

        ListNode l3 = adder.convert_back(resultList);

        adder.Display(l3);
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
