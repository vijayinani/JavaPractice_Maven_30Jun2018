package com.inani.vijay.leetcode;

public class LongestCommonPrefix {

    public static void main(String[] args) {
        System.out.println(new LongestCommonPrefix().longestCommonPrefix(new String[]{"flower", "flow", "flight"}));
    }

    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) return "";
        String pre = strs[0];
        for (int i = 1; i < strs.length; i++) {
            while (!strs[i].startsWith(pre)) {
                pre = pre.substring(0, pre.length() - 1);
            }
        }
        return pre;
    }
}
