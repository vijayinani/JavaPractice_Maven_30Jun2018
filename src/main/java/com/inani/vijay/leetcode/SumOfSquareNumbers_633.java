package com.inani.vijay.leetcode;

public class SumOfSquareNumbers_633 {

    public static void main(String[] args) {
        System.out.println(new SumOfSquareNumbers_633().judgeSquareSum(5));
    }

    public boolean judgeSquareSum(int c) {
        int left = 0, right = (int) Math.sqrt(c);
        while (left <= right) {
            int curr = left * left + right * right;
            if (curr > c) {
                right--;
            } else if (curr < c) {
                left++;
            } else {
                return true;
            }
        }
        return false;
    }
}
