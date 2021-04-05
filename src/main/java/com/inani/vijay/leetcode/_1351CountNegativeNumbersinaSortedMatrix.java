package com.inani.vijay.leetcode;

public class _1351CountNegativeNumbersinaSortedMatrix {

    public static void main(String[] args) {
        System.out.println(new _1351CountNegativeNumbersinaSortedMatrix().countNegatives(new int[][]{{3, -1, -3, -3, -3}, {2, -2, -3, -3, -3}, {1, -2, -3, -3, -3}, {0, -3, -3, -3, -3}}));
    }

    public int countNegatives(int[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;
        int count = 0;
        int lastNeg = cols - 1;
        for (int row = 0; row < rows; row++) {
            if (grid[row][0] < 0) {
                count += cols;
                continue;
            } else if (grid[row][cols - 1] >= 0) {
                continue;
            }

            int low = 0;
            int high = lastNeg;
            while (low <= high) {
                int mid = low + (high - low) / 2;
                if (grid[row][mid] < 0) {
                    high = mid - 1;
                } else {
                    low = mid + 1;

                }
            }
            count += (cols - low);
            lastNeg = low;
        }
        return count;
    }
}
