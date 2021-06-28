package com.inani.vijay.leetcode;

import java.util.HashMap;
import java.util.Map;

public class _523ContinuousSubarraySum {

    public static void main(String[] args) {
        System.out.println(new _523ContinuousSubarraySum().checkSubarraySum(new int[]{23, 2, 4, 6, 6}, 7));
    }

    public boolean checkSubarraySum(int[] nums, int k) {
        int runningSum = 0;
        Map<Integer, Integer> found = new HashMap() {{
            put(0, -1);
        }};
        for (int i = 0; i < nums.length; i++) {
            runningSum += nums[i];
            if (k != 0) {
                runningSum %= k;
            }
            Integer prev = found.get(runningSum);
            if (prev != null) {
                if (i - prev > 1) {
                    return true;
                }
            } else {
                found.put(runningSum, i);
            }
        }
        return false;
    }
}
