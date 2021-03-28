package com.inani.vijay.leetcode;

public class _746MinCostClimbingStairs {

    public static void main(String[] args) {
        System.out.println(new _746MinCostClimbingStairs().minCostClimbingStairs(new int[]{1, 100, 1, 1, 1, 100, 1, 1, 100, 1}));
    }

    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        //dp = new int[n];
        //return Math.min(minCost(n - 1, cost), minCost(n - 2, cost));
        return minCost(cost, n);
    }

    /*private int minCost(int[] cost, int n) {
        int[] dp = new int[n];
        dp[0] = cost[0];
        dp[1] = cost[1];
        for (int i = 2; i < n; i++) {
            dp[i] = cost[i] + Math.min(dp[i - 1], dp[i - 2]);
        }
        return Math.min(dp[n - 1], dp[n - 2]);
    }*/

    private int minCost(int[] cost, int n) {
        int a = cost[0];
        int b = cost[1];
        int curr = 0;
        for (int i = 2; i < n; i++) {
            curr = cost[i] + Math.min(a, b);
            a = b;
            b = curr;
        }
        return Math.min(a, b);
    }

    /*private int minCost(int n, int[] cost) {
        if (n < 0) {
            return 0;
        }

        if (n <= 1) {
            return cost[n];
        }

        return cost[n] + Math.min(minCost(n - 1, cost), minCost(n - 2, cost));
    }*/

/*    int[] dp;

    private int minCost(int n, int[] cost) {

        if (n < 0) {
            return 0;
        }

        if (n <= 1) {
            return cost[n];
        }

        if (dp[n] != 0) {
            return dp[n];
        }

        dp[n] = cost[n] + Math.min(minCost(n - 1, cost), minCost(n - 2, cost));

        return dp[n];
    }*/

}
