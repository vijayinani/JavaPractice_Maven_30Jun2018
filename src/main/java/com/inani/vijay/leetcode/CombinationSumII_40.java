package com.inani.vijay.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSumII_40 {


    public static void main(String[] args) {
        System.out.println(new CombinationSumII_40().combinationSum2(new int[]{1, 2, 3, 3, 3}, 5));
    }


    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(candidates);
        backtrack(candidates, target, result, new ArrayList<Integer>(), 0);
        return result;
    }

    private void backtrack(int[] candidates, int remain, List<List<Integer>> result, ArrayList<Integer> tempList, int start) {
        if (remain < 0) return;
        else if (remain == 0) result.add(new ArrayList<>(tempList));
        else {
            for (int i = start; i < candidates.length; i++) {
                if (i > start && candidates[i] == candidates[i - 1]) continue;
                tempList.add(candidates[i]);
                backtrack(candidates, remain - candidates[i], result, tempList, i + 1);
                tempList.remove(tempList.size() - 1);
            }
        }
    }


}
