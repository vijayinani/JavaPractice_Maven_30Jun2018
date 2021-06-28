package com.inani.vijay.leetcode;

import java.util.Arrays;

public class _1160FindWordsThatCanBeFormedbyCharacters {

    public static void main(String[] args) {
        System.out.println(new _1160FindWordsThatCanBeFormedbyCharacters().countCharacters(new String[]{"cat", "bt", "hat", "tree"}, "atach"));
    }

    public int countCharacters(String[] words, String chars) {
        int count = 0;
        int[] charsOccurCount = new int[26];
        for (char c : chars.toCharArray()) {
            charsOccurCount[c - 'a']++;
        }
        for (String word : words) {
            int[] currCharsOccurCount = Arrays.copyOf(charsOccurCount, charsOccurCount.length);
            int currCount = 0;
            for (char c : word.toCharArray()) {
                if (currCharsOccurCount[c - 'a'] > 0) {
                    currCharsOccurCount[c - 'a']--;
                    currCount++;
                }
            }
            if (currCount == word.length()) {
                count += currCount;
            }
        }
        return count;
    }
}
