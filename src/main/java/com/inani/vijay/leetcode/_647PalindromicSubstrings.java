package com.inani.vijay.leetcode;

public class _647PalindromicSubstrings {

    public static void main(String[] args) {
        System.out.println(new _647PalindromicSubstrings().countSubstrings("aaaa"));
    }

    /*public int countSubstrings(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            for (int j = i; j < s.length(); j++) {
                count += check(s, i, j) ? 1 : 0;
            }
        }
        return count;
    }

    private boolean check(String s, int i, int j) {
        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }*/

    /*
    public int countSubstrings(String s) {
        int ans = 0;
        boolean dp[][] = new boolean[s.length()][s.length()];
        for (int i = 0; i < s.length(); i++) {
            dp[i][i] = true;
            ans++;
        }
        for (int i = 0; i < s.length() - 1; i++) {
            dp[i][i + 1] = s.charAt(i) == s.charAt(i + 1);
            ans += (dp[i][i + 1] ? 1 : 0);
        }
        for (int len = 3; len <= s.length(); len++) {
            for (int i = 0, j = i + len - 1; j < s.length(); i++, j++) {
                dp[i][j] = dp[i + 1][j - 1] && s.charAt(i) == s.charAt(j);
                ans += (dp[i][j] ? 1 : 0);
            }
        }
        return ans;
    }
    */

    public int countSubstrings(String s) {
        int ans = 0;
        for (int i = 0; i < s.length(); i++) {
            ans += check(s, i, i);
        }
        for (int i = 0; i < s.length(); i++) {
            ans += check(s, i, i + 1);
        }
        return ans;
    }

    private int check(String s, int low, int high) {
        int ans = 0;
        while (low >= 0 && high < s.length()) {
            if (s.charAt(low) != s.charAt(high)) {
                break;
            }
            low--;
            high++;
            ans++;
        }
        return ans;
    }
}
