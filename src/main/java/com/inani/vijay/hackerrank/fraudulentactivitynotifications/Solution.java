package com.inani.vijay.hackerrank.fraudulentactivitynotifications;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Solution {

    private static final Scanner scanner = new Scanner(System.in);

    // Complete the activityNotifications function below.
    static int activityNotifications(int[] expenditure, int d) {
        int totalDays = expenditure.length;
        int notifications = 0;
        for (int i = d; i < totalDays; i++) {
            int[] medianRange = Arrays.copyOfRange(expenditure, i - d, i);
            Arrays.sort(medianRange);
            float median = 0F;
            if (d % 2 == 0) {
                median = ((float) (medianRange[(medianRange.length / 2) - 1] + medianRange[medianRange.length / 2])) / 2F;
            } else {
                median = medianRange[medianRange.length / 2];
            }
            if (expenditure[i] >= median * 2) {
                notifications++;
            }
        }
        return notifications;
    }

    public static void main(String[] args) throws IOException {

        String[] nd = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nd[0]);

        int d = Integer.parseInt(nd[1]);

        int[] expenditure = new int[n];

        String[] expenditureItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int expenditureItem = Integer.parseInt(expenditureItems[i]);
            expenditure[i] = expenditureItem;
        }

        int result = activityNotifications(expenditure, d);

        System.out.println(result);

        scanner.close();
    }
}
