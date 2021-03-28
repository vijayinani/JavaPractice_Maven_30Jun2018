package com.inani.vijay.leetcode;

public class HappyNumber_202 {


    public static void main(String[] args) {
        System.out.println(new HappyNumber_202().isHappy(19));
    }

    /*public boolean isHappy(int n) {
        Set<Integer> encounteredNumbers = new HashSet<>();
        while (true) {
            int currentSum = 0;
            while (n > 0) {
                int digit = n % 10;
                currentSum += (int) Math.pow(digit, 2);
                n /= 10;
            }
            if (encounteredNumbers.contains(currentSum)) {
                return false;
            } else if (currentSum == 1) {
                return true;
            }
            encounteredNumbers.add(currentSum);
            n = currentSum;
        }
    }*/

    public boolean isHappy(int n) {
        int slow = n;
        int fast = n;
        do {
            slow = digitSquareSum(slow);
            fast = digitSquareSum(fast);
            fast = digitSquareSum(fast);
            if (slow == 1) {
                return true;
            }
        } while (slow != fast);
        return false;
    }

    private int digitSquareSum(int n) {
        int sum = 0;
        while (n > 0) {
            sum += (int) Math.pow(n % 10, 2);
            n /= 10;
        }
        return sum;
    }
}
