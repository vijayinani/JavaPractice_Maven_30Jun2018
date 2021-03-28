package com.inani.vijay.leetcode;

public class _59SpiralMatrixII {

    public static void main(String[] args) {
        int[][] matrix = new _59SpiralMatrixII().generateMatrix(3);
        System.out.println();

    }


    public int[][] generateMatrix(int n) {
        int[][] matrix = new int[n][n];

        final int TOP_LEFT = 1;
        final int TOP_RIGHT = 2;
        final int BOTTOM_RIGHT = 3;
        final int BOTTOM_LEFT = 4;

        int lowM = 0;
        int highM = matrix.length - 1;
        int lowN = 0;
        int highN = matrix[0].length - 1;

        int curr_position = TOP_LEFT;
        int currValue = 1;

        while (lowM <= highM && lowN <= highN) {

            switch (curr_position) {
                case TOP_LEFT:
                    for (int i = lowN; i <= highN; i++) {
                        matrix[lowM][i] = currValue;
                        currValue++;
                    }
                    lowM++;
                    curr_position = TOP_RIGHT;
                    break;

                case TOP_RIGHT:
                    for (int i = lowM; i <= highM; i++) {
                        matrix[i][highN] = currValue;
                        currValue++;
                    }
                    highN--;
                    curr_position = BOTTOM_RIGHT;
                    break;

                case BOTTOM_RIGHT:
                    for (int i = highN; i >= lowN; i--) {
                        matrix[highM][i] = currValue;
                        currValue++;
                    }
                    highM--;
                    curr_position = BOTTOM_LEFT;
                    break;

                case BOTTOM_LEFT:
                    for (int i = highM; i >= lowM; i--) {
                        matrix[i][lowN] = currValue;
                        currValue++;
                    }
                    lowN++;
                    curr_position = TOP_LEFT;
                    break;
            }
        }
        return matrix;
    }
}