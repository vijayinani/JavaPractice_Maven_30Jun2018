package com.inani.vijay;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class FirstNonRepeatingInteger {

    public static void main(String[] args) {
        System.out.println(new FirstNonRepeatingInteger().firstNonRepeatingInteger(new int[]{3, 2, 5, 5, 3, 2, 1, 39, 44, -23, -23, 49, 39, 42, 11, -36, 43, 2, 1, -444}));
    }

    private int firstNonRepeatingInteger(int[] input) {

        Set<Integer> repeated = new HashSet<>();
        Set<Integer> firstTime = new LinkedHashSet<>();

        for (int currVal : input) {
            if (!repeated.contains(currVal)) {
                if (!firstTime.contains(currVal)) {
                    firstTime.add(currVal);
                } else {
                    firstTime.remove(currVal);
                    repeated.add(currVal);
                }
            }
        }
        if (firstTime.size() > 0) {
            return firstTime.stream().findFirst().get();
        } else {
            return -1;
        }
    }

    private int firstUniqChar(String s) {

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

        if (firstTime.size() > 0) {
            return s.indexOf(firstTime.stream().findFirst().get());
        } else {
            return -1;
        }

    }

}
