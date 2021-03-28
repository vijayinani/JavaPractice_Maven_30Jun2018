package com.inani.vijay.leetcode;

public class _34FindFirstandLastPositionofElementinSortedArray {

    public static void main(String[] args) {
        int[] res = new _34FindFirstandLastPositionofElementinSortedArray().searchRange(new int[]{1}, 1);
        for (int val : res) {
            System.out.println(val);
        }
    }

    public int[] searchRange(int[] nums, int target) {
        int n = nums.length - 1;
        if (nums.length == 0 || nums[0] > target || nums[n] < target) return new int[]{-1, -1};
        int low = 0;
        int high = n;
        int x = Integer.MIN_VALUE;
        int mid = Integer.MIN_VALUE;
        while (low <= high) {
            mid = low + (high - low) / 2;
            if (mid >= 0 && nums[mid] == target) {
                x = mid;
                while (x >= 0 && nums[x] == target) {
                    mid = x;
                    x--;
                }
                break;
            } else if (nums[mid] > target) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        if (x != Integer.MIN_VALUE) {
            int i = mid;
            while (i <= n && nums[i] == target) {
                i++;
            }
            return new int[]{mid, --i};
        }
        return new int[]{-1, -1};
    }
}
