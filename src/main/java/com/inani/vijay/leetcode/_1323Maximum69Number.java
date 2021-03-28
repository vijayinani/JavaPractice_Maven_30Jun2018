package com.inani.vijay.leetcode;

public class _1323Maximum69Number {

    public static void main(String[] args) {
        System.out.println(new _1323Maximum69Number().maximum69Number(9999));
    }

    /*public int maximum69Number (int num) {
        return Integer.parseInt(String.valueOf(num).replaceFirst("6", "9"));
    }*/

    public int maximum69Number(int num) {
        int firstSix = -1;
        int number = num;
        int i = 0;
        while (number > 0) {
            if (number % 10 == 6) {
                firstSix = i;
            }
            number = number / 10;
            i++;
        }
        return num + 3 * (int) (Math.pow(10, firstSix));
    }
}
