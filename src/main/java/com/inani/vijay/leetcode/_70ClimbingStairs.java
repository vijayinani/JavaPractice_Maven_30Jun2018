package com.inani.vijay.leetcode;

public class _70ClimbingStairs {

    public static void main(String[] args) {
        System.out.println(new _70ClimbingStairs().climbStairs(5));
    }

    public int climbStairs(int n) {
        if (n <= 1) return 1;
        int a = 1;
        int b = 1;
        int types = 0;
        for (int i = 2; i <= n; i++) {
            types = a + b;
            a = b;
            b = types;
        }
        return types;
    }
}
