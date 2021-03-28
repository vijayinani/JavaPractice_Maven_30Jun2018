package com.inani.vijay.leetcode;

public class PartitionArrayIntoThreePartsWithEqualSum {

    public static void main(String[] args) {
        System.out.println(new PartitionArrayIntoThreePartsWithEqualSum().canThreePartsEqualSum(new int[]{1, -1, 1, -1}));
    }

    public boolean canThreePartsEqualSum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        if (sum % 3 != 0) {
            return false;
        }

        int perPartitionSum = sum / 3;

        int partFirstSum = arr[0];
        int partLastSum = arr[arr.length - 1];

        for (int i = 1, j = arr.length - 2; i <= j; ) {

            if (partFirstSum == perPartitionSum && partLastSum == perPartitionSum) {
                return true;
            }

            if (partFirstSum != perPartitionSum) {
                partFirstSum += arr[i];
                i++;
            }

            if (partLastSum != perPartitionSum) {
                partLastSum += arr[j];
                j--;
            }
        }
        return false;
    }
}
