package com.inani.vijay.leetcode;

public class _1306JumpGameIII {

    public static void main(String[] args) {
        System.out.println(new _1306JumpGameIII().canReach(new int[]{4, 2, 3, 0, 3, 1, 2}, 5));
        System.out.println(new _1306JumpGameIII().canReach(new int[]{4, 2, 3, 0, 3, 1, 2}, 0));
        System.out.println(new _1306JumpGameIII().canReach(new int[]{3, 0, 2, 1, 2}, 2));
    }

    public boolean canReach(int[] arr, int start) {
        if (start < 0 || start >= arr.length || arr[start] < 0) {
            return false;
        }

        if (arr[start] == 0) {
            return true;
        }

        arr[start] = -arr[start];

        return canReach(arr, start + arr[start]) || canReach(arr, start - arr[start]);
    }
}
