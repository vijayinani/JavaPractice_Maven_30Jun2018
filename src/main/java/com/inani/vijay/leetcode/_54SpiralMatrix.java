package com.inani.vijay.leetcode;

import java.util.ArrayList;
import java.util.List;

public class _54SpiralMatrix {

    public static void main(String[] args) {
        System.out.println(new _54SpiralMatrix().spiralOrder(new int[][]{{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}}));
    }

    public List<Integer> spiralOrder(int[][] matrix) {

        List<Integer> result = new ArrayList<>();

        final int TOP_LEFT = 1;
        final int TOP_RIGHT = 2;
        final int BOTTOM_RIGHT = 3;
        final int BOTTOM_LEFT = 4;

        int lowM = 0;
        int highM = matrix.length - 1;
        int lowN = 0;
        int highN = matrix[0].length - 1;

        int curr_position = TOP_LEFT;

        while (lowM <= highM && lowN <= highN) {

            switch (curr_position) {
                case TOP_LEFT:
                    for (int i = lowN; i <= highN; i++) {
                        result.add(matrix[lowM][i]);
                    }
                    lowM++;
                    curr_position = TOP_RIGHT;
                    break;

                case TOP_RIGHT:
                    for (int i = lowM; i <= highM; i++) {
                        result.add(matrix[i][highN]);
                    }
                    highN--;
                    curr_position = BOTTOM_RIGHT;
                    break;

                case BOTTOM_RIGHT:
                    for (int i = highN; i >= lowN; i--) {
                        result.add(matrix[highM][i]);
                    }
                    highM--;
                    curr_position = BOTTOM_LEFT;
                    break;

                case BOTTOM_LEFT:
                    for (int i = highM; i >= lowM; i--) {
                        result.add(matrix[i][lowN]);
                    }
                    lowN++;
                    curr_position = TOP_LEFT;
                    break;
            }
        }
        return result;
    }
}
