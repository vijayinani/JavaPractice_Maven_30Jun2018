package com.inani.vijay.leetcode;

public class _1497CheckIfArrayPairsAreDivisiblebyk {

    public static void main(String[] args) {
        System.out.println(new _1497CheckIfArrayPairsAreDivisiblebyk().canArrange(new int[]{-1, 1, -2, 2, -3, 3, -4, 4}, 3));
    }

    /*public boolean canArrange(int[] arr, int k) {
        boolean[] usedIndex = new boolean[arr.length];
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (!usedIndex[i] && !usedIndex[j]) {
                    if ((arr[i] + arr[j]) % k == 0 || arr[i] + arr[j] == 0) {
                        usedIndex[i] = true;
                        usedIndex[j] = true;
                    }
                }
            }
        }
        for (boolean index : usedIndex) {
            if (!index) {
                return false;
            }
        }
        return true;
    }*/

    public boolean canArrange(int[] arr, int k) {
        int[] remainder = new int[k];
        for (int currVal : arr) {
            currVal = currVal % k;
            if (currVal < 0) {
                currVal = currVal + k;
            }
            remainder[currVal]++;
        }

        if (remainder[0] % 2 != 0) {
            return false;
        }

        for (int i = 1; i <= k / 2; i++) {
            if (remainder[i] != remainder[k - i]) {
                return false;
            }
        }
        return true;
    }
}
