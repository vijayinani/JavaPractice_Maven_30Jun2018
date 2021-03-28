package com.inani.vijay.leetcode;

public class _509FibonacciNumber {

    public static void main(String[] args) {
        System.out.println(new _509FibonacciNumber().fib(10));
    }

    /*public int fib(int n) {
        if (n <= 1) return n;
        return fib(n - 2) + fib(n - 1);
    }*/

    /*public int fib(int n) {
        if (n <= 1) return n;
        int[] fib = new int[n + 1];
        fib[0] = 0;
        fib[1] = 1;
        for (int i = 2; i <= n; i++) {
            fib[i] = fib[i - 1] + fib[i - 2];
        }
        return fib[n];
    }*/

    public int fib(int n) {
        if (n <= 1) return n;
        int a = 0;
        int b = 1;
        int result = 0;
        for (int i = 2; i <= n; i++) {
            result = a + b;
            a = b;
            b = result;
        }
        return result;
    }
}

