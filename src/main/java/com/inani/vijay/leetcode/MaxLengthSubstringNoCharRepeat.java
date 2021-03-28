package com.inani.vijay.leetcode;

import java.util.HashMap;

public class MaxLengthSubstringNoCharRepeat {
    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("abcabcbb"));
    }

    public static int lengthOfLongestSubstring(String str) {
        if (str.length() < 2) {
            return str.length();
        }

        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        int startIndex = 0;
        int currentLen = 0;
        int maxLen = 0;
        for (int i = 0; i < str.length(); i++) {
            if (map.containsKey(str.charAt(i)) && (map.get(str.charAt(i)) >= startIndex)) {
                if (currentLen > maxLen) {
                    maxLen = currentLen;
                }
                startIndex = map.get(str.charAt(i)) + 1;
                currentLen = i - startIndex + 1;
            } else {
                currentLen++;
            }
            map.put(str.charAt(i), i);
        }
        return Math.max(maxLen, currentLen);


    }
}
