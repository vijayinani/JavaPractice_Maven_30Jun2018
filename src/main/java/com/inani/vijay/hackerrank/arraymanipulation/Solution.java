package com.inani.vijay.hackerrank.arraymanipulation;

import java.util.Scanner;

public class Solution {

    private static final Scanner scanner = new Scanner(System.in);

    // Complete the arrayManipulation function below.
    static long arrayManipulation(int n, int[][] queries) {

        long[] arr = new long[n];

        long currentValue = 0;
        long max = 0;

        for (int i = 0; i < queries.length; i++) {
            int a = queries[i][0];
            int b = queries[i][1];
            long k = queries[i][2];

            arr[a - 1] = arr[a - 1] + k;
            if (b < arr.length) {
                arr[b] = arr[b] - k;
            }
        }

        for (int i = 0; i < n; i++) {
            currentValue = currentValue + arr[i];
            if (currentValue > max) {
                max = currentValue;
            }
        }
        return max;
    }

    public static void main(String[] args) {

        String[] nm = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nm[0]);

        int m = Integer.parseInt(nm[1]);

        int[][] queries = new int[m][3];

        for (int i = 0; i < m; i++) {
            String[] queriesRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 3; j++) {
                int queriesItem = Integer.parseInt(queriesRowItems[j]);
                queries[i][j] = queriesItem;
            }
        }

        long result = arrayManipulation(n, queries);

        System.out.println(result);

        scanner.close();
    }
}
