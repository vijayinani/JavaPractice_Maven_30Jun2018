package com.inani.vijay.leetcode;

public class _713SubarrayProductLessThanK {

    public static void main(String[] args) {
        System.out.println(new _713SubarrayProductLessThanK().numSubarrayProductLessThanK(new int[]{10, 5, 2, 6}, 100));
    }

    /*public int numSubarrayProductLessThanK(int[] nums, int k) {
        int i = 0;
        int j = 0;
        int product = 1;
        int count = 0;
        while (i < nums.length || j < nums.length) {
            if(i < nums.length) {
                product *= nums[i];
                if (product < k) {
                    count++;
                    i++;
                } else {
                    product = 1;
                    j++;
                    i = j;
                }
            } else {
                product = 1;
                j++;
                i = j;
            }
        }
        return count;
    }*/

    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int ans = 0;
        int prod = 1;
        int left = 0;
        for(int right = 0; right < nums.length; right++) {
            prod *= nums[right];
            while(prod >= k) {
                prod /= nums[left++];
            }
            ans += right - left + 1;
        }
        return ans;
    }
}
