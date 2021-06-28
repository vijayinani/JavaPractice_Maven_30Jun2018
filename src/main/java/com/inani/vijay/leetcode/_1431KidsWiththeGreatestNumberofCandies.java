package com.inani.vijay.leetcode;

import java.util.ArrayList;
import java.util.List;

public class _1431KidsWiththeGreatestNumberofCandies {

    public static void main(String[] args) {
        System.out.println(new _1431KidsWiththeGreatestNumberofCandies().kidsWithCandies(new int[]{2, 3, 5, 1, 3}, 3));
    }

    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> result = new ArrayList<>();
        int max = Integer.MIN_VALUE;
        for (int candy : candies) {
            if (max < candy) {
                max = candy;
            }
        }
        for (int candy : candies) {
            if (extraCandies + candy >= max) {
                result.add(true);
            } else {
                result.add(false);
            }
        }
        return result;
    }
}
