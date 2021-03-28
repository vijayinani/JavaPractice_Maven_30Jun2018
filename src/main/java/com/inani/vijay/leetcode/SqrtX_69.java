package com.inani.vijay.leetcode;

public class SqrtX_69 {

    public static void main(String[] args) {
        System.out.println(new SqrtX_69().mySqrt(18));
    }

    public int mySqrt(int x) {
        if (x == 0) return 0;
        int left = 1;
        int right = x;
        while (true) {
            int mid = left + (right - left) / 2;
            if (mid > x / mid) {
                right = mid - 1;
            } else {
                if (mid + 1 > x / (mid + 1)) {
                    return mid;
                }
                left = mid + 1;
            }
        }
    }
}
