package com.inani.vijay;

import java.util.HashSet;
import java.util.Set;

public class DisjointArrays {

    public static boolean areDisjoint(int set1[], int set2[]) {
        Set<Integer> first = new HashSet<>();
        for (int val : set1) {
            first.add(val);
        }
        for (int val : set2) {
            if (first.contains(val)) {
                return false;
            }
        }
        return true;
    }

    // Driver method to test above method
    public static void main(String[] args) {
        int set1[] = {10, 5, 3, 4, 6};
        int set2[] = {8, 7, 9};
        if (areDisjoint(set1, set2))
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}
