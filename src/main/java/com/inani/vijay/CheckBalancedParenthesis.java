package com.inani.vijay;

import java.util.Stack;

public class CheckBalancedParenthesis {
    public static void main(String[] args) {
        System.out.println(new CheckBalancedParenthesis().checkBalancedParenthesis("((()()))()(())()()"));
    }

    private boolean checkBalancedParenthesis(String s) {
        Stack<Character> characterStack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(') {
                characterStack.push(c);
            } else {
                if (characterStack.isEmpty() || characterStack.peek() != '(') {
                    return false;
                } else {
                    characterStack.pop();
                }
            }
        }
        return characterStack.isEmpty();
    }
}
