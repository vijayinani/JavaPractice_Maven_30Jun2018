package com.inani.vijay.leetcode;

public class SingleNumber_136 {

    public static void main(String[] args) {
        System.out.println(new SingleNumber_136().singleNumber(new int[]{2, 2, 1}));
    }

    public int singleNumber(int[] nums) {
        int result = 0;
        for (int num : nums) {
            result ^= num;
        }
        return result;
    }
}

