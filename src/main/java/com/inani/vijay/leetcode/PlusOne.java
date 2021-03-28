package com.inani.vijay.leetcode;

public class PlusOne {

    public static void main(String[] args) {
        int[] result = new PlusOne().plusOne(new int[]{1, 2, 3, 4});
        for (int val : result) {
            System.out.println(val);
        }
    }

    public int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }

        int[] newNumber = new int[digits.length + 1];
        newNumber[0] = 1;
        return newNumber;
    }
}
