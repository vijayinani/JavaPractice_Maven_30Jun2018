package com.inani.vijay.leetcode;

public class _520DetectCapital {

    public static void main(String[] args) {
        System.out.println(new _520DetectCapital().detectCapitalUse("Hello"));
    }

    public boolean detectCapitalUse(String word) {
        int upperCount = 0;
        for (int i = 0; i < word.length(); i++) {
            if (Character.isUpperCase(word.charAt(i))) {
                upperCount++;
            }
        }
        if (upperCount == 1) {
            return Character.isUpperCase(word.charAt(0));
        }

        return upperCount == 0 || upperCount == word.length();
    }
}
