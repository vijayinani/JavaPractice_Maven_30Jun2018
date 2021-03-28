package com.inani.vijay.dummy;

public class Fibonacci_NonRecursive {
    public static void main(String[] args) {
        fibbonacci(10);
    }

    private static int fibbonacci(int n) {
        int first = 0;
        int second = 1;
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        }
        int result = 1;
        for (int i = 2; i <= n; i++) {
            result = first + second;
            first = second;
            second = result;
            System.out.println(result);
        }
        return result;
    }
}
