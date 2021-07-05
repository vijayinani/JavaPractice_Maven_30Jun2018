package com.inani.vijay;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ReverseFirstKElementsOfAQueue {
    public static void main(String[] args) {
        Queue<Integer> integerQueue = new LinkedList<>();
        integerQueue.add(1);
        integerQueue.add(2);
        integerQueue.add(3);
        integerQueue.add(4);
        integerQueue.add(5);
        integerQueue.add(6);
        integerQueue.add(7);
        System.out.println("Before: " + integerQueue);
        reverseFirstKElements(integerQueue, 5);
        System.out.println("After: " + integerQueue);
    }

    private static void reverseFirstKElements(Queue<Integer> integerQueue, int k) {
        Stack<Integer> stack = new Stack<>();
        int count = 0;
        while (count < k) {
            stack.push(integerQueue.remove());
            count++;
        }
        while (!stack.isEmpty()) {
            integerQueue.add(stack.pop());
        }
        count = 0;
        while (count < integerQueue.size() - k) {
            integerQueue.add(integerQueue.remove());
            count++;
        }
    }
}
