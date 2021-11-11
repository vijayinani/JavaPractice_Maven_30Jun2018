package com.inani.vijay.leetcode;

public class _55JumpGame {
    public boolean canJump(int[] nums) {
        int reach = 0;
        int i = 0;
        int n = nums.length;
        while (i < n && i <= reach) {
            reach = Math.max(reach, i + nums[i]);
        }
        return i == n;
    }
}
