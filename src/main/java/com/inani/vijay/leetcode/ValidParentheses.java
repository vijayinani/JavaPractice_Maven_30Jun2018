package com.inani.vijay.leetcode;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class ValidParentheses {

    public static void main(String[] args) {
        System.out.println(new ValidParentheses().isValid("))"));
    }

    public boolean isValid(String s) {

        if (s.length() % 2 != 0) {
            return false;
        }

        Map<Character, Character> braces = new HashMap<>();
        braces.put(']', '[');
        braces.put(')', '(');
        braces.put('}', '{');

        Stack<Character> bracesStack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            if (braces.containsKey(s.charAt(i))) {
                if (!bracesStack.isEmpty()) {
                    char poppedChar = bracesStack.pop();
                    if (poppedChar != braces.get(s.charAt(i))) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                bracesStack.push(s.charAt(i));
            }
        }

        return bracesStack.isEmpty();

    }
}
