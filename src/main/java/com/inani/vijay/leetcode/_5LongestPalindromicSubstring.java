package com.inani.vijay.leetcode;

public class _5LongestPalindromicSubstring {

    public static void main(String[] args) {
        System.out.println(new _5LongestPalindromicSubstring().longestPalindrome("bababc"));
    }

    /*

    public String longestPalindrome(String s) {
        int n = s.length();
        int maxLength = 1;
        boolean[][] dp = new boolean[n][n];

        for (int i = 0; i < n; i++) {
            dp[i][i] = true;
        }

        int start = 0;
        for (int i = 0; i < n - 1; i++) {
            if (s.charAt(i) == s.charAt(i + 1)) {
                dp[i][i + 1] = true;
                start = i;
                maxLength = 2;
            }
        }

        for (int k = 3; k <= n; k++) {
            for (int i = 0; i < n - k + 1; i++) {
                int j = i + k - 1;
                if (dp[i + 1][j - 1] && s.charAt(i) == s.charAt(j)) {
                    dp[i][j] = true;
                    if (k > maxLength) {
                        maxLength = k;
                        start = i;
                    }
                }
            }
        }

        return s.substring(start, start + maxLength);

    }


     */


    public String longestPalindrome(String s) {

        int start = 0;
        int maxLength = 1;

        if(s.length() <= 1) {
            return s;
        }
        int n = s.length();
        boolean[][] dp = new boolean[n][n];

        for(int i =0;i<n;i++) {
            dp[i][i] = true;
        }

        for(int i = n -1;i>=0;i--) {
            for(int j = i + 1; j<n;j++) {
                if(s.charAt(i) == s.charAt(j)) {
                    if(j - i == 1 || dp[i+1][j-1]) {
                        dp[i][j] = true;
                        if(maxLength < j - i + 1) {
                            maxLength = j - i + 1;
                            start = i;
                        }
                    }
                }
            }
        }

        return s.substring(start, start + maxLength);

    }
}
