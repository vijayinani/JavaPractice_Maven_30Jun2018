package com.inani.vijay.leetcode;

public class _704BinarySearch {

    public static void main(String[] args) {
        System.out.println(new _704BinarySearch().search(new int[]{-1, 0, 3, 5, 9, 12}, 9));
    }

    public int search(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] > target) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }
}

