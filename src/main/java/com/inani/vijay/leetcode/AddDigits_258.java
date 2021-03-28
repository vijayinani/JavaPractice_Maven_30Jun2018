package com.inani.vijay.leetcode;

public class AddDigits_258 {

    public static void main(String[] args) {
        System.out.println(new AddDigits_258().addDigits(38));
    }

    /*public int addDigits(int num) {
        if(num == 0) {
            return 0;
        }

        if(num % 9 == 0) {
            return 9;
        }

        return num % 9;
    }*/

    public int addDigits(int num) {

        while (true) {
            int sum = 0;
            while (num > 0) {

                sum += num % 10;
                num = num / 10;
            }
            if(sum /10 == 0) {
                return sum;
            }

            num = sum;
        }
    }
}
