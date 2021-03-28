package com.inani.vijay.factorial;

public class FactorialRecursive {

    private static int temp[];

    public static void main(String[] args) {
        int num = 5;
        temp = new int[num + 1];
        System.out.println(factorial(num));
    }

    private static int factorial(int num) {
        if (num == 1 || num == 0) {
            return num;
        } else if (temp[num] != 0) {
            return temp[num];
        } else {
            temp[num] = num * factorial(num - 1);
            return temp[num];
        }
    }
}
