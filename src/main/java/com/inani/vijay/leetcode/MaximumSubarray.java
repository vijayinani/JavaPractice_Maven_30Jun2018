package com.inani.vijay.leetcode;

public class MaximumSubarray {

    public static void main(String[] args) {
        System.out.println(new MaximumSubarray().maxSubArray(new int[]{-100000, -1000, -10000}));
    }

    public int maxSubArray(int[] A) {
        int max = Integer.MIN_VALUE, sum = 0;
        for (int i = 0; i < A.length; i++) {
            if (sum < 0)
                sum = A[i];
            else
                sum += A[i];
            if (sum > max)
                max = sum;
        }
        return max;
    }
}
