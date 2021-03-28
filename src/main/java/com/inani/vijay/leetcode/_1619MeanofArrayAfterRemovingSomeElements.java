package com.inani.vijay.leetcode;

import java.util.Arrays;

public class _1619MeanofArrayAfterRemovingSomeElements {

    public static void main(String[] args) {
        System.out.println(new _1619MeanofArrayAfterRemovingSomeElements().trimMean(new int[]{6,2,7,5,1,2,0,3,10,2,5,0,5,5,0,8,7,6,8,0}));
    }

    public double trimMean(int[] arr) {
        Arrays.sort(arr);
        int n = arr.length;
        int trim = n / 20;
        int start = 0 + trim;
        int end = n - 1 - trim;
        int divisor = end - start + 1;
        int sum = 0;
        for (int i = start; i <= end; i++) {
            sum += arr[i];
        }
        return (double) sum / (double) divisor;
    }
}
