package com.inani.vijay;

import java.util.Arrays;

public class MergeTwoSortedArrays {

    public static void main(String[] args) {
        int[] result = new MergeTwoSortedArrays().mergeTwoSortedArrays(new int[]{3, 2, 5, 5, 3, -12, -31, 4, 6, -37, 2, 1, 39, 44, -23, -23, 49, 39, 42, 11, -36, 43, 2, 1, -444}, new int[]{3, 2, 5, 5, 3, 2, 1, 39, 44, -23, -23, 49, 39});
        for (int val : result) {
            System.out.print(val + " ");
        }
    }

    private int[] mergeTwoSortedArrays(int[] input1, int[] input2) {
        Arrays.sort(input1);
        Arrays.sort(input2);

        int m = input1.length;
        int n = input2.length;
        int result[] = new int[m + n];
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < m || j < n) {
            if (i < m && j < n) {
                if (input1[i] <= input2[j]) {
                    result[k] = input1[i];
                    i++;
                } else {
                    result[k] = input2[j];
                    j++;
                }
            } else if (i < m && j == n) {
                result[k] = input1[i];
                i++;
            } else if (i == m && j < n) {
                result[k] = input2[j];
                j++;
            }
            k++;
        }
        return result;
    }


}
