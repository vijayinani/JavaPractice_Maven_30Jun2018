package com.inani.vijay.leetcode;

public class _66PlusOne {
    public int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if(digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }
        int[] finalNumber = new int[digits.length + 1];
        finalNumber[0] = 1;
        return finalNumber;
    }
}
