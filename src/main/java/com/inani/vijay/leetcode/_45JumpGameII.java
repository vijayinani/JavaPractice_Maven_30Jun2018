package com.inani.vijay.leetcode;

public class _45JumpGameII {

    public static void main(String[] args) {
        System.out.println(new _45JumpGameII().jump(new int[]{2, 3, 1, 1, 4}));
    }

    public int jump(int[] nums) {
        int jumps = 0;
        int currEnd = 0;
        int maxEnd = 0;

        for (int i = 0; i < nums.length; i++) {

            if (i > currEnd) {
                jumps++;
                currEnd = maxEnd;
            }

            if (maxEnd < i + nums[i]) {
                maxEnd = i + nums[i];
            }
        }
        return jumps;
    }
}
