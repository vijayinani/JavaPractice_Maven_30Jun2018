package com.inani.vijay.leetcode;

public class _1137NthTribonacciNumber {

    public static void main(String[] args) {
        System.out.println(new _1137NthTribonacciNumber().tribonacci(4));
    }

    public int tribonacci(int n) {
        if (n <= 1) return n;
        if (n == 2) return 1;
        int first = 0;
        int second = 1;
        int third = 1;
        int result = 1;
        for (int i = 3; i <= n; i++) {
            result += first + second;
            first = second;
            second = third;
            third = result;
        }
        return result;
    }
}
