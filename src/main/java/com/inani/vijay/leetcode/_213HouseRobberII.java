package com.inani.vijay.leetcode;

public class _213HouseRobberII {

    public static void main(String[] args) {
        System.out.println(new _213HouseRobberII().rob(new int[]{1, 2, 3, 1}));
    }

    public int rob(int[] nums) {
        int n = nums.length;
        if(n == 1) {
            return nums[0];
        }
        return Math.max(robber(nums, 0, n - 2), robber(nums, 1, n - 1));
    }

    private int robber(int[] nums, int low, int high) {
        int money = 0;
        int preMoney = 0;
        for (int i = low; i <= high; i++) {
            int temp = Math.max(money, preMoney + nums[i]);
            preMoney = money;
            money = temp;
        }
        return money;
    }
}

