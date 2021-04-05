package com.inani.vijay.leetcode;

public class _712MinimumASCIIDeleteSumforTwoStrings {

    public static void main(String[] args) {
        System.out.println(new _712MinimumASCIIDeleteSumforTwoStrings().minimumDeleteSum("delete", "let"));
    }

    public int minimumDeleteSum(String s1, String s2) {
        int dp[][] = new int[s1.length() + 1][s2.length() + 1];
        for (int i = 1; i <= s1.length(); i++) {
            dp[i][0] = dp[i - 1][0] + s1.charAt(i - 1);
        }
        for (int j = 1; j <= s2.length(); j++) {
            dp[0][j] = dp[0][j - 1] + s2.charAt(j - 1);
        }
        for (int i = 1; i <= s1.length(); i++) {
            for (int j = 1; j <= s2.length(); j++) {
                if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1];
                } else {
                    dp[i][j] = Math.min(dp[i - 1][j] + s1.charAt(i - 1), dp[i][j - 1] + s1.charAt(j - 1));
                }
            }
        }
        return dp[s1.length()][s2.length()];
    }

    /*private int solve(String s1, String s2, int i, int j, Integer[][] dp) {
        int m = s1.length();
        int n = s2.length();
        int sum = 0;
        if (i == m || j == n) {
            if (i == m && j == n) {
                return 0;
            }
            return (i == m) ? finalSum(s2, j) : finalSum(s1, i);
        }

        if (dp[i][j] != null) {
            return dp[i][j];
        }

        if (s1.charAt(i) == s2.charAt(j)) {
            sum = solve(s1, s2, i + 1, j + 1, dp);
        } else {
            sum = Math.min(solve(s1, s2, i + 1, j, dp) + s1.charAt(i), solve(s1, s2, i, j + 1, dp) + s2.charAt(j));
        }

        dp[i][j] = sum;

        return sum;
    }

    private int finalSum(String str, int index) {
        int sum = 0;
        for (int var = index; var < str.length(); var++) {
            sum += str.charAt(var);
        }
        return sum;
    }*/
}
