package com.inani.vijay.leetcode;

import java.util.ArrayList;
import java.util.List;

public class _763PartitionLabels {

    public static void main(String[] args) {
        System.out.println(new _763PartitionLabels().partitionLabels("ababcbacadefegdehijhklij"));
    }

    public List<Integer> partitionLabels(String s) {
        int[] lastIndex = new int[26];
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            lastIndex[s.charAt(i) - 'a'] = i;
        }
        int last = 0;
        int start = 0;
        for (int i = 0; i < s.length(); i++) {
            last = Math.max(last, lastIndex[s.charAt(i) - 'a']);
            if (last == i) {
                result.add(last - start + 1);
                start = last + 1;
            }
        }
        return result;
    }
}
