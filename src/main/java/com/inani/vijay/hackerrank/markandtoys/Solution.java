package com.inani.vijay.hackerrank.markandtoys;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Solution {

    private static final Scanner scanner = new Scanner(System.in);

    // Complete the maximumToys function below.
    static int maximumToys(int[] prices, int k) {
        Arrays.sort(prices);
        int spent = 0;
        int pointer = 0;
        int noOfToys = 0;
        while (spent <= k) {
            if (prices[pointer] + spent <= k) {
                spent = spent + prices[pointer];
                pointer++;
                noOfToys++;
            } else {
                break;
            }
        }
        return noOfToys;
    }

    public static void main(String[] args) throws IOException {

        String[] nk = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nk[0]);

        int k = Integer.parseInt(nk[1]);

        int[] prices = new int[n];

        String[] pricesItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int pricesItem = Integer.parseInt(pricesItems[i]);
            prices[i] = pricesItem;
        }

        int result = maximumToys(prices, k);
        System.out.println(result);

        scanner.close();
    }
}
