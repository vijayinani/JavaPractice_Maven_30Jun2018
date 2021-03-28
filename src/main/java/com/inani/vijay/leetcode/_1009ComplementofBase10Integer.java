package com.inani.vijay.leetcode;

public class _1009ComplementofBase10Integer {

    public static void main(String[] args) {
        System.out.println(new _1009ComplementofBase10Integer().bitwiseComplement(100));
    }

    public int bitwiseComplement(int N) {
        if(N == 0) return 1;
        int X = 0;
        while (N > X) X = X * 2 + 1;
        return  X ^ N;
    }
}
