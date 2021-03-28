package com.inani.vijay.leetcode;

public class _1035UncrossedLines {

    public static void main(String[] args) {

//         [1,1,2,1,2]
//         [1,3,2,3,1]
        System.out.println(new _1035UncrossedLines().maxUncrossedLines(new int[]{1, 1, 2, 1, 2}, new int[]{1, 3, 2, 3, 1}));
    }

    /*public int maxUncrossedLines(int[] A, int[] B) {
        int result = 0;
        int i = 0;
        int j = 0;
        int nextJ = 0;
        while (i < A.length) {
            j = nextJ;
            while (j < B.length) {
                if (i < A.length && A[i] == B[j]) {
                    result++;
                    i++;
                    nextJ = j + 1;
                }
                j++;
            }
            i++;
        }
        return result;
    }*/

    /*
    public int maxUncrossedLines(int[] A, int[] B) {
        Integer[][] dp = new Integer[A.length][B.length];
        return solve(A, B, 0, 0, dp);
    }

    private int solve(int[] A, int[] B, int i, int j, Integer[][] dp) {
        if (i == A.length || j == B.length) return 0;
        if (dp[i][j] != null) {
            return dp[i][j];
        }
        if (A[i] == B[j]) {
            dp[i][j] = 1 + solve(A, B, i + 1, j + 1, dp);
        } else {
            dp[i][j] = Math.max(solve(A, B, i + 1, j, dp), solve(A, B, i, j + 1, dp));
        }
        return dp[i][j];
    }
    */

    public int maxUncrossedLines(int[] A, int[] B) {
        int m = A.length;
        int n = B.length;
        int[][] dp = new int[m + 1][n + 1];
        for (int i = 1; i <= A.length; i++) {
            for (int j = 1; j <= n; j++) {
                if (A[i - 1] == B[j - 1]) {
                    dp[i][j] = 1 + dp[i - 1][j - 1];
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }
        return dp[m][n];
    }
}
