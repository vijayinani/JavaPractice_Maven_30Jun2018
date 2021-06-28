package com.inani.vijay.leetcode;

import java.util.ArrayList;
import java.util.List;

public class _163MissingRanges {

    public static void main(String[] args) {
        System.out.println(new _163MissingRanges().findMissingRanges(new int[]{0, 1, 3, 50, 75}, 0, 99));
    }

    public List<String> findMissingRanges(int[] nums, int lower, int upper) {
        int n = nums.length;
        List<String> res = new ArrayList<>(n);
        int next = lower;
        for (int i = 0; i < n; i++) {
            if (nums[i] < next) {
                continue;
            } else if (nums[i] == next) {
                next++;
            } else {
                res.add(getRange(next, nums[i] - 1));
                next = nums[i] + 1;
            }
        }
        if (next <= upper) {
            res.add(getRange(next, upper));
        }
        return res;
    }

    private String getRange(int n1, int n2) {
        return n1 == n2 ? String.valueOf(n1) : String.format("%d->%d", n1, n2);
    }
}
