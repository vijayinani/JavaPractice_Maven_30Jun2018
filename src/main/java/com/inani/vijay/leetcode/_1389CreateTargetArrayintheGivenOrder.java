package com.inani.vijay.leetcode;

public class _1389CreateTargetArrayintheGivenOrder {

    public static void main(String[] args) {
        new _1389CreateTargetArrayintheGivenOrder().createTargetArray(new int[]{0, 1, 2, 3, 4}, new int[]{0, 1, 2, 2, 1});
    }

    public int[] createTargetArray(int[] nums, int[] index) {
        int n = index.length;
        int[] result = new int[n];
        for (int i = 0; i < n; i++) {
            if (index[i] == i) {
                result[i] = nums[i];
            } else {
                int temp = 0;
                for (int j = index[i]; j <= i; j++) {
                    temp = result[j];
                    result[j] = nums[i];
                    nums[i] = temp;
                }
            }
        }
        return result;
    }
}
