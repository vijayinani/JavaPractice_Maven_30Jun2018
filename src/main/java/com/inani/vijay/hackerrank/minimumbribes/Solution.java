package com.inani.vijay.hackerrank.minimumbribes;

import static java.lang.Math.max;

public class Solution {

    static void minimumBribes(int[] q) {
        int bribes = 0;
        for (int i = q.length - 1; i >= 0; i--) {
            if (q[i] - (i + 1) > 2) {
                System.out.println("Too chaotic");
                return;
            }

            for (int j = max(0, q[i] - 2); j < i; j++) {
                if (q[j] > q[i]) {
                    bribes++;
                }
            }
        }
        System.out.println(bribes);
    }


    public static void main(String[] args) {
        int[] q = {2, 1, 5, 3, 4};
        minimumBribes(q);
    }
}
