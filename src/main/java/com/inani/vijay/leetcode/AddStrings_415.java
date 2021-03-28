package com.inani.vijay.leetcode;

public class AddStrings_415 {

    public static void main(String[] args) {
        System.out.println(new AddStrings_415().addStrings("54323455679", "67678678678785465"));
    }

    public String addStrings(String num1, String num2) {
        int i = num1.length() - 1;
        int j = num2.length() - 1;

        int carry = 0;

        StringBuilder res = new StringBuilder();

        while (i >= 0 || j >= 0) {

            int sum = 0;
            sum += carry;

            if (i >= 0) {
                sum += num1.charAt(i) - '0';
                i--;
            }

            if (j >= 0) {
                sum += num2.charAt(j) - '0';
                j--;
            }

            res.append(sum % 10);
            carry = sum / 10;
        }
        if (carry > 0) {
            res.append(carry);
        }
        return res.reverse().toString();
    }

}
