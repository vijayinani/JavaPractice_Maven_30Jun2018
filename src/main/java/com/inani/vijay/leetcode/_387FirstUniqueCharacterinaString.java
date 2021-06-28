package com.inani.vijay.leetcode;

import sun.awt.image.ImageWatched;

import java.util.*;

public class _387FirstUniqueCharacterinaString {

    public static void main(String[] args) {
        System.out.println(new _387FirstUniqueCharacterinaString().firstUniqChar("loveleetcode"));
    }

    public int firstUniqChar(String s) {
        Set<Character> repeated = new HashSet<>();
        Set<Character> firstTime = new LinkedHashSet<>();
        for (char c : s.toCharArray()) {
            if (!repeated.contains(c)) {
                if (!firstTime.contains(c)) {
                    firstTime.add(c);
                } else {
                    repeated.add(c);
                    firstTime.remove(c);
                }
            }
        }
        return firstTime.size() > 0 ? s.indexOf(firstTime.stream().findFirst().get()) : -1;
    }
}
