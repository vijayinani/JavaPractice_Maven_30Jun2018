package com.inani.vijay.fibbonacci;

public class WithoutDPOnlyRecursion {

    public static void main(String[] args) {
        System.out.println(new WithoutDPOnlyRecursion().fibbonacci(8));
    }

    private int fibbonacci(int n) {
        if (n <= 2) {
            return 1;
        }
        return fibbonacci(n - 1) + fibbonacci(n - 2);
    }
}
