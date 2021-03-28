package com.inani.vijay.leetcode;

import java.util.Arrays;

public class _719FindKthSmallestPairDistance {

    public static void main(String[] args) {
        System.out.println(new _719FindKthSmallestPairDistance().smallestDistancePair(new int[]{1, 3, 1}, 1));
    }

    public int smallestDistancePair(int[] nums, int k) {
        int n = nums.length;
        Arrays.sort(nums);
        int low = 0;
        int high = nums[n - 1];

        while (low < high) {
            int mid = low + (high - low) / 2;

            int count = solve(nums, n, mid);
            if (count >= k) {
                high = mid;
            } else {
                low = mid + 1;
            }
        }
        return high;
    }

    private int solve(int[] nums, int n, int distance) {
        int i = 0;
        int j = 0;
        int count = 0;
        while (i < n || j < n) {
            while (j < n && nums[j] - nums[i] <= distance) {
                j = j + 1;
            }
            count = count + j - i - 1;
            i = i + 1;
        }
        return count;
    }
}
