package com.inani.vijay.leetcode;

public class _1541MinimumInsertionsToBalanceAParenthesesString {

    public static void main(String[] args) {
        System.out.println(new _1541MinimumInsertionsToBalanceAParenthesesString().minInsertions("(()))"));
        System.out.println(new _1541MinimumInsertionsToBalanceAParenthesesString().minInsertions("())"));
        System.out.println(new _1541MinimumInsertionsToBalanceAParenthesesString().minInsertions("))())("));
        System.out.println(new _1541MinimumInsertionsToBalanceAParenthesesString().minInsertions("(((((("));
        System.out.println(new _1541MinimumInsertionsToBalanceAParenthesesString().minInsertions(")))))))"));
    }

    public int minInsertions(String s) {
        int res = 0;
        int right = 0;
        for (char c : s.toCharArray()) {
            if (c == '(') {
                if (right % 2 != 0) {
                    right--;
                    res++;
                }
                right += 2;
            } else {
                right--;
                if (right < 0) {
                    right += 2;
                    res++;
                }
            }
        }
        return res + right;
    }
}
