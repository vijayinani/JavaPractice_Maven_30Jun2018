package com.inani.vijay.leetcode;

public class _1446ConsecutiveCharacters {

    public static void main(String[] args) {
        System.out.println(new _1446ConsecutiveCharacters().maxPower("leetcode"));
    }

    public int maxPower(String s) {
        int n = s.length();
        if (n == 0) {
            return 0;
        }
        int power[] = new int[n];
        power[0] = 1;
        for (int i = 1; i < n; i++) {
            if (s.charAt(i - 1) == s.charAt(i)) {
                power[i] = power[i - 1] + 1;
            } else {
                power[i] = 1;
            }
        }
        int max = 0;
        for (int currPow : power) {
            if (currPow > max) {
                max = currPow;
            }
        }
        return max;
    }
}
