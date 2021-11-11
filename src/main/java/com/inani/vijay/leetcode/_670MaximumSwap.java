package com.inani.vijay.leetcode;

public class _670MaximumSwap {

    public static void main(String[] args) {
        System.out.println(new _670MaximumSwap().maximumSwap(97842));
    }

    /*
    public int maximumSwap(int num) {
        char[] chars = String.valueOf(num).toCharArray();
        int maxIndex = -1;
        int maxVal = -1;
        int leftIndex = -1;
        int rightIndex = -1;
        for (int i = chars.length - 1; i >= 0; i--) {
            if (chars[i] > maxVal) {
                maxVal = chars[i];
                maxIndex = i;
            } else if (chars[i] < maxVal) {
                leftIndex = i;
                rightIndex = maxIndex;
            }
        }

        if (leftIndex == -1) {
            return num;
        }

        char temp = chars[leftIndex];
        chars[leftIndex] = chars[rightIndex];
        chars[rightIndex] = temp;

        return Integer.valueOf(new String(chars));
    }
    */

    public int maximumSwap(int num) {
        char[] chars = String.valueOf(num).toCharArray();
        int min = chars[0];
        int minIndex = 0;
        for (int i = 0; i < chars.length - 1; i++) {
            if (chars[i + 1] > chars[i]) {
                minIndex = i;
                min = chars[i];
                break;
            } else if (i == chars.length - 2) {
                return num;
            }
        }
        int maxIndex = -1;
        int max = min;
        for (int i = minIndex; i < chars.length; i++) {
            if (chars[i] >= max) {
                max = chars[i];
                maxIndex = i;
            }
        }
        int swapIndex = minIndex;

        for (int i = 0; i <= minIndex; i++) {
            if (chars[i] < max) {
                swapIndex = i;
                break;
            }
        }

        char temp = chars[swapIndex];
        chars[swapIndex] = chars[maxIndex];
        chars[maxIndex] = temp;

        return Integer.valueOf(new String(chars));
    }
}
