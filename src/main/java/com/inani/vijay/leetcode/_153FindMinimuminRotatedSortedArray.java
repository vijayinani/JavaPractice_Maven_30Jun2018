package com.inani.vijay.leetcode;

public class _153FindMinimuminRotatedSortedArray {

    public static void main(String[] args) {
        System.out.println(new _153FindMinimuminRotatedSortedArray().findMin(new int[]{11, 12, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10}));
    }

    public int findMin(int[] nums) {
        int low = 0;
        int high = nums.length - 1;
        if (nums[low] < nums[high]) {
            return nums[low];
        }
        while (low < high) {
            if (nums[low] < nums[high]) {
                return nums[low];
            }
            int mid = low + (high - low) / 2;
            if (nums[low] <= nums[mid]) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }
        return nums[low];
    }
}
