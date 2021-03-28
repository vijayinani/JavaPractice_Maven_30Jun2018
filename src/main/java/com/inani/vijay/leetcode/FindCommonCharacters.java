package com.inani.vijay.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindCommonCharacters {

    public static void main(String[] args) {
        System.out.println(new FindCommonCharacters().commonChars(new String[]{"bella", "label", "roller"}));
    }

    public List<String> commonChars(String[] A) {

        List<String> result = new ArrayList<>();

        int[] outer = new int[26];
        Arrays.fill(outer, Integer.MAX_VALUE);

        for (int i = 0; i < A.length; i++) {
            int[] inner = new int[26];
            for (int j = 0; j < A[i].length(); j++) {
                inner[A[i].charAt(j) - 'a'] += 1;
            }
            for (int j = 0; j < 26; j++) {
                outer[j] = Math.min(outer[j], inner[j]);
            }
        }
        for (int i = 0; i < outer.length; i++) {

            while (outer[i] > 0) {
                result.add(String.valueOf((char) (i + 'a')));
                outer[i]--;
            }
        }
        return result;
    }
}
