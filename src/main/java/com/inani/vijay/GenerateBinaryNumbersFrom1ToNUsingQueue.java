package com.inani.vijay;

import java.util.LinkedList;
import java.util.Queue;

public class GenerateBinaryNumbersFrom1ToNUsingQueue {

    public static void main(String[] args) {
        generateBinaryNumbersFrom1ToNUsingQueue(20);
    }

    private static void generateBinaryNumbersFrom1ToNUsingQueue(int n) {
        Queue<String> binaryNumbers = new LinkedList<>();
        binaryNumbers.add("1");
        while (n-- > 0) {
            String s1 = binaryNumbers.remove();
            System.out.println(s1);
            String s2 = s1;
            binaryNumbers.add(s1 + "0");
            binaryNumbers.add(s2 + "1");
        }
    }
}

