package com.inani.vijay.leetcode;

public class AddBinary {

    public static void main(String[] args) {
        System.out.println(new AddBinary().addBinary("1010", "1011"));
    }

    public String addBinary(String a, String b) {
        int i = a.length() - 1;
        int j = b.length() - 1;
        StringBuilder result = new StringBuilder();
        int carry = 0;
        while (i >= 0 || j >= 0) {
            int sum = carry;
            if (i >= 0) {
                sum += a.charAt(i) - '0';
                i--;
            }
            if (j >= 0) {
                sum += b.charAt(j) - '0';
                j--;
            }
            result.append(sum % 2);
            carry = sum / 2;
        }
        if (carry != 0) {
            result.append(carry);
        }
        return result.reverse().toString();
    }
}
