package com.inani.vijay.leetcode;

import java.util.HashMap;
import java.util.Map;

public class _494TargetSum {

    public static void main(String[] args) {
        System.out.println(new _494TargetSum().findTargetSumWays(new int[]{1, 1, 1, 1, 1}, 3));
    }

    int count = 0;

    /*public int findTargetSumWays(int[] nums, int S) {
        calculate(nums, S, 0, 0);
        return count;
    }*/

    /*private void calculate(int[] nums, int sum, int index, int eval) {
        if (index == nums.length) {
            if (sum == eval) {
                count++;
            }
        } else {
            calculate(nums, sum, index + 1, eval + nums[index]);
            calculate(nums, sum, index + 1, eval - nums[index]);
        }
    }*/

    public int findTargetSumWays(int[] nums, int S) {
        Map<String, Integer> memo = new HashMap<>();
        return calculate(nums, S, 0, 0, memo);
    }

    private int calculate(int[] nums, int S, int i, int sum, Map<String, Integer> memo) {
        if (i == nums.length) {
            if (sum == S) {
                return 1;
            } else {
                return 0;
            }
        } else {
            if (memo.containsKey(i + "" + sum)) {
                return memo.get(i + "" + sum);
            }
            int add = calculate(nums, S, i + 1, sum + nums[i], memo);
            int subtract = calculate(nums, S, i + 1, sum - nums[i], memo);

            memo.put(i + "" + sum, add + subtract);
            return memo.get(i + "" + sum);
        }
    }
}
