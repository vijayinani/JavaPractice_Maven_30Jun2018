package com.inani.vijay.leetcode;

public class FindMedianSortedArrays {

    public static void main(String[] args) {
        int[] nums1 = {1, 4, 9, 16,21};
        int[] nums2 = {2, 3, 5, 7, 11, 19};

        System.out.println(findMedianSortedArrays(nums1, nums2));
    }

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {

        if (nums1.length > nums2.length) return findMedianSortedArrays(nums2, nums1);

        int x = nums1.length;
        int y = nums2.length;

        int low = 0;
        int high = x;

        while (low <= high) {
            int partitionX = (low + high) / 2;
            int partitionY = (x + y + 1) / 2 - partitionX;

            int maxLeftX = (partitionX == 0) ? Integer.MIN_VALUE : nums1[partitionX - 1];
            int minRightX = (partitionX == x) ? Integer.MAX_VALUE : nums1[partitionX];

            int maxLeftY = (partitionY == 0) ? Integer.MIN_VALUE : nums2[partitionY - 1];
            int minRightY = (partitionY == y) ? Integer.MAX_VALUE : nums2[partitionY];

            if (maxLeftX <= minRightY && maxLeftY <= minRightX) {
                if ((x + y) % 2 == 0) {
                    return ((double) Math.max(maxLeftX, maxLeftY) + Math.min(minRightX, minRightY)) / 2;
                } else {
                    return (double) Math.max(maxLeftX, maxLeftY);
                }
            } else if (maxLeftX > minRightY) {
                high = partitionX - 1;
            } else {
                low = partitionX + 1;
            }
        }
        throw new IllegalArgumentException();
    }

/*    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {

        int[] merged = new int[nums1.length + nums2.length];

        int k = -1;

        for (int i = 0, j = 0; i < nums1.length || j < nums2.length;) {
            if (i < nums1.length && j < nums2.length) {
                if (nums1[i] <= nums2[j]) {
                    k++;
                    merged[k] = nums1[i];
                    i++;
                } else {
                    k++;
                    merged[k] = nums2[j];
                    j++;

                }
            } else if (i < nums1.length) {
                k++;
                merged[k] = nums1[i];
                i++;
            } else if (j < nums2.length) {
                k++;
                merged[k] = nums2[j];
                j++;
            }
        }
        System.out.println(Arrays.toString(merged));
        if (merged.length % 2 != 0) {
            return merged[merged.length / 2];
        } else {
            return (double) (merged[(merged.length / 2 - 1)] + merged[(merged.length / 2)]) / 2.0;
        }
    }*/
}
