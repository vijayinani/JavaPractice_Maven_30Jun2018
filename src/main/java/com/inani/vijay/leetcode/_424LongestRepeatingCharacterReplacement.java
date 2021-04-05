package com.inani.vijay.leetcode;

public class _424LongestRepeatingCharacterReplacement {

    public static void main(String[] args) {
        System.out.println(new _424LongestRepeatingCharacterReplacement().characterReplacement("AABABCC", 1));
    }

    public int characterReplacement(String s, int k) {
        int max = 0;
        int[] frequency = new int[26];
        int mostFrequentLetter = 0;
        int left = 0;
        for (int right = 0; right < s.length(); right++) {
            frequency[s.charAt(right) - 'A']++;
            mostFrequentLetter = Math.max(mostFrequentLetter, frequency[s.charAt(right) - 'A']);
            int lettersToChange = right - left + 1 - mostFrequentLetter;
            if (lettersToChange > k) {
                frequency[s.charAt(left) - 'A']--;
                left++;
            }
            max = Math.max(max, right - left + 1);
        }
        return max;
    }
}
