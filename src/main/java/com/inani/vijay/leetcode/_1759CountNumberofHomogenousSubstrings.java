package com.inani.vijay.leetcode;

public class _1759CountNumberofHomogenousSubstrings {

    public static void main(String[] args) {
        System.out.println(new _1759CountNumberofHomogenousSubstrings().countHomogenous("abbcccaa"));
    }

    public int countHomogenous(String s) {
        int cur = 0;
        int res = 0;
        int count = 0;
        int MOD = (int) (1e9 + 7);
        for (int i = 0; i < s.length(); i++) {
            count = s.charAt(i) == cur ? count + 1 : 1;
            cur = s.charAt(i);
            res = (res + count) % MOD;
        }
        return res;
    }
}
