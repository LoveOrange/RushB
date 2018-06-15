package com.linsama.rushb;

public class Q19 {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode first = head;
        ListNode second = head;
        int i = 0;
        while (i++ < n) {
            first = first.next;
        }
        if (first == null) {
            return head.next;
        }

        first = first.next;
        while (first != null) {
            first = first.next;
            second = second.next;
        }
        second.next = second.next.next;
        return head;
    }

    class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
}
