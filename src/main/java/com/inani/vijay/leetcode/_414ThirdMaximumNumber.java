package com.inani.vijay.leetcode;

import java.net.Inet4Address;

public class _414ThirdMaximumNumber {

    public static void main(String[] args) {
        System.out.println(new _414ThirdMaximumNumber().thirdMax(new int[]{2, 2, 3, 1}));
    }

    public int thirdMax(int[] nums) {
        Integer max1 = null;
        Integer max2 = null;
        Integer max3 = null;
        for (Integer num : nums) {
            if (num.equals(max1) || num.equals(max2) || num.equals(max3)) continue;
            if (max1 == null || max1 < num) {
                max3 = max2;
                max2 = max1;
                max1 = num;
            } else if (max2 == null || num > max2) {
                max3 = max2;
                max2 = num;
            } else if (max3 == null || num > max3) {
                max3 = num;
            }
        }
        return max3 != null ? max3 : max1;
    }
}
