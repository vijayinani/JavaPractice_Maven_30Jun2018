package com.inani.vijay.leetcode;

import java.math.BigInteger;
import java.util.Arrays;

public class _1175PrimeArrangements {
    public int numPrimeArrangements(int n) {
        int primesCount = findPrimesCount(n);
        BigInteger primePermutationsCount = findFactorial(primesCount);
        BigInteger nonPrimePermutationsCount = findFactorial(n - primesCount);

        return primePermutationsCount.multiply(nonPrimePermutationsCount).mod(BigInteger.valueOf(1000000007)).intValue();
    }

    private BigInteger findFactorial(int n) {

        int MOD = 1000000007;

        BigInteger factorial = BigInteger.ONE;
        for (int i = 2; i <= n; i++) {
            factorial = factorial.multiply(BigInteger.valueOf(i));
        }
        return factorial.mod(BigInteger.valueOf(MOD));
    }

    private int findPrimesCount(int n) {
        boolean[] primes = new boolean[n + 1];
        Arrays.fill(primes, 2, n + 1, true);
        for (int i = 2; i * i <= n; i++) {
            if (primes[i]) {
                for (int j = i * i; j <= n; j += i) {
                    primes[j] = false;
                }
            }
        }
        int count = 0;
        for (int i = 0; i < primes.length; i++) {
            if (primes[i]) {
                count++;
            }
        }
        return count;
    }
}
