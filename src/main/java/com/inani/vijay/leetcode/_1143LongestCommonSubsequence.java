package com.inani.vijay.leetcode;

public class _1143LongestCommonSubsequence {

    public static void main(String[] args) {
        System.out.println(new _1143LongestCommonSubsequence().longestCommonSubsequence("abcde", "ace"));
    }

    public int longestCommonSubsequence(String text1, String text2) {
        Integer dp[][] = new Integer[text1.length()][text2.length()];
        return solve(text1, text2, 0, 0, dp);
    }

    private int solve(String text1, String text2, int i, int j, Integer[][] dp) {

        if (i == text1.length() || j == text2.length()) return 0;

        if (dp[i][j] != null) {
            return dp[i][j];
        }
        if (text1.charAt(i) == text2.charAt(j)) {
            dp[i][j] = 1 + solve(text1, text2, i + 1, j + 1, dp);
        } else {
            dp[i][j] = Math.max(solve(text1, text2, i + 1, j, dp), solve(text1, text2, i, j + 1, dp));
        }
        return dp[i][j];
    }
}
