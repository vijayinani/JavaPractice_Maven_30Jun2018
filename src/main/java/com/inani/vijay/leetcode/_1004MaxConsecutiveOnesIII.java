package com.inani.vijay.leetcode;

public class _1004MaxConsecutiveOnesIII {

    public static void main(String[] args) {
        System.out.println(new _1004MaxConsecutiveOnesIII().longestOnes(new int[]{0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 0, 0, 0, 1, 1, 1, 1}, 3));
    }

    /*public int longestOnes(int[] A, int K) {
        int i = 0, j;
        for (j = 0; j < A.length; j++) {
            if (A[j] == 0) {
                K--;
            }

            if (K < 0 && A[i++] == 0) {
                K++;
            }
        }
        return j - i;
    }*/

    public int longestOnes(int[] A, int K) {
        int max = 0;
        int zeroCount = 0;
        int i = 0;
        for (int j = 0; j < A.length; j++) {
            if (A[j] == 0) {
                zeroCount++;
            }

            if (zeroCount > K && A[i++] == 0) {
                zeroCount--;
            }
            max = Math.max(max, j - i + 1);
        }
        return max;
    }
}
