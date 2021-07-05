package com.inani.vijay.leetcode;

public class _37SudokuSolver {

    public static void main(String[] args) {

        char[][] board = new char[][]
                {{'5', '3', '.', '.', '7', '.', '.', '.', '.'},
                        {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
                        {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
                        {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
                        {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
                        {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
                        {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
                        {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
                        {'.', '.', '.', '.', '8', '.', '.', '7', '9'}};

        new _37SudokuSolver().solveSudoku(board);

        printBoard(boardFinal);
    }

    private static void printBoard(char[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    /*
    public boolean solveSudoku(char[][] board) {
        int n = board.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == '.') {
                    for (char c = '1'; c <= '9'; c++) {
                        if (isValid(board, i, j, c)) {
                            board[i][j] = c;

                            if (solveSudoku(board)) {
                                return true;
                            } else {
                                board[i][j] = '.';
                            }
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }
    */

    private boolean isValid(char[][] board, int i, int j, char c) {
        for (int x = 0; x < board.length; x++) {
            if (board[i][x] == c) {
                return false;
            }
        }

        for (int x = 0; x < board.length; x++) {
            if (board[x][j] == c) {
                return false;
            }
        }

        int row = 3 * (i / 3);
        int col = 3 * (j / 3);
        for (int x = 0; x < 3; x++) {
            for (int y = 0; y < 3; y++) {
                if (board[x + row][y + col] == c) {
                    return false;
                }
            }
        }

        return true;
    }

    private static char[][] boardFinal;

    public boolean solveSudoku(char[][] board) {
        return solve(board, 0, 0);
    }

    private boolean solve(char[][] board, int i, int j) {

        if (i == board.length) {
            boardFinal = new char[board.length][board.length];
            for(int row = 0; row<board.length;row++) {
                for(int col = 0; col<board.length;col++) {
                    boardFinal[row][col] = board[row][col];
                }
            }
            printBoard(board);

            return true;
        }

        int ni;
        int nj;

        if (j == board[0].length - 1) {
            ni = i + 1;
            nj = 0;
        } else {
            ni = i;
            nj = j + 1;
        }

        if (board[i][j] != '.') {
            solve(board, ni, nj);
        } else {
            for (char c = '1'; c <= '9'; c++) {
                if (isValid(board, i, j, c)) {
                    board[i][j] = c;
                    solve(board, ni, nj);
                    board[i][j] = '.';
                }
            }
        }
        board = boardFinal;
        return true;
    }
}
