package com.inani.vijay.leetcode;

public class _152MaximumProductSubarray {

    public static void main(String[] args) {
        System.out.println(new _152MaximumProductSubarray().maxProduct(new int[]{2, 3, -2, 4}));
    }

    public int maxProduct(int[] nums) {
        int prod = 1;
        int maxProd = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            prod *= nums[i];
            if (prod > maxProd) {
                maxProd = prod;
            }
            if (prod == 0) prod = 1;
        }
        prod = 1;
        for (int i = nums.length - 1; i >= 0; i--) {
            prod *= nums[i];
            if (prod > maxProd) {
                maxProd = prod;
            }
            if (prod == 0) {
                prod = 1;
            }
        }
        return maxProd;
    }
}
