package com.inani.vijay.leetcode;

public class _1512NumberofGoodPairs {

    public static void main(String[] args) {
        System.out.println(new _1512NumberofGoodPairs().numIdenticalPairs(new int[]{1, 2, 3, 1, 1, 3}));
    }

    /*public int numIdenticalPairs(int[] nums) {
        int pairsCount = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j] && i < j) {
                    pairsCount++;
                }
            }
        }
        return pairsCount;
    }*/

    public int numIdenticalPairs(int[] nums) {
        int result = 0;
        int count[] = new int[101];
        for (int num : nums) {
            result += count[num]++;
        }
        return result;
    }
}
