package com.inani.vijay.leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class _1640CheckArrayFormationThroughConcatenation {

    public static void main(String[] args) {
        System.out.println(new _1640CheckArrayFormationThroughConcatenation().canFormArray(new int[]{91, 4, 64, 78}, new int[][]{{78}, {4, 64}, {91}}));
    }

    public boolean canFormArray(int[] arr, int[][] pieces) {
        Map<Integer, int[]> integerMap = new HashMap<>();
        for (int[] piece : pieces) {
            integerMap.put(piece[0], piece);
        }
        int i = 0;
        int[] result = new int[arr.length];
        for (int val : arr) {
            if (integerMap.containsKey(val)) {
                for (int element : integerMap.get(val)) {
                    result[i++] = element;
                }
            }
        }
        return Arrays.equals(result, arr);
    }
}
