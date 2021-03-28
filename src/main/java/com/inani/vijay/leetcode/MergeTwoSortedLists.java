package com.inani.vijay.leetcode;

public class MergeTwoSortedLists {

    public static void main(String[] args) {

        ListNode curr1 = null;
        ListNode head1 = null;
        ListNode previous1 = null;

        ListNode curr2 = null;
        ListNode head2 = null;
        ListNode previous2 = null;

        int[] int1 = new int[]{1, 2, 4};
        int[] int2 = new int[]{1, 3, 4};

        for (int i : int1) {
            curr1 = new ListNode();
            curr1.val = i;
            if (previous1 != null) {
                previous1.next = curr1;
            } else {
                head1 = curr1;
            }
            previous1 = curr1;
        }

        for (int i : int2) {
            curr2 = new ListNode();
            curr2.val = i;
            if (previous2 != null) {
                previous2.next = curr2;
            } else {
                head2 = curr2;
            }
            previous2 = curr2;
        }

        ListNode finalList = new MergeTwoSortedLists().mergeTwoLists(head1, head2);

        while (finalList != null) {
            System.out.println(finalList.val);
            finalList = finalList.next;
        }
    }

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);
        ListNode head = dummy;

        while (l1 != null && l2 != null) {
            if (l1.val <= l2.val) {
                ListNode next = new ListNode(l1.val);
                dummy.next = next;
                l1 = l1.next;
                dummy = dummy.next;
            } else {
                ListNode next = new ListNode(l2.val);
                dummy.next = next;
                l2 = l2.next;
                dummy = dummy.next;
            }
        }

        if (l1 != null) {
            dummy.next = l1;
        } else if (l2 != null) {
            dummy.next = l2;
        }

        return head.next;
    }
}