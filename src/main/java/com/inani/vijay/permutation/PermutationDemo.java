package com.inani.vijay.permutation;

public class PermutationDemo {
    
    private static int counter = 0; 
    
    public static void main(String[] args) {
        permutations("abcde");
        System.out.println(counter);
    }

    private static void permutations(String str) {
        permutations("", str);
    }

    private static void permutations(String prefix, String str) {
        int n = str.length();
        if (n == 1) {
            counter++;
            System.out.println(prefix + str);
        } else {
            for (int i = 0; i < n; i++) {
                permutations(prefix + str.charAt(i), str.substring(0, i) + str.substring(i + 1, n));
            }
        }
    }
}
