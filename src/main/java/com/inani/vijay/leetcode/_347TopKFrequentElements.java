package com.inani.vijay.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class _347TopKFrequentElements {

    public static void main(String[] args) {
        int[] ints = new _347TopKFrequentElements().topKFrequent(new int[]{4, 1, -1, 2, -1, 2, 3}, 2);
        for (int val : ints) {
            System.out.println(val);
        }
    }

    public int[] topKFrequent(int[] nums, int k) {
        int counter = 0;
        List<Integer> result = new ArrayList<>();
        Map<Integer, Integer> perIntCount = new HashMap<>();
        for (int i : nums) {
            perIntCount.put(i, perIntCount.getOrDefault(i, 0) + 1);
        }
        List<Integer>[] countToNumber = new List[nums.length + 1];
        for (int i : perIntCount.keySet()) {
            int bucket = perIntCount.get(i);
            if (countToNumber[bucket] == null) {
                countToNumber[bucket] = new ArrayList<>();
            }
            countToNumber[bucket].add(i);
        }
        boolean done = false;
        for (int i = countToNumber.length - 1; i >= 0 && !done; i--) {
            if (countToNumber[i] != null) {
                for (int integer : countToNumber[i]) {
                    result.add(integer);
                    counter++;
                    if (counter == k) {
                        done = true;
                        break;
                    }
                }
            }
        }
        int[] out = new int[result.size()];
        int i = 0;
        for (int val : result) {
            out[i] = val;
            i++;
        }
        return out;
    }
}
