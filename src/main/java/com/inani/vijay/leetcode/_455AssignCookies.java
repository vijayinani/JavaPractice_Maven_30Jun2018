package com.inani.vijay.leetcode;

import java.util.Arrays;

public class _455AssignCookies {

    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);

        int child = 0;
        for (int cookie = 0; child < g.length && cookie < s.length; cookie++) {
            if(g[child] <= s[cookie]) {
                child++;
            }
        }

        return child;
    }

}
