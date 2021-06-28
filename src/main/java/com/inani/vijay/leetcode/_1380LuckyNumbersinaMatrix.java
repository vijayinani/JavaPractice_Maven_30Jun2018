package com.inani.vijay.leetcode;

import java.util.ArrayList;
import java.util.List;

public class _1380LuckyNumbersinaMatrix {

    public static void main(String[] args) {
        System.out.println(new _1380LuckyNumbersinaMatrix().luckyNumbers(new int[][]{{3, 7, 8}, {9, 11, 13}, {15, 16, 17}}));
    }

    public List<Integer> luckyNumbers(int[][] matrix) {
        List<Integer> result = new ArrayList<>();
        int m = matrix.length;
        int n = matrix[0].length;
        for (int row = 0; row < m; row++) {
            int minInRow = findMinInRow(row, matrix, n);
            if (ifMaxInColumn(matrix, minInRow, matrix[row][minInRow])) {
                result.add(matrix[row][minInRow]);
            }
        }
        return result;
    }

    private boolean ifMaxInColumn(int[][] matrix, int col, int value) {
        for (int row = 0; row < matrix.length; row++) {
            if (matrix[row][col] > value) {
                return false;
            }
        }
        return true;
    }

    private int findMinInRow(int row, int[][] matrix, int columnCount) {
        int minInRow = Integer.MAX_VALUE;
        int minIndex = 0;
        for (int col = 0; col < columnCount; col++) {
            if (matrix[row][col] < minInRow) {
                minInRow = matrix[row][col];
                minIndex = col;
            }
        }
        return minIndex;
    }
}
