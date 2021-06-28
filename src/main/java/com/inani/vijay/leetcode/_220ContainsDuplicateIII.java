package com.inani.vijay.leetcode;

import java.util.TreeSet;

public class _220ContainsDuplicateIII {

    public static void main(String[] args) {
        System.out.println(new _220ContainsDuplicateIII().containsNearbyAlmostDuplicate(new int[]{1,5,9,1,5,9}, 2, 3));
    }

    public boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {

        if (nums == null || nums.length < 2 || k < 1) return false;
        TreeSet<Long> set = new TreeSet<>();

        for (int i = 0; i < nums.length; i++) {
            long l = (long) nums[i];

            Long floor = set.floor(l);
            Long ceil = set.ceiling(l);
            // the tricky part I modified to easily understood way.
            if ((floor != null && l - floor <= t) ||
                    (ceil != null && ceil - l <= t))
                return true;

            set.add(l);

            if (i >= k)
                set.remove((long) nums[i - k]);

        }

        return false;
    }
}
