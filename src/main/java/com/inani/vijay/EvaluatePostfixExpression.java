package com.inani.vijay;

import java.util.Stack;

public class EvaluatePostfixExpression {

    public static void main(String[] args) {
        System.out.println(new EvaluatePostfixExpression().evaluate("231*+9-"));
    }

    private int evaluate(String s) {
        Stack<Integer> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            switch (c) {
                case '+':
                case '-':
                case '*':
                case '/':
                    int value1 = stack.pop();
                    int value2 = stack.pop();
                    if (c == '*') {
                        stack.push(value2 * value1);
                    }
                    if (c == '/') {
                        stack.push(value2 / value1);
                    }
                    if (c == '+') {
                        stack.push(value2 + value1);
                    }
                    if (c == '-') {
                        stack.push(value2 - value1);
                    }
                    break;
                default:
                    stack.push(Character.getNumericValue(c));
            }
        }
        return stack.pop();
    }

}
