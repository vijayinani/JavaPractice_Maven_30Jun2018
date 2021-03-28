package com.inani.vijay.leetcode;

import java.util.HashMap;
import java.util.Map;

public class _167TwoSumIIInputarrayissorted {

    public static void main(String[] args) {
        int[] result = new _167TwoSumIIInputarrayissorted().twoSum(new int[]{2, 7, 11, 15}, 9);
        for (int val : result) {
            System.out.println(val);
        }
    }

    public int[] twoSum(int[] numbers, int target) {
        //return twoSumTwoPointers(numbers, target);
        //return twoSumHashSet(numbers, target);
        return twoSumBinarySearch(numbers, target);
    }

    private int[] twoSumBinarySearch(int[] numbers, int target) {
        for (int i = 0; i < numbers.length; i++) {
            int remaining = target - numbers[i];
            int start = i + 1;
            int end = numbers.length - 1;
            while (start <= end) {
                int mid = start + (end - 1) / 2;
                if(remaining == numbers[mid]) {
                    return new int[] {i+1, mid+1};
                }

                if(remaining < numbers[mid]) {
                    end = end - 1;
                } else {
                    start = start + 1;
                }
            }
        }
        return new int[]{0,0};
    }

    private int[] twoSumHashSet(int[] numbers, int target) {
        Map<Integer, Integer> traversed = new HashMap<>();
        for (int i = 0; i < numbers.length; i++) {
            if (traversed.containsKey(target - numbers[i])) {
                return new int[]{traversed.get(target - numbers[i]) + 1, i + 1};
            }
            traversed.put(numbers[i], i);
        }
        return new int[]{0, 0};
    }

    private int[] twoSumTwoPointers(int[] numbers, int target) {
        int i = 0;
        int j = numbers.length - 1;
        while (i < j) {
            int currSum = numbers[i] + numbers[j];
            if (currSum == target) {
                return new int[]{i + 1, j + 1};
            }

            if (currSum > target) {
                j--;
            } else {
                i++;
            }
        }
        return new int[]{0, 0};
    }
}
