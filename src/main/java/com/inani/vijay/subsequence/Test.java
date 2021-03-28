package com.inani.vijay.subsequence;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.next());
        for (int i = 0; i < n; i++) {
            int len = Integer.parseInt(scanner.next());
            String str = scanner.next();
            System.out.println(calculate(str, len));
        }
    }

    private static int calculate(String str, int len) {
        if (str.equals(null) || str.length() < 26 || len < 26 || str.length() != len) {
            return 0;
        }
        boolean aFound = false;
        char current = 0;
        char previous = 0;
        int[] charArray = new int[26];
        int result = 1;
        for (int i = 0; i < len; i++) {
            if (str.charAt(i) == 'a') {
                aFound = true;
                previous = 'a';
            }
            if (aFound) {
                current = str.charAt(i);
                if (current - previous == 0 || current - previous == 1) {
                    charArray[current - 97] = charArray[current - 97] + 1;
                    previous = current;
                    if (current == 'z' && (i + 1) < len && str.charAt(i + 1) != 'z') {
                        aFound = false;
                        for (int x : charArray) {
                            if (x == 0) {
                                return 0;
                            }
                            result = result * result;
                        }
                    }
                }
            }
        }
        return result;
    }
}
