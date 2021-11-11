package com.inani.vijay.leetcode;

public class _611ValidTriangleNumber {

    public static void main(String[] args) {
        System.out.println(new _611ValidTriangleNumber().triangleNumber(new int[]{4, 2, 3, 4}));
    }

    public int triangleNumber(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length - 2; i++) {
            for (int j = i + 1; j < nums.length - 1; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    if (nums[i] + nums[j] > nums[k] && nums[i] + nums[k] > nums[j] && nums[j] + nums[k] > nums[i]) {
                        count++;
                    }
                }
            }
        }
        return count;
    }
}
