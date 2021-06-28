package com.inani.vijay.leetcode;

public class _667BeautifulArrangementII {

    public static void main(String[] args) {
        new _667BeautifulArrangementII().constructArray(8, 4);
    }

    public int[] constructArray(int n, int k) {
        int left = 1;
        int right = n;
        int[] result = new int[n];
        for (int i = 0; i < n; i++) {
            result[i] = k % 2 != 0 ? left++ : right--;
            if (k > 1) {
                k--;
            }
        }
        return result;
    }
}
