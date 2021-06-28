package com.inani.vijay.leetcode;

import java.util.Arrays;

public class _1833MaximumIceCreamBars {

    public static void main(String[] args) {
        System.out.println(new _1833MaximumIceCreamBars().maxIceCream(new int[]{1, 6, 3, 1, 2, 5}, 20));
    }

    public int maxIceCream(int[] costs, int coins) {
        Arrays.sort(costs);
        int count = 0;
        for (int cost : costs) {
            if (cost <= coins) {
                count++;
                coins -= cost;
            } else {
                break;
            }
        }
        return count;
    }
}
