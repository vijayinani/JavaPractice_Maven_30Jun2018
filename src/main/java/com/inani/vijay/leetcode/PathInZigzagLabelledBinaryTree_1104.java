package com.inani.vijay.leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PathInZigzagLabelledBinaryTree_1104 {

    public static void main(String[] args) {
        System.out.println(new PathInZigzagLabelledBinaryTree_1104().pathInZigZagTree(14));
    }

    public List<Integer> pathInZigZagTree(int label) {
        List<Integer> result = new ArrayList<>();
        int level = 1;
        int nodeCount = 1;
        while (label >= nodeCount * 2) {
            nodeCount *= 2;
            level++;
        }

        while (level > 0) {
            result.add(label);
            int maxValueInCurrentLevel = (int) Math.pow(2, level) - 1;
            int minValueInCurrentLevel = (int) Math.pow(2, level - 1);
            label = (maxValueInCurrentLevel + minValueInCurrentLevel - label) / 2;
            level--;
        }

        Collections.reverse(result);
        return result;
    }
}
