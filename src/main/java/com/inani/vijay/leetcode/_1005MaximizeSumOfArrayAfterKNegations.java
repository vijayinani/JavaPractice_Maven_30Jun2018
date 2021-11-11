package com.inani.vijay.leetcode;

import java.util.Arrays;

public class _1005MaximizeSumOfArrayAfterKNegations {

    public static void main(String[] args) {
        System.out.println(new _1005MaximizeSumOfArrayAfterKNegations().largestSumAfterKNegations(new int[]{4, 2, 3}, 1));
    }

    public int largestSumAfterKNegations(int[] nums, int k) {
        Arrays.sort(nums);
        for (int i = 0; k > 0 && i < nums.length && nums[i] < 0; i++, k--) {
            nums[i] = -nums[i];
        }
        int result = 0;
        int min = Integer.MAX_VALUE;
        for (int val : nums) {
            result += val;
            min = Math.min(min, val);
        }

        return result - (k % 2) * min * 2;
    }
}

