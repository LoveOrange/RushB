package com.linsama.rushb;

public class Q21 {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null) {
            return l2;
        }
        if (l2 == null) {
            return l1;
        }
        ListNode walking = l1.val < l2.val ? l1 : l2;
        ListNode waiting = l1.val >= l2.val ? l1 : l2;
        ListNode tmp;
        ListNode head = walking;
        while (true) {
            if (walking.next == null) {
                walking.next = waiting;
                break;
            }
            if (walking.next.val > waiting.val) {
                tmp = walking.next;
                walking.next = waiting;
                waiting = tmp;
            }
            walking = walking.next;
        }
        return head;
    }

    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
   }
}
