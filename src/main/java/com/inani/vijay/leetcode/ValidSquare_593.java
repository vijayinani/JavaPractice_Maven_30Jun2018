package com.inani.vijay.leetcode;

import java.util.Arrays;
import java.util.HashSet;

public class ValidSquare_593 {

    public static void main(String[] args) {
        System.out.println(new ValidSquare_593().validSquare(new int[]{0, 0}, new int[]{0, 1}, new int[]{1, 0}, new int[]{1, 1}));
    }

    public boolean validSquare(int[] p1, int[] p2, int[] p3, int[] p4) {
        HashSet<Integer> length = new HashSet<>(Arrays.asList(distance(p1, p2), distance(p1, p3), distance(p1, p4), distance(p2, p3), distance(p2, p4), distance(p3, p4)));
        return !length.contains(0) && length.size() == 2;
    }

    private int distance(int[] i, int[] j) {
        return ((i[0] - j[0]) * (i[0] - j[0]) + ((i[1] - j[1]) * (i[1] - j[1])));
    }

}
