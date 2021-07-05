package com.inani.vijay;

import com.inani.vijay.leetcode.ListNode;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicatesFromLinkedList {
    public static void main(String[] args) {
        ListNode temp = new ListNode(0);
        ListNode initial = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5, new ListNode(3, new ListNode(2, new ListNode(5, new ListNode(5, new ListNode(7, new ListNode(11, new ListNode(31, new ListNode(29, new ListNode(5, new ListNode(1, null)))))))))))))));
        temp.next = initial;
        initial = temp;
        ListNode initial2 = initial;
        while (initial != null) {
            System.out.println(initial.val);
            initial = initial.next;
        }
        ListNode head = removeDuplicatesFromLinkedList(initial2);
        while (head != null) {
            System.out.println(head.val);
            head = head.next;
        }
    }

    private static ListNode removeDuplicatesFromLinkedList(ListNode head) {
        ListNode curr = head;
        ListNode pre = null;
        Set<Integer> found = new HashSet<>();
        while (curr != null) {
            if (found.contains(curr.val)) {
                pre.next = curr.next;
            } else {
                found.add(curr.val);
                pre = curr;
            }
            curr = curr.next;
        }
        return head;
    }
}
