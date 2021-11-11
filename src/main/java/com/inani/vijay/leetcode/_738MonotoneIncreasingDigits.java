package com.inani.vijay.leetcode;

public class _738MonotoneIncreasingDigits {

    public static void main(String[] args) {
        System.out.println(new _738MonotoneIncreasingDigits().monotoneIncreasingDigits(332));
    }


    public int monotoneIncreasingDigits(int n) {
        char[] digits = String.valueOf(n).toCharArray();

        int len = digits.length;

        int m = len;

        for (int i = len - 1; i > 0; i--) {
            if (digits[i - 1] > digits[i]) {
                m = i - 1;
                digits[i - 1]--;

            }
        }

        for (int i = m + 1; i < len; i++) {
            digits[i] = '9';
        }

        return Integer.parseInt(new String(digits));
    }

}
