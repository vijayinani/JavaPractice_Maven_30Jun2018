package com.inani.vijay.leetcode;

public class ZigZagConversion {

    public static void main(String[] args) {
        System.out.println(new ZigZagConversion().convert("PAYPALISHIRING", 4));
    }

    public String convert(String s, int numRows) {
        char[] charArray = s.toCharArray();
        StringBuffer[] sb = new StringBuffer[numRows];
        for (int i = 0; i < sb.length; i++) {
            sb[i] = new StringBuffer();
        }
        int len = charArray.length;
        int i = 0;
        while (i < len) {
            for (int curr = 0; curr < numRows && i < len; curr++) {
                sb[curr].append(charArray[i]);
                i++;
            }
            for (int curr = numRows - 2; curr >= 1 && i < len; curr--) {
                sb[curr].append(charArray[i]);
                i++;
            }
        }
        String result = "";
        for (StringBuffer sbLocal : sb) {
            result += sbLocal;
        }
        return result;
    }
}
