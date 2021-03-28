package com.inani.vijay.permutation;

import java.util.ArrayDeque;
import java.util.Queue;

public class PermutationIterative {
    public static void main(String[] args) {
        permutationIterative("abcd");
    }

    private static void permutationIterative(String str) {
        Queue<String> currentQueue = null;
        int charNumber = 1;
        for (char c : str.toCharArray()) {
            if (currentQueue == null) {
                currentQueue = new ArrayDeque<>(1);
                currentQueue.add(String.valueOf(c));
            } else {
                int currentQueueSize = currentQueue.size();
                int numElements = currentQueueSize * charNumber;
                Queue<String> nextQueue = new ArrayDeque<>(numElements);
                for (int i = 0; i < currentQueueSize; i++) {
                    String tempString = currentQueue.remove();
                    for (int j = 0; j < charNumber; j++) {
                        int n = tempString.length();
                        nextQueue.add(tempString.substring(0, j) + c + tempString.substring(j, n));
                    }
                }
                currentQueue = nextQueue;
            }
            charNumber++;
        }
        System.out.println(currentQueue);
    }
}
