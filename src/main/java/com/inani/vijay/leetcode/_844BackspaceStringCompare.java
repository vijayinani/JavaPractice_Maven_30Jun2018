package com.inani.vijay.leetcode;

import java.util.ArrayList;
import java.util.List;

public class _844BackspaceStringCompare {

    public static void main(String[] args) {
        System.out.println(new _844BackspaceStringCompare().backspaceCompare("ab#c", "ad#c"));
    }


    public boolean backspaceCompare(String s, String t) {
        List<Character> sChars = generateFinalString(s);
        List<Character> tChars = generateFinalString(t);
        return sChars.equals(tChars);
    }

    private List<Character> generateFinalString(String s) {
        List<Character> finalChars = new ArrayList<>();
        for (char c : s.toCharArray()) {
            if (c != '#') {
                finalChars.add(c);
            } else {
                if (finalChars.size() > 0) {
                    finalChars.remove(finalChars.size() - 1);
                }
            }
        }
        return finalChars;
    }
}
