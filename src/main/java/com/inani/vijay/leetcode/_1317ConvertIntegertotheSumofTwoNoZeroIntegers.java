package com.inani.vijay.leetcode;

public class _1317ConvertIntegertotheSumofTwoNoZeroIntegers {

    public static void main(String[] args) {
        int[] result  = new _1317ConvertIntegertotheSumofTwoNoZeroIntegers().getNoZeroIntegers(10);
        for(int res: result) {
            System.out.println(res);
        }
    }

    public int[] getNoZeroIntegers(int n) {
        for (int i = 1; i < n; i++) {
            if (noZero(i) && noZero(n - i)) {
                return new int[]{i, n - i};
            }
        }
        return new int[]{-1, -1};
    }

    private boolean noZero(int i) {
        while (i > 0) {
            if (i % 10 == 0) return false;
            i = i / 10;
        }
        return true;
    }
}
