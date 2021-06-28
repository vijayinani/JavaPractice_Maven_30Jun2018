package com.inani.vijay.leetcode;

import java.util.Arrays;

public class _215KthLargestElementinanArray {

    public static void main(String[] args) {
        System.out.println(new _215KthLargestElementinanArray().findKthLargest(new int[]{3, 2, 3, 1, 2, 4, 5, 5, 6}, 4));
    }

    public int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
        return nums[nums.length - k];
    }
}
