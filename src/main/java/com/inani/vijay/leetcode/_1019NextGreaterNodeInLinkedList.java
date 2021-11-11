package com.inani.vijay.leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class _1019NextGreaterNodeInLinkedList {
    /*
    public int[] nextLargerNodes(ListNode head) {
        List<Integer> result = new ArrayList<>();
        while (head != null) {
            ListNode curr = head;
            while (curr != null) {
                if (curr.next != null && curr.next.val > curr.val) {
                    result.add(curr.next.val);
                    break;
                }
                if(curr == null) {
                    result.add(0);
                }
                curr = curr.next;
            }
            head = head.next;
        }
        int[] resultArray = new int[result.size()];
        int i = 0;
        for (int val : result) {
            resultArray[i] = val;
            i++;
        }
        return resultArray;
    }

     */

    public int[] nextLargerNodes(ListNode head) {

        List<Integer> integers = new ArrayList<>();
        for (ListNode node = head; node != null; node = node.next) {
            integers.add(node.val);
        }

        int[] result = new int[integers.size()];

        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < integers.size(); i++) {
            while(!stack.isEmpty() && integers.get(stack.peek()) < integers.get(i)) {
                result[stack.pop()] = integers.get(i);
            }
            stack.push(i);
        }

        return result;
    }
}
