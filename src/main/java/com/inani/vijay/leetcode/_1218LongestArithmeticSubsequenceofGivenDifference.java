package com.inani.vijay.leetcode;

import java.util.HashMap;
import java.util.Map;

public class _1218LongestArithmeticSubsequenceofGivenDifference {

    public static void main(String[] args) {
        System.out.println(new _1218LongestArithmeticSubsequenceofGivenDifference().longestSubsequence(new int[]{1, 5, 7, 8, 5, 3, 4, 2, 1}, 2));
    }

    public int longestSubsequence(int[] arr, int difference) {
        int result = 0;
        Map<Integer, Integer> diff = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            diff.put(arr[i], diff.getOrDefault(arr[i] - difference, 0) + 1);
            result = Math.max(result, diff.get(arr[i]));
        }
        return result;
    }
}
