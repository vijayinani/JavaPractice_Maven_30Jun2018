package com.inani.vijay.leetcode;

public class PerfectNumber_507 {

    public static void main(String[] args) {
        System.out.println(new PerfectNumber_507().checkPerfectNumber(28));
    }

    /*public boolean checkPerfectNumber(int num) {

        if (num == 1) return false;

        int sum = 1;

        for (int i = 2; i <= num / 2; i++) {
            if (sum <= num && num % i == 0) {
                sum += i;
            }
        }

        if (sum == num) {
            return true;
        }
        return false;
    }*/

    public boolean checkPerfectNumber(int num) {
        if (num <= 0) {
            return false;
        }
        int sum = 0;
        for (int i = 1; i * i <= num; i++) {
            if (num % i == 0) {
                sum += i;
                if (i * i != num) {
                    sum += num / i;
                }

            }
        }
        return sum - num == num;
    }
}
