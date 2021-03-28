package com.inani.vijay.leetcode;

public class _852PeakIndexinaMountainArray {

    public static void main(String[] args) {
        System.out.println(new _852PeakIndexinaMountainArray().peakIndexInMountainArray(new int[]{0, 1, 0}));
    }

    /*public int peakIndexInMountainArray(int[] arr) {
        int i = 0;
        while (arr[i] < arr[i + 1]) i++;
        return i;
    }*/

    public int peakIndexInMountainArray(int[] arr) {
        int low = 0;
        int high = arr.length - 1;
        while (low < high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] < arr[mid + 1]) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }
        return low;
    }
}
