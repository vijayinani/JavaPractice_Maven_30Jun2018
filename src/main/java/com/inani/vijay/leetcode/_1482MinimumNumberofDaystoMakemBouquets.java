package com.inani.vijay.leetcode;

public class _1482MinimumNumberofDaystoMakemBouquets {

    public static void main(String[] args) {
        System.out.println(new _1482MinimumNumberofDaystoMakemBouquets().minDays(new int[]{1, 10, 3, 10, 2}, 3, 1));
    }

    public int minDays(int[] bloomDay, int m, int k) {

        if (bloomDay.length < m * k) {
            return -1;
        }

        int min = 0;
        int max = 0;
        for (int flowerBloom : bloomDay) {
            if (flowerBloom > max) {
                max = flowerBloom;
            }
            if (flowerBloom < min) {
                min = flowerBloom;
            }
        }

        while (min < max) {
            int mid = min + (max - min) / 2;
            int bouquets = 0;
            int flowers = 0;
            for (int flowerBloom : bloomDay) {
                if (flowerBloom > mid) {
                    flowers = 0;
                } else {
                    flowers++;
                }

                if (flowers == k) {
                    bouquets++;
                    flowers = 0;
                }
            }

            if (bouquets >= m) {
                max = mid;
            } else {
                min = mid + 1;
            }
        }
        return min;
    }
}
