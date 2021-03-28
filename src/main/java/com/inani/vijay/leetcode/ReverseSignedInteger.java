package com.inani.vijay.leetcode;

public class ReverseSignedInteger {

    public static void main(String[] args) {
        System.out.println(new ReverseSignedInteger().reverse(1534236469));
    }

    public int reverse(int x) {

        int newResult = 0;
        int result = 0;

        while (x != 0) {
            int tail = x % 10;
            newResult = result * 10 + tail;
            if ((newResult - tail) / 10 != result) return 0;
            result = newResult;
            x = x / 10;
        }

        return result;
    }
}
