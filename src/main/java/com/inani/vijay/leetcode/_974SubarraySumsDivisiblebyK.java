package com.inani.vijay.leetcode;

import java.util.HashMap;
import java.util.Map;

public class _974SubarraySumsDivisiblebyK {

    public static void main(String[] args) {
        System.out.println(new _974SubarraySumsDivisiblebyK().subarraysDivByK(new int[]{4, 5, 0, -2, -3, 1}, 5));
    }

/*    public int subarraysDivByK(int[] A, int K) {
        int count = 0;
        for (int i = 0; i < A.length; i++) {
            int sum = 0;
            for (int j = i; j < A.length; j++) {
                sum += A[j];
                if (sum % K == 0) {
                    count++;
                }
            }
        }
        return count;
    }*/

    public int subarraysDivByK(int[] A, int K) {
        int count = 0;
        int sum = 0;
        int[] sumToCount = new int[K];
        sumToCount[0] = 1;
        for (int num : A) {
            sum = (sum + num) % K;
            if (sum < 0) sum += K;
            count += sumToCount[sum];
            sumToCount[sum]++;
        }
        return count;
    }
}
