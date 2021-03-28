package com.inani.vijay.leetcode;

public class StringToIntegerAtoi {

    public static void main(String[] args) {
        System.out.println(new StringToIntegerAtoi().myAtoi(" "));
    }

    public static int myAtoi(String str) {
        if (str == null || str.length() == 0)
            return 0;

        int len = str.length();

        int i = 0, sign = 1, sum = 0;

        while (i < len && str.charAt(i) == ' ') {
            i++;
        }

        if (i < len && str.charAt(i) == '-') {
            sign = -1;
            i++;
        } else if (i < len && str.charAt(i) == '+') {
            i++;
        }


        while (i < len) {

            int digit = str.charAt(i) - '0';

            if (digit < 0 || digit > 9) {
                break;
            }

            //check if total will be overflow after 10 times and add digit
            if (Integer.MAX_VALUE / 10 < sum || Integer.MAX_VALUE / 10 == sum && Integer.MAX_VALUE % 10 < digit)
                return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;

            sum = sum * 10 + digit;
            i++;
        }
        return sign * sum;
    }
}
