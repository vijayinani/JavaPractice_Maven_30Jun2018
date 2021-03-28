package com.inani.vijay.hackerrank.twostrings;

import java.io.IOException;
import java.util.Scanner;

public class Solution {

    private static final Scanner scanner = new Scanner(System.in);

    // Complete the twoStrings function below.
    static String twoStrings(String s1, String s2) {
        int[] charsCount = new int[26];
        for (char c : s1.toCharArray()) {
            charsCount[c - 97] = 1;
        }
        for (char c : s2.toCharArray()) {
            if (charsCount[c - 97] == 1) {
                return "YES";
            }
        }
        return "NO";
    }

    public static void main(String[] args) throws IOException {

        int q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int qItr = 0; qItr < q; qItr++) {
            String s1 = scanner.nextLine();

            String s2 = scanner.nextLine();

            String result = twoStrings(s1, s2);
            System.out.println(result);

        }


        scanner.close();
    }
}
