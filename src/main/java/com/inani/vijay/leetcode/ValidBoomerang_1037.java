package com.inani.vijay.leetcode;

public class ValidBoomerang_1037 {


    public static void main(String[] args) {
        System.out.println(new ValidBoomerang_1037().isBoomerang(new int[][]{{1, 1}, {2, 3}, {3, 2}}));
    }

    public boolean isBoomerang(int[][] points) {
        if ((points[0][0] - points[1][0]) * (points[1][1] - points[2][1]) - (points[0][1] - points[1][1]) * (points[1][0] - points[2][0]) != 0) {
            return true;
        }
        return false;
    }
}
