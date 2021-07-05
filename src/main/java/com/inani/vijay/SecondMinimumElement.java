package com.inani.vijay;

public class SecondMinimumElement {

    public static void main(String[] args) {
        System.out.println(new SecondMinimumElement().secondMinimumElement(new int[]{5, 3, 2, 1, 39, 44, -23, -23, 49, 39, 42, 11, -36, 43, 2, 1, -444}));
    }

    private int secondMinimumElement(int[] input) {

        if(input.length < 2) {
            return Integer.MAX_VALUE;
        }

        int min = Integer.MAX_VALUE;
        int secondMin = Integer.MAX_VALUE;

        for (int currVal : input) {
            if (currVal < min) {
                secondMin = min;
                min = currVal;
            } else if (currVal != min && currVal < secondMin) {
                secondMin = currVal;
            }
        }
        return secondMin;
    }
}
