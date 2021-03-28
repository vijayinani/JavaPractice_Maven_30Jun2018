package com.inani.vijay.permutation;

public class PermutationPracticeAgain {
    public static void main(String[] args) {
        permutation("abc");
    }

    private static void permutation(String str) {
        permutation("", str);
    }

    private static void permutation(String prefix, String str) {
        int n = str.length();
        if (n == 1) {
            System.out.println(prefix + str);
        } else {
            for (int i = 0; i < n; i++) {
                permutation(prefix + str.charAt(i), str.substring(0, i) + str.substring(i + 1, n));
            }
        }
    }
}
