package com.inani.vijay.leetcode;

public class NthDigit_400 {

    public static void main(String[] args) {
        System.out.println(new NthDigit_400().findNthDigit(17));
    }

    public int findNthDigit(int n) {
        int len = 1;
        int start = 1;
        int count = 9;

        while (n > len * count) {
            n = n - len * count;
            count = count * 10;
            len = len + 1;
            start = start * 10;
        }

        start = start + (n - 1) / len;
        String s = Integer.toString(start);
        return Character.getNumericValue(s.charAt((n - 1) % len));
    }
}
