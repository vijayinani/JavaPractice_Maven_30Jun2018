package com.inani.vijay.leetcode;

public class _80RemoveDuplicatesfromSortedArrayII {

    public static void main(String[] args) {
        System.out.println(new _80RemoveDuplicatesfromSortedArrayII().removeDuplicates(new int[]{0, 0, 1, 1, 1, 1, 2, 3, 3}));
    }

    public int removeDuplicates(int[] nums) {
        int k = 2;

        if (nums.length == 0) {
            return 0;
        }

        int m = 1;
        int count = 1;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i - 1] == nums[i]) {
                if (count < k) {
                    nums[m] = nums[i];
                    m++;
                }
                count++;
            } else {
                count = 1;
                nums[m++] = nums[i];
            }
        }
        return m;
    }
}
