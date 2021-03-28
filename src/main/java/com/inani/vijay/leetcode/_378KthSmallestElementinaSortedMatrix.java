package com.inani.vijay.leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class _378KthSmallestElementinaSortedMatrix {

    public static void main(String[] args) {
        System.out.println(new _378KthSmallestElementinaSortedMatrix().kthSmallest(new int[][]{{1, 5, 9}, {10, 11, 13}, {12, 13, 15}}, 8));
    }

    /*
    public int kthSmallest(int[][] matrix, int k) {
        List<Integer> tempList = new ArrayList<>();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                tempList.add(matrix[i][j]);
            }
        }
        Collections.sort(tempList);
        return tempList.get(k - 1);
    }
    */

    public int kthSmallest(int[][] matrix, int k) {
        int n = matrix.length;
        int low = matrix[0][0];
        int high = matrix[n - 1][n - 1] + 1;
        while (low < high) {
            int mid = low + (high - low) / 2;
            int count = 0;
            for (int i = 0; i < n; i++) {
                int j = matrix[0].length - 1;
                for (; j >= 0 && matrix[i][j] > mid; j--) {
                }
                count += j + 1;
            }
            if (count < k) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }
        return low;
    }
}
