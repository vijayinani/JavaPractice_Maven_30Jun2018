package com.inani.vijay.leetcode;

public class SearchInsertPosition {

    public static void main(String[] args) {
        System.out.println(new SearchInsertPosition().searchInsert(new int[]{1, 3, 4, 5, 6}, 5));
    }

    public int searchInsert(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (target == nums[mid]) return mid;
            else if (target > nums[mid]) low = mid + 1;
            else high = mid - 1;
        }
        return low;
    }
}
