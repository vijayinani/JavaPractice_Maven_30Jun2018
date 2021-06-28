package com.inani.vijay.leetcode;

import java.util.HashSet;
import java.util.Set;

public class _219ContainsDuplicateII {

    public static void main(String[] args) {
        System.out.println(new _219ContainsDuplicateII().containsNearbyDuplicate(new int[]{1, 2, 3, 1, 2, 3}, 2));
    }

    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Set<Integer> found = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (i > k) {
                found.remove(nums[i - k - 1]);
            }
            if (!found.add(nums[i])) return true;
        }
        return false;
    }
}
