package com.inani.vijay.leetcode;

public class _1524NumberofSubarraysWithOddSum {

    public static void main(String[] args) {
        System.out.println(new _1524NumberofSubarraysWithOddSum().numOfSubarrays(new int[]{1, 3, 5}));
    }

    /*
    public int numOfSubarrays(int[] arr) {
        int res = 0;
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = i; j < arr.length; j++) {
                sum += arr[j];
                if (sum % 2 != 0) {
                    res++;
                }
            }
        }
        return res;
    }

     */

    public int numOfSubarrays(int[] arr) {
        int even = 0;
        int odd = 0;
        int res = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 1) {
                int temp = odd;
                odd = even + 1;
                even = temp;
            } else {
                even++;
            }
            res = (res + odd) % 1000000007;
        }
        return res;
    }
}
