package com.inani.vijay.leetcode;

public class CountPrimes_204 {

    public static void main(String[] args) {
        System.out.println(new CountPrimes_204().countPrimes(10));
    }

    /*public int countPrimes(int n) {
        int count = 0;
        boolean[] notPrime = new boolean[n];
        for (int i = 2; i < Math.sqrt(n); i++) {
            if (notPrime[i] == false) {
                for (int j = 2; i * j < n; j++) {
                    notPrime[i * j] = true;
                }
            }
        }

        for (int i = 2; i < n; i++) {
            if (!notPrime[i]) count++;
        }

        return count;
    }*/

    public int countPrimes(int n) {
        if (n < 3)
            return 0;

        boolean[] f = new boolean[n];
        //Arrays.fill(f, true); boolean[] are initialed as false by default
        int count = n / 2;
        for (int i = 3; i * i < n; i += 2) {
            if (f[i])
                continue;

            for (int j = i * i; j < n; j += 2 * i) {
                if (!f[j]) {
                    --count;
                    f[j] = true;
                }
            }
        }
        return count;
    }
}