package com.inani.vijay.leetcode;

public class _516LongestPalindromicSubsequence {

    public static void main(String[] args) {
        System.out.println(new _516LongestPalindromicSubsequence().longestPalindromeSubseq("bbbab"));
    }

    /*public int longestPalindromeSubseq(String s) {
        int[][] dp = new int[s.length()][s.length()];
        for (int i = s.length() - 1; i >= 0; i--) {
            dp[i][i] = 1;
            for (int j = i + 1; j < s.length(); j++) {
                if (s.charAt(i) == s.charAt(j)) {
                    dp[i][j] = dp[i + 1][j - 1] + 2;
                } else {
                    dp[i][j] = Math.max(dp[i + 1][j], dp[i][j - 1]);
                }
            }
        }
        return dp[0][s.length() - 1];
    }*/

    public int longestPalindromeSubseq(String s) {
        return solve(s, 0, s.length() - 1, new Integer[s.length()][s.length()]);
    }

    private int solve(String s, int i, int j, Integer[][] dp) {
        if (dp[i][j] != null) {
            return dp[i][j];
        }
        if (i > j) return 0;
        if (i == j) return 1;
        if (s.charAt(i) == s.charAt(j)) {
            dp[i][j] = solve(s, i + 1, j - 1, dp) + 2;
        } else {
            dp[i][j] = Math.max(solve(s, i + 1, j, dp), solve(s, i, j - 1, dp));
        }
        return dp[i][j];
    }
}
