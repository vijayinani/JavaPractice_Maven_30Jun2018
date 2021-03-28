package com.inani.vijay.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSum_39 {

    public static void main(String[] args) {
        System.out.println(new CombinationSum_39().combinationSum(new int[]{1, 2, 3}, 5));
    }

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(candidates);
        backtrack(result, target, 0, candidates, new ArrayList<Integer>());
        return result;
    }

    private void backtrack(List<List<Integer>> result, int remain, int start, int[] candidates, List<Integer> tempList) {
        if (remain < 0) return;
        else if (remain == 0) result.add(new ArrayList<>(tempList));
        else {
            for (int i = start; i < candidates.length; i++) {
                tempList.add(candidates[i]);
                backtrack(result, remain - candidates[i], i, candidates, tempList);
                tempList.remove(tempList.size() - 1);
            }
        }
    }

}
