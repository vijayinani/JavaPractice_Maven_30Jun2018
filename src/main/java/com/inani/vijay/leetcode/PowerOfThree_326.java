package com.inani.vijay.leetcode;

public class PowerOfThree_326 {

    public static void main(String[] args) {
        System.out.println(new PowerOfThree_326().isPowerOfThree(9));
    }

    public boolean isPowerOfThree(int n) {

        if (n < 1) {
             return false;
        }

        if(n % 3 != 0) {
            return  false;
        }

        while (n % 3 == 0) {
            n = n / 3;
        }

        return  n == 1;
    }
}
