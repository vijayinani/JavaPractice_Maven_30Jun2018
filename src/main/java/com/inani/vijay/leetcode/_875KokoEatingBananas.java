package com.inani.vijay.leetcode;

public class _875KokoEatingBananas {

    public static void main(String[] args) {
        System.out.println(new _875KokoEatingBananas().minEatingSpeed(new int[]{3, 6, 7, 11}, 8));
    }

    public int minEatingSpeed(int[] piles, int h) {
        int min = 1;
        int max = 0;
        for (int pile : piles) {
            if (pile > max) {
                max = pile;
            }
        }
        while (min < max) {
            int hours = 0;
            int mid = min + ((max - min) >> 1);
            for (int pile : piles) {
                hours += pile / mid;
                if (pile % mid != 0) {
                    hours++;
                }
            }
            if (hours > h) {
                min = mid + 1;
            } else {
                max = mid;
            }
        }
        return min;
    }
}
