package com.inani.vijay.leetcode;

public class LongestPalindromeSubstring {

    private static int startIndex;
    private static int maxLength;

    public static void main(String[] args) {
        System.out.println(longestPalindrome("ababb"));
    }

    public static String longestPalindrome(String s) {

        if (s.length() < 2) return s;

        for (int i = 0; i < s.length(); i++) {
            expandAndCheck(s, i, i);
            expandAndCheck(s, i, i + 1);
        }
        return s.substring(startIndex, startIndex + maxLength);
    }

    private static void expandAndCheck(String s, int begin, int end) {
        while (begin >= 0 && end < s.length() && s.charAt(begin) == s.charAt(end)) {
            begin--;
            end++;
        }
        if (maxLength < end - begin - 1) {
            startIndex = begin + 1;
            maxLength = end - begin - 1;
        }
    }
}
