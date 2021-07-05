package com.inani.vijay.leetcode;

public class _141LinkedListCycle {
    public static void main(String[] args) {
        ListNode temp = new ListNode(0);
        ListNode initial = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5, temp)))));
        temp.next = initial;
        initial = temp;
        ListNode initial2 = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5, null)))));

        System.out.println(hasCycle(initial));
        System.out.println(hasCycle(initial2));
    }

    public static boolean hasCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while (slow != null && fast != null) {
            slow = slow.next;
            if(slow == null) {
                return false;
            }
            if(fast.next != null) {
                fast = fast.next.next;
            } else {
                return false;
            }
            if(fast == slow) {
                return true;
            }
        }
        return false;
    }
}
