package com.inani.vijay.leetcode;

public class _832FlippinganImage {

    public static void main(String[] args) {
        int[][] result = new _832FlippinganImage().flipAndInvertImage(new int[][]{{1, 1, 0}, {1, 0, 1}, {0, 0, 0}});
        System.out.println();
    }

    public int[][] flipAndInvertImage(int[][] image) {
        int n = image.length;
        for (int[] row : image) {
            int left = 0;
            int right = n - 1;
            while (left <= right) {
                if (left < right) {
                    int temp = row[left];
                    row[left] = row[right] == 1 ? 0 : 1;
                    row[right] = temp == 1 ? 0 : 1;
                } else {
                    row[left] = row[left] == 1 ? 0 : 1;
                }
                left++;
                right--;
            }
        }
        return image;
    }
}
