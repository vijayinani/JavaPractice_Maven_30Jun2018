package com.inani.vijay.leetcode;

public class _628MaximumProductofThreeNumbers {

    public static void main(String[] args) {
        System.out.println(new _628MaximumProductofThreeNumbers().maximumProduct(new int[]{1, 2, 3, 4}));
    }

    /*
    public int maximumProduct(int[] nums) {
        int maxProd = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length - 2; i++) {
            for (int j = i + 1; j < nums.length - 1; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    int prod = nums[i] * nums[j] * nums[k];
                    if (prod > maxProd) {
                        maxProd = prod;
                    }
                }
            }
        }
        return maxProd;
    }
    */

    public int maximumProduct(int[] nums) {
        int minFirst = Integer.MAX_VALUE;
        int minSecond = Integer.MAX_VALUE;
        int maxFirst = Integer.MIN_VALUE;
        int maxSecond = Integer.MIN_VALUE;
        int maxThird = Integer.MIN_VALUE;
        for (int num : nums) {
            if (num < minFirst) {
                minSecond = minFirst;
                minFirst = num;
            } else if (num < minSecond) {
                minSecond = num;
            }

            if (num > maxFirst) {
                maxThird = maxSecond;
                maxSecond = maxFirst;
                maxFirst = num;
            } else if (num > maxSecond) {
                maxThird = maxSecond;
                maxSecond = num;
            } else if (num > maxThird) {
                maxThird = num;
            }
        }
        return Math.max(minFirst * minSecond * maxFirst, maxFirst * maxSecond * maxThird);
    }
}
