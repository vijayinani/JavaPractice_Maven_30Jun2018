package com.inani.vijay.leetcode;

public class LengthOfLastWord {

    public static void main(String[] args) {
        System.out.println(new LengthOfLastWord().lengthOfLastWord("Hello World"));
    }

    public int lengthOfLastWord(String s) {
        s = s.trim();
        int count = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) != ' ') {
                count++;
            } else {
                break;
            }
        }
        return count;
    }
}
