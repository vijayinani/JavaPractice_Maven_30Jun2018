package com.inani.vijay.leetcode;

import java.util.Stack;

public class _232ImplementQueueUsingStacks {
    class MyQueue {

        Stack<Integer> finalStack;
        Stack<Integer> tempStack;

        /**
         * Initialize your data structure here.
         */
        public MyQueue() {
            finalStack = new Stack<>();
            tempStack = new Stack<>();
        }

        /**
         * Push element x to the back of queue.
         */
        public void push(int x) {
            if(finalStack.isEmpty()) {
                finalStack.push(x);
            } else {
                while (!finalStack.isEmpty()) {
                    tempStack.push(finalStack.pop());
                }
                finalStack.push(x);
                while (!tempStack.isEmpty()) {
                    finalStack.push(tempStack.pop());
                }
            }
        }

        /**
         * Removes the element from in front of queue and returns that element.
         */
        public int pop() {
            return finalStack.pop();
        }

        /**
         * Get the front element.
         */
        public int peek() {
            return finalStack.peek();
        }

        /**
         * Returns whether the queue is empty.
         */
        public boolean empty() {
            return finalStack.isEmpty();
        }
    }

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */
}
