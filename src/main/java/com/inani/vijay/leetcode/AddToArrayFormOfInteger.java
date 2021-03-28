package com.inani.vijay.leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AddToArrayFormOfInteger {

    public static void main(String[] args) {
        System.out.println(new AddToArrayFormOfInteger().addToArrayForm(new int[]{2, 7, 4}, 181));
    }

    public List<Integer> addToArrayForm(int[] A, int K) {

        List<Integer> result = new ArrayList<>();
        for (int i = A.length - 1; i >= 0; i--) {
            result.add((A[i] + K) % 10);
            K = (A[i] + K) / 10;
        }
        while (K > 0) {
            result.add(K % 10);
            K = K / 10;
        }
        Collections.reverse(result);
        return result;
    }
}
