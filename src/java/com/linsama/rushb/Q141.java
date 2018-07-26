package com.linsama.rushb;

public class Q141 {
    public boolean hasCycle(ListNode head) {
        ListNode quick = new ListNode(head.val);
        quick.next = head.next;
        while (head != null && quick != null && quick.next != null)
            if (head == quick)
                return true;
        return false;
    }
    class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }
    }
}
