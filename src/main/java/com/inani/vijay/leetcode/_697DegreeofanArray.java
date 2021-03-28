package com.inani.vijay.leetcode;

import java.util.HashMap;
import java.util.Map;

public class _697DegreeofanArray {

    public static void main(String[] args) {
        System.out.println(new _697DegreeofanArray().findShortestSubArray(new int[]{1, 2, 2, 3, 1}));
    }

    public int findShortestSubArray(int[] nums) {
        int result = 0;
        int degree = 0;
        Map<Integer, Integer> first = new HashMap<>();
        Map<Integer, Integer> count = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            first.putIfAbsent(nums[i], i);
            count.put(nums[i], count.getOrDefault(nums[i], 0) + 1);
            if (count.get(nums[i]) > degree) {
                degree = count.get(nums[i]);
                result = i - first.get(nums[i]) + 1;
            } else if (count.get(nums[i]) == degree) {
                result = Math.min(result, i - first.get(nums[i]) + 1);
            }
        }
        return result;
    }
}
