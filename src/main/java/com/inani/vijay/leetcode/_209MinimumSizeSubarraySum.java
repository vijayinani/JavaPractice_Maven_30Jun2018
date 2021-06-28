package com.inani.vijay.leetcode;

public class _209MinimumSizeSubarraySum {

    public static void main(String[] args) {
        System.out.println(new _209MinimumSizeSubarraySum().minSubArrayLen(7, new int[]{2, 3, 1, 2, 4, 3}));
    }

    public int minSubArrayLen(int target, int[] nums) {
        int res = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) {
            int sum = 0;
            for (int j = i; j < nums.length; j++) {
                sum += nums[j];
                if (sum >= target) {
                    res = Math.min(res, j - i + 1);
                }
            }
        }
        return res == Integer.MAX_VALUE ? 0 : res;
    }
}
