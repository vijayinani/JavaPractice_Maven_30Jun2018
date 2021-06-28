package com.inani.vijay;

public class FindNthUglyNo {

    public static void main(String[] args) {
        System.out.println(new FindNthUglyNo().findNthUglyNo(150));
    }

    private int findNthUglyNo(int n) {

        int count = 1;
        int i = 1;

        while (count < n) {
            i++;
            if (checkUgly(i) == 1) {
                count++;
            }
        }

        return i;

    }

    private int checkUgly(int i) {
        i = check(i, 2);
        i = check(i, 3);
        i = check(i, 5);
        return i;
    }

    private int check(int number, int divisibleBy) {
        while (number % divisibleBy == 0) {
            number = number / divisibleBy;
        }
        return number;
    }

}
