package com.inani.vijay.leetcode;

public class _1493LongestSubarrayof1sAfterDeletingOneElement {

    public static void main(String[] args) {
        System.out.println(new _1493LongestSubarrayof1sAfterDeletingOneElement().longestSubarray(new int[]{0, 1, 1, 1, 0, 1, 1, 0, 1}));
    }

    public int longestSubarray(int[] nums) {
        int cnt = 0;
        int prevCnt = 0;
        int res = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                cnt++;
            } else {
                res = Math.max(res, cnt + prevCnt);
                prevCnt = cnt;
                cnt = 0;
            }
        }
        res = Math.max(res, cnt + prevCnt);
        return res == nums.length ? res - 1 : res;
    }
}
