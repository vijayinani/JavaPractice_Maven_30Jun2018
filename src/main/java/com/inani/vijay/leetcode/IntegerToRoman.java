package com.inani.vijay.leetcode;

public class IntegerToRoman {

    public static void main(String[] args) {
        System.out.println(new IntegerToRoman().intToRoman(1994));
    }

    public String intToRoman(int num) {

        StringBuilder stringBuilder = new StringBuilder();

        int[] integer = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] roman = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

        int i = 0;

        while (num > 0) {
            while (num >= integer[i]) {
                num -= integer[i];
                stringBuilder.append(roman[i]);
            }
            i++;
        }
        return stringBuilder.toString();
    }
}
