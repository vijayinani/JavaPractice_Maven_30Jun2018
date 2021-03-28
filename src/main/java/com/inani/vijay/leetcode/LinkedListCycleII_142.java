package com.inani.vijay.leetcode;

public class LinkedListCycleII_142 {

    public ListNode detectCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        boolean isCyclePresent = false;
        while (slow != null && fast != null) {
            slow = slow.next;
            if (fast.next != null) {
                fast = fast.next.next;
            } else {
                return null;
            }
            if (slow == fast) {
                isCyclePresent = true;
                break;
            }
        }

        if (isCyclePresent) {
            slow = head;
            while (slow != fast) {
                slow = slow.next;
                fast = fast.next;
            }
            return slow;
        }
        return null;
    }
}
