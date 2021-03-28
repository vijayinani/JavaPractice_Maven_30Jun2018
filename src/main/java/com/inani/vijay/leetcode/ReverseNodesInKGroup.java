package com.inani.vijay.leetcode;

public class ReverseNodesInKGroup {

    public static void main(String[] args) {
        int[] integers = new int[]{1, 2, 3, 4, 5};

        int i = 0;

        ListNode dummy = new ListNode(0);
        ListNode head = dummy;
        for (int currVal : integers) {
            ListNode curr = new ListNode(currVal);
            dummy.next = curr;
            dummy = dummy.next;
        }


        //ListNode result = new MergeKSortedLists().mergeKListsPriorityQueue(lists);
        //ListNode result2 = new MergeKSortedLists().mergeKListsCompareOneByOne(lists);
        //ListNode result3 = new MergeKSortedLists().mergeKListsOneByOne(lists);

        ListNode result3 = new ReverseNodesInKGroup().reverseKGroup(head.next, 3);

        while (result3 != null) {
            System.out.println(result3.val);
            result3 = result3.next;
        }

    }

    public ListNode reverseKGroup(ListNode head, int k) {
        int n = 0;
        for (ListNode i = head; i != null; n++, i = i.next) ;

        ListNode dmy = new ListNode(0);
        dmy.next = head;
        for (ListNode prev = dmy, tail = head; n >= k; n -= k) {
            for (int i = 1; i < k; i++) {
                ListNode next = tail.next.next;
                tail.next.next = prev.next;
                prev.next = tail.next;
                tail.next = next;
            }

            prev = tail;
            tail = tail.next;
        }
        return dmy.next;
    }

}
