package com.inani.vijay.leetcode;

public class MissingNumber_268 {

    public static void main(String[] args) {
        System.out.println(new MissingNumber_268().missingNumber(new int[]{3,0,1}));
    }


    public int missingNumber(int[] nums) {
        int n = nums.length;
        int expectedSum = (n * (n + 1)) / 2;
        int actualSum = 0;
        for(int num:nums) actualSum += num;
        return expectedSum - actualSum;
    }
}
