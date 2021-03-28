package com.inani.vijay.leetcode;

public class CheckIfNumberIsASumOfPowersOfThree_1780 {

    public static void main(String[] args) {
        System.out.println(new CheckIfNumberIsASumOfPowersOfThree_1780().checkPowersOfThree(91));
    }

    public boolean checkPowersOfThree(int n) {
        int maxPowersOf3Count = (int) (Math.log(n) / Math.log(3));
        int[] threePower = new int[maxPowersOf3Count + 1];
        threePower[0] = 1;
        for (int i = 1; i <= maxPowersOf3Count; i++) {
            threePower[i] = threePower[i - 1] * 3;
        }

        for (int i = maxPowersOf3Count; i >= 0; i--) {
            if (n >= threePower[i]) {
                n = n - threePower[i];
            }
        }
        return n == 0;
    }

}
