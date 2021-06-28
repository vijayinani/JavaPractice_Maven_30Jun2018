package com.inani.vijay.leetcode;

import java.util.HashMap;
import java.util.Map;

public class _560SubarraySumEqualsK {

    public static void main(String[] args) {
        System.out.println(new _560SubarraySumEqualsK().subarraySum(new int[]{1, 1, 1}, 2));
    }

    /*public int subarraySum(int[] nums, int k) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            int sum = 0;
            for (int j = i; j < nums.length; j++) {
                sum += nums[j];
                if (sum == k) {
                    count++;
                }
            }
        }
        return count;
    }*/

    /*
    public int subarraySum(int[] nums, int k) {
        int count = 0;
        int[] sum = new int[nums.length + 1];
        sum[0] = 0;
        for (int i = 1; i <= nums.length; i++) {
            sum[i] = sum[i - 1] + nums[i - 1];
        }
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j <= nums.length; j++) {
                if (sum[j] - sum[i] == k) {
                    count++;
                }
            }
        }
        return count;
    }

     */

    public int subarraySum(int[] nums, int k) {
        int count = 0;
        int sum = 0;
        Map<Integer, Integer> sumToCount = new HashMap<>();
        sumToCount.put(0, 1);
        for (int num : nums) {
            sum += num;
            if (sumToCount.containsKey(sum - k)) {
                count += sumToCount.get(sum - k);
            }
            sumToCount.put(sum, sumToCount.getOrDefault(sum, 0) + 1);
        }
        return count;
    }
}
