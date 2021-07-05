package com.inani.vijay.leetcode;

import java.util.LinkedList;
import java.util.Queue;

public class _225ImplementStackusingQueues {

    class MyStack {

        /**
         * Initialize your data structure here.
         */
        Queue<Integer> finalQueue;
        Queue<Integer> tempQueue;

        public MyStack() {
            finalQueue = new LinkedList<>();
            tempQueue = new LinkedList<>();
        }

        /**
         * Push element x onto stack.
         */
        public void push(int x) {
            if (finalQueue.isEmpty()) {
                finalQueue.add(x);
            } else {
                while (!finalQueue.isEmpty()) {
                    tempQueue.add(finalQueue.remove());
                }
                finalQueue.add(x);
                while (!tempQueue.isEmpty()) {
                    finalQueue.add(tempQueue.remove());
                }
            }
        }

        /**
         * Removes the element on top of the stack and returns that element.
         */
        public int pop() {
            return finalQueue.remove();
        }

        /**
         * Get the top element.
         */
        public int top() {
            return finalQueue.peek();
        }

        /**
         * Returns whether the stack is empty.
         */
        public boolean empty() {
            return finalQueue.isEmpty();
        }
    }

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */
}
