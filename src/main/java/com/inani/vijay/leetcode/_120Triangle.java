package com.inani.vijay.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _120Triangle {

//    Input: triangle = [[2],[3,4],[6,5,7],[4,1,8,3]]
//    Output: 11
//    Explanation: The triangle looks like:
//            2
//            3 4
//            6 5 7
//            4 1 8 3
//    The minimum path sum from top to bottom is 2 + 3 + 5 + 1 = 11 (underlined above).

    public static void main(String[] args) {
        List<List<Integer>> triangle = new ArrayList<>();
        triangle.add(Arrays.asList(-1));
        triangle.add(Arrays.asList(2, 3));
        triangle.add(Arrays.asList(1, -1, -3));
        //triangle.add(Arrays.asList(4, 1, 8, 3));
        System.out.println(new _120Triangle().minimumTotal(triangle));
    }

    /*public int minimumTotal(List<List<Integer>> triangle) {
        int minTotal = 0;
        int currIndex = 0;
        for (List<Integer> currentRow : triangle) {
            int currMin = Integer.MAX_VALUE;
            int nextMaxIndex = currIndex + 1 == currentRow.size() ? currIndex : currIndex + 1;
            for (int i = currIndex; i <= nextMaxIndex; i++) {
                if (currentRow.get(i) < currMin) {
                    currMin = currentRow.get(i);
                    currIndex = i;
                }
            }
            minTotal += currMin;
        }
        return minTotal;
    }*/

    /*public int minimumTotal(List<List<Integer>> triangle) {
        int[] A = new int[triangle.size() + 1];
        for (int i = triangle.size() - 1; i >= 0; i--) {
            for (int j = 0; j < triangle.get(i).size(); j++) {
                A[j] = Math.min(A[j], A[j + 1]) + triangle.get(i).get(j);
            }
        }
        return A[0];
    }*/

    public int minimumTotal(List<List<Integer>> triangle) {
        int[] minimum = new int[triangle.size() + 1];
        for (int i = triangle.size() - 1; i >= 0; i--) {
            for (int j = 0; j < triangle.get(i).size(); j++) {
                minimum[j] = Math.min(minimum[j], minimum[j + 1]) + triangle.get(i).get(j);
            }
        }
        return minimum[0];
    }
}
