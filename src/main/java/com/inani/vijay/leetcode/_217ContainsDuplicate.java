package com.inani.vijay.leetcode;

import java.util.HashSet;
import java.util.Set;

public class _217ContainsDuplicate {

    public static void main(String[] args) {
        System.out.println(new _217ContainsDuplicate().containsDuplicate(new int[]{1, 2, 3, 1}));
    }

    public boolean containsDuplicate(int[] nums) {
        Set<Integer> found = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (!found.add(nums[i])) return true;
        }
        return false;
    }
}
