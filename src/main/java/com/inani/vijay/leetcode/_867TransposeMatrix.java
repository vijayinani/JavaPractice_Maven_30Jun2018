package com.inani.vijay.leetcode;

public class _867TransposeMatrix {

    public static void main(String[] args) {
        int[][] transposed = new _867TransposeMatrix().transpose(new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}});
        for (int i = 0; i < transposed.length; i++) {
            for (int j = 0; j < transposed[0].length; j++) {
                System.out.print(transposed[i][j] + " ");
            }
            System.out.println();
        }

    }

    public int[][] transpose(int[][] matrix) {

        int[][] transposed = new int[matrix[0].length][matrix.length];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                transposed[j][i] = matrix[i][j];
            }
        }

        return transposed;
    }
}
