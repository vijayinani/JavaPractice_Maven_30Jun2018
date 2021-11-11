package com.inani.vijay.leetcode;

import java.util.Stack;

public class _321CreateMaximumNumber {

    public static void main(String[] args) {
        // int[] res = new _321CreateMaximumNumber().maxNumber(new int[]{3, 4, 6, 5}, new int[]{9, 1, 2, 5, 8, 3}, 5);
        // int[] res = new _321CreateMaximumNumber().maxNumber(new int[]{6, 7}, new int[]{6, 0, 4}, 5);
        int[] res = new _321CreateMaximumNumber().maxNumber(new int[]{3, 9}, new int[]{8, 9}, 3);
        for (int val : res) {
            System.out.print(val + " ");
        }
    }

    public int[] maxNumber(int[] nums1, int[] nums2, int k) {
        int n = nums1.length;
        int m = nums2.length;
        int[] ans = new int[k];

        for (int i = Math.max(0, k - m); i <= n && i <= k; i++) {
            int[] candidate = merge(maxArray(nums1, i), maxArray(nums2, k - i), k);
            if (greater(candidate, 0, ans, 0)) ans = candidate;
        }
        return ans;
    }

    private int[] merge(int[] nums1, int[] nums2, int k) {
        int[] ans = new int[k];
        for (int i = 0, j = 0, r = 0; r < k; r++) {
            ans[r] = greater(nums1, i, nums2, j) ? nums1[i++] : nums2[j++];
        }
        return ans;
    }

    private boolean greater(int[] nums1, int i, int[] nums2, int j) {
        while (i < nums1.length && j < nums2.length && nums1[i] == nums2[j]) {
            i++;
            j++;
        }

        return j == nums2.length || (i < nums1.length && nums1[i] > nums2[j]);
    }

    private int[] maxArray(int[] nums, int k) {
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < nums.length; i++) {
            while (stack.size() + nums.length - i > k && !stack.isEmpty() && stack.peek() < nums[i]) {
                stack.pop();
            }

            if (stack.size() < k) {
                stack.push(nums[i]);
            }
        }

        int[] result = new int[k];
        for (int i = k - 1; i >= 0; i--) {
            result[i] = stack.pop();
        }
        return result;
    }
}
