package com.inani.vijay.leetcode;

public class RemoveNthNodeEndOfList {

    public static void main(String[] args) {

        ListNode curr = null;
        ListNode head = null;
        ListNode previous = null;

        for (int i = 1; i <= 1; i++) {
            curr = new ListNode();
            curr.val = i;
            if (previous != null) {
                previous.next = curr;
            } else {
                head = curr;
            }
            previous = curr;
        }

        new RemoveNthNodeEndOfList().removeNthFromEnd(head, 1);

        while (head != null) {
            System.out.println(head.val);
            head = head.next;
        }
    }

    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode h1 = head, h2 = head;
        while (n-- > 0) h2 = h2.next;
        if (h2 == null) return head.next;  // The head need to be removed, do it.
        h2 = h2.next;

        while (h2 != null) {
            h1 = h1.next;
            h2 = h2.next;
        }
        h1.next = h1.next.next;   // the one after the h1 need to be removed
        return head;
    }
}
