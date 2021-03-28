package com.inani.vijay.leetcode;

public class DuplicateZerosAppend {

    public static void main(String[] args) {
        int[] input = new int[]{8, 4, 5, 0, 0, 0, 0, 7};
        new DuplicateZerosAppend().duplicateZeros(input);
        for (int val : input) {
            System.out.println(val);
        }
    }

    public void duplicateZeros(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                for (int j = arr.length - 1; j > i; j--) {
                    arr[j] = arr[j - 1];
                }
                i++;
            }
        }
    }
}
