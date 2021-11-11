package com.inani.vijay;

import java.util.HashSet;
import java.util.Set;

public class FirstDuplicate {

    public static void main(String[] args) {
        //System.out.println(new FirstDuplicate().findFirstDuplicate(new int[]{5, 1, 3, 2, 3, 5}));
        //System.out.println(new FirstDuplicate().findFirstDuplicate(new int[]{1, 2, 3, 4, 5, 6}));
        //System.out.println(new FirstDuplicate().findFirstDuplicateWithoutExtraSpace(new int[]{5, 1, 3, 2, 3, 5}));
        //System.out.println(new FirstDuplicate().findFirstDuplicateWithoutExtraSpace(new int[]{1, 2, 3, 4, 5, 6}));
        //System.out.println(new FirstDuplicate().findFirstDuplicateWithoutExtraSpace(new int[]{2, 1, 3, 5, 3, 2}));
        System.out.println(new FirstDuplicate().findFirstDuplicateWithoutExtraSpace(new int[]{5, 4, 3, 2, 2, 3}));
        //System.out.println(new FirstDuplicate().findFirstDuplicateWithoutExtraSpace(new int[]{5, 4, 3, 2, 3, 2}));
    }

    private int findFirstDuplicate(int[] input) {
        Set<Integer> firstTime = new HashSet<>();
        for (int val : input) {
            if (firstTime.contains(val)) {
                return val;
            } else {
                firstTime.add(val);
            }
        }
        return -1;
    }

    private int findFirstDuplicateWithoutExtraSpace(int[] input) {
        for (int val : input) {
            if (input[Math.abs(val) - 1] < 0) {
                return Math.abs(val);
            } else {
                input[Math.abs(val) - 1] = -input[Math.abs(val) - 1];
            }
        }
        return -1;
    }
}

