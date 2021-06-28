package com.inani.vijay.leetcode;

public class _526BeautifulArrangement {

    int count = 0;

    public static void main(String[] args) {
        System.out.println(new _526BeautifulArrangement().countArrangement(7));
    }

    public int countArrangement(int n) {
        helper(n, 1, new int[n + 1]);
        return count;
    }

    private void helper(int n, int pos, int[] used) {
        if (pos > n) {
            count++;
            return;
        }

        for (int i = 1; i <= n; i++) {
            if ((used[i] == 0 && (i % pos == 0 || pos % i == 0))) {
                used[i] = 1;
                helper(n, pos + 1, used);
                used[i] = 0;
            }
        }
    }
}
