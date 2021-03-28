package com.inani.vijay.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubsetsII_90 {

    public static void main(String[] args) {
        System.out.println(new SubsetsII_90().subsetsWithDup(new int[]{1, 2, 2}));
    }

    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        backtrack(nums, 0, result, new ArrayList<Integer>());
        return result;
    }

    private void backtrack(int[] nums, int start, List<List<Integer>> result, ArrayList<Integer> tempList) {
        result.add(new ArrayList<>(tempList));
        for (int i = start; i < nums.length; i++) {
            if (i > start && nums[i] == nums[i - 1]) continue;
            tempList.add(nums[i]);
            backtrack(nums, i + 1, result, tempList);
            tempList.remove(tempList.size() - 1);
        }
    }
}
