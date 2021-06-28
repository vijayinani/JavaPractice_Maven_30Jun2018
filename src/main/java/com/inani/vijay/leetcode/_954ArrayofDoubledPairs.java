package com.inani.vijay.leetcode;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class _954ArrayofDoubledPairs {

    public static void main(String[] args) {
        System.out.println(new _954ArrayofDoubledPairs().canReorderDoubled(new int[]{3, 1, 3, 6}));
    }

    public boolean canReorderDoubled(int[] arr) {
        Map<Integer, Integer> count = new TreeMap<>();
        for (int a : arr) {
            count.put(a, count.getOrDefault(a, 0) + 1);
        }
        for (int currNo : count.keySet()) {
            if (count.get(currNo) == 0) {
                continue;
            }
            int want = currNo < 0 ? currNo / 2 : currNo * 2;
            if (currNo < 0 && currNo % 2 != 0 || count.get(currNo) > count.getOrDefault(want, 0)) {
                return false;
            }
            count.put(want, count.get(want) - count.get(currNo));
        }
        return true;
    }
}
