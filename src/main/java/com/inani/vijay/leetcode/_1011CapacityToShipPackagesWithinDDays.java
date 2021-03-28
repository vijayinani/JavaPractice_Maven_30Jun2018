package com.inani.vijay.leetcode;

public class _1011CapacityToShipPackagesWithinDDays {
    public static void main(String[] args) {
        System.out.println(new _1011CapacityToShipPackagesWithinDDays()
                .shipWithinDays(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}, 5));
    }

    public int shipWithinDays(int[] weights, int D) {
        int min = 0;
        int max = 0;
        for (int w : weights) {
            min = Math.max(min, w);
            max += w;
        }
        while (min < max) {
            int mid = min + (max - min) / 2;
            int curr = 0;
            int need = 1;
            for (int w : weights) {
                if (curr + w > mid) {
                    curr = 0;
                    need += 1;
                }
                curr += w;
            }
            if (need > D) {
                min = mid + 1;
            } else {
                max = mid;
            }
        }
        return min;
    }
}
