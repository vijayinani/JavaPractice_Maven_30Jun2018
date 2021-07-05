package com.inani.vijay;

import com.inani.vijay.leetcode.ListNode;

public class NthNodeFromEndOfLinkedList {
    public static void main(String[] args) {
        ListNode temp = new ListNode(0);
        ListNode initial = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5, null)))));
        temp.next = initial;
        initial = temp;
        System.out.println(nthNodeFromEndOfLinkedList(initial, 7));
    }

    private static int nthNodeFromEndOfLinkedList(ListNode head, int n) {
        ListNode second = head;
        while (n-- > 0 && head != null) {
            head = head.next;
        }
        if (head == null) {
            return -1;
        }
        while (head != null) {
            head = head.next;
            second = second.next;
        }
        return second.val;
    }
}
