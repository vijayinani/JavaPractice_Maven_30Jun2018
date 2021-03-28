package com.inani.vijay.leetcode;

public class RemoveOutermostParentheses {

    public static void main(String[] args) {
        System.out.println(new RemoveOutermostParentheses().removeOuterParentheses("(()())(())(()(()))"));
    }

    public String removeOuterParentheses(String S) {

        StringBuilder sb = new StringBuilder();

        int open = 0;
        int close = 0;
        int start = 0;
        int i = 0;
        for (char c : S.toCharArray()) {
            if (c == '(') {
                open++;
            } else {
                close++;
            }
            if (open == close) {
                sb.append(S.substring(start + 1, i));
                start = i + 1;
            }
            i++;
        }
        return sb.toString();
    }
}
