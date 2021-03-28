package com.inani.vijay.leetcode;

public class _441ArrangingCoins {

    public static void main(String[] args) {
        System.out.println(new _441ArrangingCoins().arrangeCoins(5));
    }

    /*public int arrangeCoins(int n) {
        return (int)Math.floor(-0.5 + Math.sqrt((double) 2 * n + 0.25));
    }*/

    public int arrangeCoins(int n) {
        //convert int to long to prevent integer overflow
        long nLong = (long)n;

        long st = 0;
        long ed = nLong;

        long mid = 0;

        while (st <= ed){
            mid = st + (ed - st) / 2;

            if (mid * (mid + 1) <= 2 * nLong){
                st = mid + 1;
            }else{
                ed = mid - 1;
            }
        }

        return (int)(st - 1);
    }
}
