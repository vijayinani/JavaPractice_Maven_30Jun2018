package com.inani.vijay.leetcode;

public class _206ReverseLinkedList {

    public static void main(String[] args) {
        ListNode initial = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5, null)))));
        ListNode initial2 = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5, null)))));
        ListNode head = new _206ReverseLinkedList().reverseList(initial);
        while (head != null) {
            System.out.println(head.val);
            head = head.next;
        }

        head = new _206ReverseLinkedList().reverseListRecursive(initial2);
        while (head != null) {
            System.out.println(head.val);
            head = head.next;
        }
    }

    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        while (curr != null) {
            ListNode temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
        return prev;
    }

    public ListNode reverseListRecursive(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode p = reverseListRecursive(head.next);
        head.next.next = head;
        head.next = null;
        return p;
    }
}

