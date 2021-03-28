package com.inani.vijay.leetcode;

public class UglyNumber_263 {

    public static void main(String[] args) {
        System.out.println(new UglyNumber_263().isUgly(5));
    }

    public boolean isUgly(int n) {
        if (n > 0) {
            for (int i = 2; i < 6; i++) {
                while (n % i == 0) {
                    n = n / i;
                }
            }
        }
        return n == 1;
    }
}
