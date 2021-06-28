package com.inani.vijay.leetcode;

public class _566ReshapetheMatrix {

    public static void main(String[] args) {
        new _566ReshapetheMatrix().matrixReshape(new int[][]{{1, 2}, {3, 4}}, 1, 4);
    }

    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int m = mat.length;
        int n = mat[0].length;
        if (r * c != m * n) {
            return mat;
        }
        int[][] res = new int[r][c];
        for (int i = 0; i < r * c; i++) {
            res[i / c][i % c] = mat[i / n][i % n];
        }
        return res;
    }
}
