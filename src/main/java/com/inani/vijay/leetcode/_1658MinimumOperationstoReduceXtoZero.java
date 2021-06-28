package com.inani.vijay.leetcode;

import java.util.HashMap;
import java.util.Map;

public class _1658MinimumOperationstoReduceXtoZero {

    public static void main(String[] args) {
        System.out.println(new _1658MinimumOperationstoReduceXtoZero().minOperations(new int[]{1, 1, 4, 2, 3}, 5));
    }

    public int minOperations(int[] nums, int x) {
        int target = -x;
        for (int num : nums) {
            target += num;
        }

        if (target == 0) {
            return nums.length;
        }

        Map<Integer, Integer> prefixSumToIndex = new HashMap<>();
        prefixSumToIndex.put(0, -1);

        int sum = 0;
        int result = Integer.MIN_VALUE;

        for (int i = 0; i < nums.length; i++) {

            sum += nums[i];

            if (prefixSumToIndex.containsKey(sum - target)) {
                result = Integer.max(result, i - prefixSumToIndex.get(sum - target));
            }

            prefixSumToIndex.put(sum, i);

        }

        return result == Integer.MIN_VALUE ? -1 : nums.length - result;

    }
}
