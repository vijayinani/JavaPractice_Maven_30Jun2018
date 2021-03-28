package com.inani.vijay.leetcode;

public class PowerOfFour_342 {

    public static void main(String[] args) {
        System.out.println(new PowerOfFour_342().isPowerOfFour(16));
    }


    public boolean isPowerOfFour(int n) {
        if(n < 1) return false;
        while (n % 4 == 0) {
            n = n / 4;
        }
        return n == 1;
    }
}
