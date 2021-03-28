package com.inani.vijay.leetcode;

import java.util.ArrayList;
import java.util.List;

public class SelfDividingNumbers_728 {

    public static void main(String[] args) {
        System.out.println(new SelfDividingNumbers_728().selfDividingNumbers(1, 22));
    }

    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> result = new ArrayList<>();
        for (int i = left; i <= right; i++) {
            int num = i;
            boolean selfDivisible = true;
            while (num > 0) {
                int curr = num % 10;
                if (curr == 0 || i % curr != 0) {
                    selfDivisible = false;
                    break;
                }
                num = num / 10;
            }
            if (selfDivisible) {
                result.add(i);
            }
        }
        return result;
    }
}
