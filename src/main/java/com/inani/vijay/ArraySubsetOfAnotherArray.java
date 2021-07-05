package com.inani.vijay;

import java.util.HashSet;
import java.util.Set;

public class ArraySubsetOfAnotherArray {
    static int set1[] = {10, 5, 3, 4, 6};
    static int set2[] = {5, 3, 4};

    public static void main(String[] args) {
        System.out.println(checkSubset());
    }

    private static boolean checkSubset() {
        Set<Integer> parent = new HashSet<>();
        for (int val : set1) {
            parent.add(val);
        }
        for (int val : set2) {
            if (!parent.contains(val)) {
                return false;
            }
        }
        return true;
    }
}
