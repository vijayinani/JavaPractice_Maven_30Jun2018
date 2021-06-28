package com.inani.vijay.leetcode;

public class _724FindPivotIndex {

    public static void main(String[] args) {
        System.out.println(new _724FindPivotIndex().pivotIndex(new int[]{1, 7, 3, 6, 5, 6}));
    }

    public int pivotIndex(int[] nums) {
        int totalSum = 0;
        int leftSum = 0;
        for (int num : nums) totalSum += num;
        for (int i = 0; i < nums.length; i++) {
            if (leftSum == totalSum - nums[i] - leftSum) return i;
            leftSum += nums[i];
        }
        return -1;
    }
}

