package com.inani.vijay.leetcode;

public class _240Searcha2DMatrixII {

    public static void main(String[] args) {
        System.out.println(new _240Searcha2DMatrixII().searchMatrix(new int[][]{{1, 4, 7, 11, 15}, {2, 5, 8, 12, 19}, {3, 6, 9, 16, 22}, {10, 13, 14, 17, 24}, {18, 21, 23, 26, 30}}, 121));
    }

    public boolean searchMatrix(int[][] matrix, int target) {
        int row = 0;
        int col = matrix[0].length - 1;
        while (col >= 0 && row <= matrix.length - 1) {
            if (target == matrix[row][col]) {
                return true;
            } else if (target > matrix[row][col]) {
                row++;
            } else if (target < matrix[row][col]) {
                col--;
            }
        }
        return false;
    }
}
