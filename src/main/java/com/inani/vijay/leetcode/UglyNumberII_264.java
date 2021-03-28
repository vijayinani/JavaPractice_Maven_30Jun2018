package com.inani.vijay.leetcode;

public class UglyNumberII_264 {

    public static void main(String[] args) {
        System.out.println(new UglyNumberII_264().nthUglyNumber(10));
    }

    /*public int nthUglyNumber(int n) {
        if (n == 1) return 1;
        int val = 2;
        int count = 1;
        while (count < n) {
            int curr = val;
            for (int i = 2; i < 6; i++) {
                while (curr % i == 0) {
                    curr = curr / i;
                }
            }
            if (curr == 1) {
                count++;
            }
            val++;
        }
        return --val;
    }*/

    public int nthUglyNumber(int n) {
        int[] k = new int[n];
        k[0] = 1;
        int t2 = 0, t3 = 0, t5 = 0;
        for (int i = 1; i < n; i++) {
            k[i] = Math.min(Math.min(k[t2] * 2, k[t3] * 3), k[t5] * 5);
            if (k[i] == 2 * k[t2]) t2++;
            if (k[i] == 3 * k[t3]) t3++;
            if (k[i] == 5 * k[t5]) t5++;
        }
        return k[n - 1];
    }
}
