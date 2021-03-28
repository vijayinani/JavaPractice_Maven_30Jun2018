package com.inani.vijay.leetcode;

import java.util.ArrayList;
import java.util.List;

public class Permutations_46 {
    public static void main(String[] args) {
        System.out.println(new Permutations_46().permute(new int[]{1, 2, 3}));
    }

    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(result, nums, new ArrayList<Integer>());
        return result;
    }

    private void backtrack(List<List<Integer>> result, int[] nums, ArrayList<Integer> tempList) {
        if (tempList.size() == nums.length) {
            result.add(new ArrayList<>(tempList));
            return;
        }

        for (int i = 0; i < nums.length; i++) {
            if (tempList.contains(nums[i])) continue;
            tempList.add(nums[i]);
            backtrack(result, nums, tempList);
            tempList.remove(tempList.size() - 1);
        }
    }
}
