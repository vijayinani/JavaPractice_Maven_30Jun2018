package com.inani.vijay.leetcode;

public class _1526MinimumNumberofIncrementsonSubarraystoFormaTargetArray {

    public static void main(String[] args) {
        System.out.println(new _1526MinimumNumberofIncrementsonSubarraystoFormaTargetArray().minNumberOperations(new int[]{3, 1, 5, 4, 2}));
    }

    public int minNumberOperations(int[] target) {
        int count = target[0];
        for (int i = 1; i < target.length; i++) {
            if (target[i - 1] < target[i]) {
                count += target[i] - target[i - 1];
            }
        }
        return count;
    }
}
