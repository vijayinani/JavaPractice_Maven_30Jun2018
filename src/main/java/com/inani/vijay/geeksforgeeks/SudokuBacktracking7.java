package com.inani.vijay.geeksforgeeks;

public class SudokuBacktracking7 {
    // Driver Code
    public static void main(String args[]) {

        int[][] board = new int[][]{
                {3, 0, 6, 5, 0, 8, 4, 0, 0},
                {5, 2, 0, 0, 0, 0, 0, 0, 0},
                {0, 8, 7, 0, 0, 0, 0, 3, 1},
                {0, 0, 3, 0, 1, 0, 0, 8, 0},
                {9, 0, 0, 8, 6, 3, 0, 0, 5},
                {0, 5, 0, 0, 9, 0, 6, 0, 0},
                {1, 3, 0, 0, 0, 0, 2, 5, 0},
                {0, 0, 0, 0, 0, 0, 0, 7, 4},
                {0, 0, 5, 2, 0, 6, 3, 0, 0}
        };

        if (solveSudoku(board)) {
            printSudoku(board);
        } else {
            System.out.println("No solution");
        }
    }

    private static void printSudoku(int[][] board) {

    }

    private static boolean solveSudoku(int[][] board) {
        return true;
    }
}
