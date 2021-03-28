package com.inani.vijay.leetcode;

public class MultiplyStrings_43 {

    public static void main(String[] args) {
        System.out.println(new MultiplyStrings_43().multiply("123", "456"));
    }

    public String multiply(String num1, String num2) {

        int m = num1.length();
        int n = num2.length();

        int[] result = new int[m + n];

        for (int i = m - 1; i >= 0; i--) {
            for (int j = n - 1; j >= 0; j--) {
                int mul = (num1.charAt(i) - '0') * (num2.charAt(j) - '0');
                int p1 = i + j;
                int p2 = i + j + 1;
                int sum = mul + result[p2];
                result[p1] += sum / 10;
                result[p2] = sum % 10;
            }
        }

        StringBuilder stringBuilder = new StringBuilder();
        for (int val : result) {
            if (val != 0 || stringBuilder.length() != 0) {
                stringBuilder.append(val);
            }
        }

        if (stringBuilder.length() == 0) {
            return "0";
        } else {
            return stringBuilder.toString();
        }
    }
}
