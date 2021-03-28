package com.inani.vijay.leetcode;

public class ValidPerfectSquare_367 {

    public static void main(String[] args) {
        System.out.println(new ValidPerfectSquare_367().isPerfectSquare(5));
    }

    public boolean isPerfectSquare(int num) {
        int left = 1;
        int right = num;
        while (left <= right) {
            long mid = left + (right - left) / 2;
            if (mid * mid == num) {
                return true;
            } else if (mid * mid < num) {
                left = (int) mid + 1;
            } else {
                right = (int) mid - 1;
            }
        }
        return false;
    }
}
