package com.inani.vijay;

import java.util.Stack;

public class StackSort {

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        //stack.sort((a,b) -> {return a - b;});
        stack.push(2);
        stack.push(4);
        stack.push(-1);
        stack.push(3);
        stack.push(6);
        stack.push(9);
        System.out.println(new StackSort().stackSort(stack));
    }

    private Stack<Integer> stackSort(Stack<Integer> stack) {
        Stack<Integer> tempStack = new Stack<>();
        while (!stack.isEmpty()) {
            int item = stack.pop();
            while (!tempStack.isEmpty() && tempStack.peek() > item) {
                stack.push(tempStack.pop());
            }
            tempStack.push(item);
        }
        while (!tempStack.isEmpty()) {
            stack.push(tempStack.pop());
        }
        return stack;
    }
}
