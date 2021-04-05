package com.inani.vijay.leetcode;

public class _1513NumberofSubstringsWithOnly1s {

    public static void main(String[] args) {
        System.out.println(new _1513NumberofSubstringsWithOnly1s().numSub("0110111"));
    }

    public int numSub(String s) {
        int count = 0;
        int res = 0;
        int preChar = 0;
        int MOD = 1_000_000_007;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '1') {
                if (preChar == '1') {
                    count++;
                } else {
                    count = 1;
                }
                res = (res + count) %MOD ;
            }
            preChar = s.charAt(i);
        }
        return res;
    }
}
