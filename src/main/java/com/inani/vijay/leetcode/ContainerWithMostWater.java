package com.inani.vijay.leetcode;

public class ContainerWithMostWater {

    public static void main(String[] args) {
        System.out.println(new ContainerWithMostWater().maxArea(new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7}));
    }

    public int maxArea(int[] height) {
        int left = 0, right = height.length - 1, max = 0;
        while (left < right) {
            max = Math.max(max, Math.min(height[left], height[right]) * (right - left));
            if (height[left] < height[right]) {
                int preleft = height[left];
                while (height[left] <= preleft && left < right) {
                    left++;
                }
            } else {
                int preright = height[right];
                while (height[right] <= preright && left < right) {
                    right--;
                }
            }
        }
        return max;
    }
}
