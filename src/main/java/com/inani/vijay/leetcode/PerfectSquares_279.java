package com.inani.vijay.leetcode;

public class PerfectSquares_279 {

    public static void main(String[] args) {
        System.out.println(new PerfectSquares_279().numSquares(58));
    }

    /*public int numSquares(int n) {
        return solve(n);
    }

    private int solve(int n) {
        int ans = n;
        for (int i = 1; i * i <= n; i++) {
            ans = Math.min(ans, 1 + solve(n - i * i));
        }
        return ans;
    }*/

    /*public int numSquares(int n) {
        int[] dp = new int[n + 1];
        *//*for (int i = 0; i < dp.length; i++) {
            dp[i] = -1;
        }*//*
        return solve(n, dp);
    }

    private int solve(int n, int[] dp) {

        if (n <= 3) {
            return n;
        }

        if (dp[n] != 0) {
            return dp[n];
        }

        int ans = n;
        for (int i = 1; i * i <= n; i++) {
            ans = Math.min(ans, 1 + solve(n - i * i, dp));
        }
        dp[n] = ans;
        return ans;
    }*/

    public int numSquares(int n) {
        int[] dp = new int[n + 1];
        dp[0] = 0;
        for (int i = 1; i <= n; i++) {
            dp[i] = i;
            for (int j = 1; j * j <= i; j++) {
                dp[i] = Math.min(dp[i], 1 + dp[i - j * j]);
            }
        }
        return dp[n];
    }
}
