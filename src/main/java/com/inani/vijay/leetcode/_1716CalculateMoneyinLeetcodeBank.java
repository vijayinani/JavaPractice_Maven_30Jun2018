package com.inani.vijay.leetcode;

public class _1716CalculateMoneyinLeetcodeBank {

    public static void main(String[] args) {
        System.out.println(new _1716CalculateMoneyinLeetcodeBank().totalMoney(32));
    }

    /*public int totalMoney(int n) {
        int s = 1;
        int total = 0;
        while (n > 0) {
            for (int i = 0; i < 7 && n > 0; i++) {
                total += i + s;
                n--;
            }
            s++;
        }
        return total;
    }*/

    public int totalMoney(int n) {
        int m = n / 7;
        int total = 0;
        for (int i = 1; i <= m; i++) {
            total += 7 * (i + 3);
        }
        for (int i = 7 * m; i < n; i++) {
            m++;
            total += m;
        }
        return total;
    }
}
