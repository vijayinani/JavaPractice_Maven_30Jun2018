package com.inani.vijay.leetcode;

public class FirstMissingPositive_41 {
    public static void main(String[] args) {
        System.out.println(new FirstMissingPositive_41().firstMissingPositive(new int[]{2, 1, 0}));
    }

    public int firstMissingPositive(int[] nums) {
        int n = nums.length;
        boolean oneFound = false;
        for (int i = 0; i < n; i++) {
            if (nums[i] == 1) {
                oneFound = true;
            } else if (nums[i] <= 0 || nums[i] > n) {
                nums[i] = 1;
            }
        }

        if (!oneFound) return 1;

        for (int i = 0; i < n; i++) {
            int index = Math.abs(nums[i]) - 1;
            if (nums[index] > 0) {
                nums[index] = nums[index] * -1;
            }
        }

        for (int i = 0; i < n; i++) {
            if (nums[i] > 0) {
                return i + 1;
            }
        }
        return n + 1;
    }
}
