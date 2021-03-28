package com.inani.vijay.leetcode;

import java.util.PriorityQueue;

public class MergeKSortedLists {

    public static void main(String[] args) {

        int[][] listsArray = new int[][]{{1, 4, 5}, {1, 3, 4}, {2, 6}};
        ListNode[] lists = new ListNode[listsArray.length];

        int i = 0;
        for (int[] currList : listsArray) {
            ListNode dummy = new ListNode(0);
            ListNode head = dummy;
            for (int currVal : currList) {
                ListNode curr = new ListNode(currVal);
                dummy.next = curr;
                dummy = dummy.next;
            }
            lists[i] = head.next;
            i++;

        }

        //ListNode result = new MergeKSortedLists().mergeKListsPriorityQueue(lists);
        //ListNode result2 = new MergeKSortedLists().mergeKListsCompareOneByOne(lists);
        ListNode result3 = new MergeKSortedLists().mergeKListsOneByOne(lists);


     /*   while (result != null) {
            System.out.println(result.val);
            result = result.next;
        }*/

        /*while (result2 != null) {
            System.out.println(result2.val);
            result2 = result2.next;
        }*/

        while (result3 != null) {
            System.out.println(result3.val);
            result3 = result3.next;
        }

    }

    private ListNode mergeKListsOneByOne(ListNode[] lists) {
        if (lists.length == 0) {
            return null;
        }
        if (lists.length == 1) {
            return lists[0];
        }

        ListNode h1 = lists[0];
        ListNode h2 = lists[1];

        ListNode head = mergeTwoLists(h1, h2);
        for (int i = 2; i < lists.length; i++) {
            head = mergeTwoLists(head, lists[i]);
        }
        return head;
    }

    private ListNode mergeTwoLists(ListNode h1, ListNode h2) {
        ListNode dummy = new ListNode(0);
        ListNode h = dummy;
        while (h1 != null && h2 != null) {
            if (h1.val < h2.val) {
                h.next = h1;
                h = h.next;
                h1 = h1.next;
            } else {
                h.next = h2;
                h = h.next;
                h2 = h2.next;
            }
        }
        if (h1 == null) {
            h.next = h2;
        }
        if (h2 == null) {
            h.next = h1;
        }
        return dummy.next;
    }

    private ListNode mergeKListsCompareOneByOne(ListNode[] lists) {

        ListNode head = new ListNode(0);
        ListNode h = head;

        int minIndex = 0;

        while (true) {
            int min = Integer.MAX_VALUE;
            boolean isBreak = true;
            for (int i = 0; i < lists.length; i++) {
                if (lists[i] != null) {
                    if (lists[i].val < min) {
                        min = lists[i].val;
                        minIndex = i;
                    }
                    isBreak = false;
                }
            }
            if (isBreak) {
                break;
            }
            ListNode ln = new ListNode(lists[minIndex].val);
            h.next = ln;
            h = h.next;
            lists[minIndex] = lists[minIndex].next;
        }
        return head.next;
    }

    public ListNode mergeKListsPriorityQueue(ListNode[] lists) {

        PriorityQueue<ListNode> listNodePriorityQueue = new PriorityQueue<>(lists.length, (a, b) -> a.val - b.val);

        for (ListNode ln : lists) {
            if (ln != null) {
                listNodePriorityQueue.add(ln);
            }
        }

        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;

        while (!listNodePriorityQueue.isEmpty()) {
            curr.next = listNodePriorityQueue.poll();
            curr = curr.next;

            if (curr.next != null) {
                listNodePriorityQueue.add(curr.next);
            }
        }
        return dummy.next;
    }
}

