package com.inani.vijay.leetcode;

public class _198HouseRobber {

    public static void main(String[] args) {
        System.out.println(new _198HouseRobber().rob(new int[]{2, 1, 1, 2}));
    }

    public int rob(int[] nums) {
        int a = 0;
        int b = 0;
        for (int i = 0; i < nums.length; i++) {
            if ((i % 2) == 0) {
                a = Math.max(a + nums[i], b);
            } else {
                b = Math.max(a, b + nums[i]);
            }
        }
        return Math.max(a, b);
    }
}
