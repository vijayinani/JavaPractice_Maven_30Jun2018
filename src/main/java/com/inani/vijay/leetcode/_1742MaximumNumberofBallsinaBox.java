package com.inani.vijay.leetcode;

import java.util.HashMap;
import java.util.Map;

public class _1742MaximumNumberofBallsinaBox {

    public static void main(String[] args) {
        System.out.println(new _1742MaximumNumberofBallsinaBox().countBalls(1, 10));
    }

    /*
    public int countBalls(int lowLimit, int highLimit) {
        Map<Integer, Integer> count = new HashMap<>();
        int res = 0;
        for (int i = lowLimit; i <= highLimit; i++) {
            int num = i;
            int sum = 0;
            while (num > 0) {
                sum += num % 10;
                num /= 10;
            }
            count.put(sum, count.getOrDefault(sum, 0) + 1);
            res = Math.max(res, count.get(sum));
        }
        return res;
    }
    */

    public int countBalls(int lowLimit, int highLimit) {
        int[] count = new int[45];
        int res = 0;
        for (int i = lowLimit; i <= highLimit; i++) {
            int num = i;
            int sum = 0;
            while (num > 0) {
                sum += num % 10;
                num /= 10;
            }
            count[sum] += 1;
            res = Math.max(res, count[sum]);
        }
        return res;
    }
}
