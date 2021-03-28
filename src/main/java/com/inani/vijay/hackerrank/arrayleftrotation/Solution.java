package com.inani.vijay.hackerrank.arrayleftrotation;

import java.util.Arrays;

public class Solution {

    // Complete the rotLeft function below.
    static int[] rotLeft(int[] a, int d) {
        for (int i = 0, j = a.length - 1; i < a.length / 2; i++, j--) {
            int temp = a[i];
            a[i] = a[j];
            a[j] = temp;
        }
        for (int i = 0, j = a.length - d - 1; i < j; i++, j--) {
            int temp = a[i];
            a[i] = a[j];
            a[j] = temp;
        }
        for (int i = a.length - d, j = a.length - 1; i < j; i++, j--) {
            int temp = a[i];
            a[i] = a[j];
            a[j] = temp;
        }
        return a;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(rotLeft(arr, 6)));
    }
}
