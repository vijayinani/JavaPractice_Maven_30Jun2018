package com.inani.vijay.leetcode;

public class _1201UglyNumberIII {

    public static void main(String[] args) {
        System.out.println(new _1201UglyNumberIII().nthUglyNumber(3, 2, 3, 5));
    }

    public int nthUglyNumber(int n, int a, int b, int c) {
        int min = 1;
        int max = Integer.MAX_VALUE;
        while (min < max) {
            int mid = min + (max - min) / 2;
            int count = solve(mid, a, b, c);
            if (count >= n) {
                max = mid;
            } else {
                min = mid + 1;
            }
        }
        return min;
    }

    private int solve(int mid, int a, int b, int c) {
        return (int) (mid / a + mid / b + mid / c - mid / lcm(a, b) - mid / lcm(a, c) - mid / (lcm(b, c)) + mid / lcm(a, lcm(b, c)));
    }

    private long lcm(long a, long b) {
        return (a * b) / gcd(a, b);
    }

    private long gcd(long a, long b) {
        if (a == 0) {
            return b;
        }
        return gcd(b % a, a);
    }
}
