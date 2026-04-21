// Definition for singly-linked list.

import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

public class MergeKSortedLists {
    public static void main(String[] args) {
        Solution sol = new Solution();

        // Creating three linked lists:
        // list1: 1 -> 4 -> 5
        // list2: 1 -> 3 -> 4
        // list3: 2 -> 6

        ListNode list1 = new ListNode(1);
        list1.next = new ListNode(4);
        list1.next.next = new ListNode(5);

        ListNode list2 = new ListNode(1);
        list2.next = new ListNode(3);
        list2.next.next = new ListNode(4);

        ListNode list3 = new ListNode(2);
        list3.next = new ListNode(6);

        ListNode[] lists = new ListNode[] { list1, list2, list3 };

        ListNode result = sol.mergeKLists(lists);

        // Print the merged list
        while (result != null) {
            System.out.print(result.val + " ");
            result = result.next;
        }
    }
}

public class ListNode {
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

class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<ListNode> pq = new PriorityQueue<>((a, b) -> a.val - b.val);
        for (ListNode node : lists) {
            if (node != null) {
                pq.add(node);
            }
        }
        ListNode dummy = new ListNode(0);
        ListNode tail = dummy;

        while (!pq.isEmpty()) {
            ListNode smallest = pq.remove();
            // add to dummy
            tail.next = smallest;
            tail = tail.next;
            if (smallest.next != null) {
                pq.add(smallest.next);
            }
        }
        return dummy.next;
    }
}
