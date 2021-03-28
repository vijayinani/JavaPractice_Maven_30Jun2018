package com.inani.vijay.leetcode;

public class _1748SumofUniqueElements {

    public static void main(String[] args) {
        System.out.println(new _1748SumofUniqueElements().sumOfUnique(new int[]{1, 2, 3, 2}));
    }

    public int sumOfUnique(int[] nums) {
        int[] count = new int[101];
        int sum = 0;
        for (int num : nums) {
            if (count[num] == 0) {
                sum += num;
            } else if (count[num] == 1) {
                sum -= num;
            }
            count[num]++;
        }
        return sum;
    }
}
