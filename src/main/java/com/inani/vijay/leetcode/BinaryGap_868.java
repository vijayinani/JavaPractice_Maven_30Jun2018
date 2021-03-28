package com.inani.vijay.leetcode;

public class BinaryGap_868 {

    public static void main(String[] args) {
        System.out.println(new BinaryGap_868().binaryGap(12));
    }

    public int binaryGap(int N) {
        int max = 0;
        int pos = 0;
        int lastPos = -1;
        while (N != 0) {
            pos++;
            if ((N & 1) == 1) {
                if (lastPos != -1) {
                    max = Math.max(max, pos - lastPos);
                }
                lastPos = pos;
            }
            N >>= 1;
        }
        return max;
    }
}
