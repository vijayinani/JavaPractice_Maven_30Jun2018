package com.inani.vijay.leetcode;

public class SuperUglyNumber_313 {

    public static void main(String[] args) {
        System.out.println(new SuperUglyNumber_313().nthSuperUglyNumberI(12, new int[]{2, 7, 13, 19}));
    }

    public int nthSuperUglyNumberI(int n, int[] primes) {
        int[] ugly = new int[n];
        int[] idx = new int[primes.length];
        ugly[0] = 1;
        for (int i = 1; i < n; i++) {
            ugly[i] = Integer.MAX_VALUE;
            for (int j = 0; j < primes.length; j++) {
                ugly[i] = Math.min(ugly[i], primes[j] * ugly[idx[j]]);
            }

            for(int k = 0; k<primes.length;k++) {
                if(primes[k] * ugly[idx[k]] <= ugly[i]) idx[k]++;
            }
        }
        return ugly[n - 1];
    }
}
