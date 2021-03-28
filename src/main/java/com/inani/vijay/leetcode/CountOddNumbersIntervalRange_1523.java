package com.inani.vijay.leetcode;

public class CountOddNumbersIntervalRange_1523 {

    public static void main(String[] args) {
        System.out.println(new CountOddNumbersIntervalRange_1523().countOdds(2,2));
    }

    public int countOdds(int low, int high) {
        if (high % 2 != 0) {
            high++;
        }
        return (high - low + 1) / 2;
    }
}
