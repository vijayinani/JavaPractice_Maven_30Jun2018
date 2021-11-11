package com.inani.vijay.leetcode;

public class _1480RunningSumof1dArray {
    public int[] runningSum(int[] nums) {
        int currSum = 0;
        int i = 0;
        for (int num : nums) {
            currSum += num;
            nums[i] = currSum;
            i++;
        }
        return nums;
    }
}
