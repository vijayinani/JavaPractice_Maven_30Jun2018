package com.inani.vijay.leetcode;

import java.util.Arrays;

public class ReorderedPower2_869 {

    public static void main(String[] args) {
        System.out.println(new ReorderedPower2_869().reorderedPowerOf2(46));
    }

    public boolean reorderedPowerOf2(int N) {
        char[] input = String.valueOf(N).toCharArray();
        Arrays.sort(input);
        String s1 = new String(input);

        for (int i = 0; i < 31; i++) {
            //char[] current = String.valueOf((int)Math.pow(2, i)).toCharArray();
            char[] current = String.valueOf((int) 1 << i ).toCharArray();
            Arrays.sort(current);
            String s2 = new String(current);
            if (s1.equals(s2)) {
                return true;
            }
        }
        return false;
    }
}
