package com.inani.vijay.leetcode;

public class MergeSortedArray_88 {

    public static void main(String[] args) {
        int[] nums1 = new int[]{1, 2, 3, 0, 0, 0};
        int[] nums2 = new int[]{2, 5, 6};
        new MergeSortedArray_88().merge(nums1, 3, nums2, 3);
    }

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        m = m - 1;
        n = n - 1;
        int i = nums1.length - 1;
        while (m >= 0 && n >= 0) {
            if (nums1[m] > nums2[n]) {
                nums1[i] = nums1[m];
                m--;
            } else {
                nums1[i] = nums2[n];
                n--;
            }
            i--;
        }
        while (n >= 0) {
            nums1[i] = nums2[n];
            n--;
            i--;
        }
    }
}
