package com.inani.vijay.leetcode;

public class _50Powxn {

    public static void main(String[] args) {

        // 0.00001
        // 2147483647

        // 2.00000
        // -2147483648

        System.out.println(new _50Powxn().myPow(2.00000, -2147483648));
    }

    /*public double myPow(double x, int n) {
        double result = x;
        if (n == 0) return 1;
        else if (n == 1) return x;
        else {
            for (int i = 2; i <= Math.abs(n); i++) {
                result = result * x;
            }
            if (n < 0) {
                result = 1 / result;
            }
        }
        return result;
    }*/

    public double myPow(double x, int n) {
        if (n == 0) return 1;
        if (n == 1) return x;
        double ans = 1;
        long absN = Math.abs((long)(n));
        while (absN > 0) {
            if ((absN & 1) == 1) {
                ans = ans * x;
            }
            absN >>= 1;
            x =  x * x;
        }
        return n < 0? 1/ ans : ans;
    }
}
