package com.inani.vijay.leetcode;

import java.util.Stack;

public class _402RemoveKDigits {

    public static void main(String[] args) {
        System.out.println(new _402RemoveKDigits().removeKdigits("10", 1));
    }

    public String removeKdigits(String num, int k) {

        int n = num.length();

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < n; i++) {

            while (k > 0 && !stack.isEmpty() && stack.peek() > num.charAt(i)) {
                stack.pop();
                k--;
            }

            stack.push(num.charAt(i));
        }

        while (k > 0) {
            stack.pop();
            k--;
        }

        StringBuilder stringBuilder = new StringBuilder();
        while (!stack.isEmpty()) {
            stringBuilder.append(stack.pop());
        }
        stringBuilder.reverse();

        while (stringBuilder.length() > 1 && stringBuilder.charAt(0) == '0') {
            stringBuilder.deleteCharAt(0);
        }

        if(stringBuilder.length() == 0) {
            stringBuilder.append("0");
        }

        return stringBuilder.toString();

    }

}
