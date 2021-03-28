package com.inani.vijay.leetcode;

public class _476NumberComplement {
    public int findComplement(int num) {
        int X = 0;
        while (num > X) X = X * 2 + 1;
        return X ^ num;
    }
}
