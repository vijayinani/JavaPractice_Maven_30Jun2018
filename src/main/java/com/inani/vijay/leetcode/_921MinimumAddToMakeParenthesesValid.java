package com.inani.vijay.leetcode;

public class _921MinimumAddToMakeParenthesesValid {
    public int minAddToMakeValid(String s) {
        int left = 0;
        int right = 0;
        for (char c : s.toCharArray()) {
            if (c == '(') {
                right++;
            } else if (right > 0) {
                right--;
            } else {
                left++;
            }
        }
        return left + right;
    }
}
