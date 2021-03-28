package com.inani.vijay.leetcode;

public class CountNumbersWithUniqueDigits_357 {

    public static void main(String[] args) {
        System.out.println(new CountNumbersWithUniqueDigits_357().countNumbersWithUniqueDigits(8));
    }

    /*
    public int countNumbersWithUniqueDigits(int n) {
        if (n == 0) return 1;
        int maxRangeCheck = (int) Math.pow(10, n);
        int count = 0;
        for (int i = 0; i < maxRangeCheck; i++) {
            boolean[] repetitions = new boolean[10];
            int curr = i;
            boolean duplicateFound = false;
            while (curr > 0) {
                int remainder = curr % 10;
                if (repetitions[remainder]) {
                    duplicateFound = true;
                    break;
                }
                repetitions[remainder] = true;
                curr = curr / 10;
            }
            if (!duplicateFound) {
                count++;
            }
        }
        return count;
    }
    */

    public static int countNumbersWithUniqueDigits(int n) {
        if (n == 0) {
            return 1;
        }

        int ans = 10;
        int availableNumber = 9;
        int uniqueDigits = 9;

        while (n-- > 1 && availableNumber > 0) {
            uniqueDigits *= availableNumber;
            ans += uniqueDigits;
            availableNumber--;
        }

        return ans;

    }

}
