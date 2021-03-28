package com.inani.vijay.leetcode;

public class _374GuessNumberHigherorLower {

    int pick = 1;

    /*
     * 2126753390
     * 1702766719
     */

    public static void main(String[] args) {
        System.out.println(new _374GuessNumberHigherorLower().guessNumber(3));
    }

    int guess(int num) {
        if (num == pick) {
            return 0;
        } else if (num < pick) {
            return 1;
        } else {
            return -1;
        }
    }

    public int guessNumber(int n) {
        int low = 1;
        int high = n;

        while (low < high) {
            int mid = low + (high - low) / 2;
            if (guess(mid) == 0) {
                return mid;
            }

            if (guess(mid) == 1) {
                low = mid + 1;


            } else if (guess(mid) == -1) {
                high = mid - 1;


            }
        }
        return low;
    }
}
