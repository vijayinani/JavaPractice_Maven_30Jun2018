package com.inani.vijay.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PermutationsII_47 {

    public static void main(String[] args) {
        System.out.println(new PermutationsII_47().permuteUnique(new int[]{1, 2, 2}));
    }

    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        backtrack(result, nums, new ArrayList<Integer>(), new boolean[nums.length]);
        return result;
    }

    private void backtrack(List<List<Integer>> result, int[] nums, ArrayList<Integer> tempList, boolean[] used) {
        if (tempList.size() == nums.length) {
            result.add(new ArrayList<>(tempList));
        } else {
            for (int i = 0; i < nums.length; i++) {
                if (used[i] || i > 0 && nums[i] == nums[i - 1] && !used[i - 1]) continue;
                used[i] = true;
                tempList.add(nums[i]);
                backtrack(result, nums, tempList, used);
                used[i] = false;
                tempList.remove(tempList.size() - 1);

            }
        }
    }
}
