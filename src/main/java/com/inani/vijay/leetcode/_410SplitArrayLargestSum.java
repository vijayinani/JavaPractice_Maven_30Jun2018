package com.inani.vijay.leetcode;

public class _410SplitArrayLargestSum {

    public static void main(String[] args) {
        System.out.println(new _410SplitArrayLargestSum().splitArray(new int[]{7, 2, 5, 10, 8}, 2));
    }

    public int splitArray(int[] nums, int m) {
        int min = 0;
        int max = 0;
        for (int n : nums) {
            min = Math.max(min, n);
            max += n;
        }
        while (min < max) {
            int sum = 0;
            int bucket = 1;
            int mid = min + (max - min) / 2;
            for (int n : nums) {
                if (sum + n > mid) {
                    sum = 0;
                    bucket += 1;
                }
                sum += n;
            }
            if (bucket > m) {
                min = mid + 1;
            } else {
                max = mid;
            }
        }
        return min;
    }
}
