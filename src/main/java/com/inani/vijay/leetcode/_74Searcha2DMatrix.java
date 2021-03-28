package com.inani.vijay.leetcode;

public class _74Searcha2DMatrix {

    public static void main(String[] args) {

        int[][] matrix = new int[][]{{1, 3, 5, 7}, {10, 11, 16, 20}, {23, 30, 34, 60}};

        System.out.println(new _74Searcha2DMatrix().searchMatrix(matrix, 3));
    }

    public boolean searchMatrix(int[][] matrix, int target) {

        if (matrix.length == 0 || matrix[0].length == 0) return false;

        int m = matrix.length;
        int n = matrix[0].length;
        int low = 0;
        int high = m - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (target < matrix[mid][0]) {
                high = mid - 1;
            } else if (target > matrix[mid][0]) {
                low = mid + 1;
            } else {
                return true;
            }
        }

        int row = high;
        low = 0;
        high = n - 1;
        if (row >= 0) {
            while (low <= high) {
                int mid = (low + high) / 2;
                if (target > matrix[row][mid]) {
                    low = mid + 1;
                } else if (target < matrix[row][mid]) {
                    high = mid - 1;
                } else {
                    return true;
                }
            }
        }
        return false;
    }

    /*
    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0) {
            return false;
        }
        int start = 0, rows = matrix.length, cols = matrix[0].length;
        int end = rows * cols - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (matrix[mid / cols][mid % cols] == target) {
                return true;
            }
            if (matrix[mid / cols][mid % cols] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return false;
    }

     */
}

