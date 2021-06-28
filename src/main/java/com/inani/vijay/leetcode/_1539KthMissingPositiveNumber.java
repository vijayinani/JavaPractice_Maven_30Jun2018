package com.inani.vijay.leetcode;

public class _1539KthMissingPositiveNumber {

    public static void main(String[] args) {
        System.out.println(new _1539KthMissingPositiveNumber().findKthPositive(new int[]{1,2,3,4}, 2));
    }

    public int findKthPositive(int[] arr, int k) {
        int seqNo = 1;
        int count = 0;
        int i = 0;
        while (true) {
            if (i < arr.length) {
                if (arr[i] != seqNo) {
                    count++;
                    if (count == k) {
                        return seqNo;
                    }
                    seqNo++;
                } else {
                    i++;
                    seqNo++;
                }
            } else {
                count++;
                if (count == k) {
                    return seqNo;
                }
                seqNo++;
            }
        }
    }
}
