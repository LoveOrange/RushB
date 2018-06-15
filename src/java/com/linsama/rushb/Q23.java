package com.linsama.rushb;

public class Q23 {
    public ListNode mergeKLists(ListNode[] lists) {
        ListNode head = curMin(lists);
        ListNode walk = head;
        ListNode cur;
        while ((cur = curMin(lists)) != null) {
            walk.next = cur;
            walk = cur;
        }
        return head;
    }

    private ListNode curMin(ListNode[] listNodes) {
        ListNode curMin = null;
        int minIndex = 0;
        for (int i = 0; i < listNodes.length; i++) {
            if (listNodes[i] == null) {
                continue;
            }
            if (curMin == null || listNodes[i].val < curMin.val) {
                curMin = listNodes[i];
                minIndex = i;
            }
        }
        if (curMin != null) {
            listNodes[minIndex] = curMin.next;
        }
        return curMin;
    }

    class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
}

