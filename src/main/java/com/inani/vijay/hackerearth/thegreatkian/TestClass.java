package com.inani.vijay.hackerearth.thegreatkian;

import java.util.Scanner;

class TestClass {
    public static void main(String args[]) throws Exception {
        long[] results = new long[3];
        int next = 0;
        Scanner s = new Scanner(System.in);
        long n = Long.parseLong(s.nextLine());
        String[] numbers = s.nextLine().split(" ");
        for (int i = 0; i < n; i++) {
            switch (next) {
                case 0:
                    results[0] = results[0] + Long.parseLong(numbers[i]);
                    next = 1;
                    break;
                case 1:
                    results[1] = results[1] + Long.parseLong(numbers[i]);
                    next = 2;
                    break;
                case 2:
                    results[2] = results[2] + Long.parseLong(numbers[i]);
                    next = 0;
                    break;
            }
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (long result : results) {
            stringBuilder.append(result + " ");
        }
        System.out.println(stringBuilder.substring(0, stringBuilder.length() - 1));
    }
}
