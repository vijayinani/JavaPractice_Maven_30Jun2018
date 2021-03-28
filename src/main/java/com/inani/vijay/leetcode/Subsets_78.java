package com.inani.vijay.leetcode;

import java.util.ArrayList;
import java.util.List;

public class Subsets_78 {

    public static void main(String[] args) {
        System.out.println(new Subsets_78().subsets(new int[]{1, 2, 3}));
    }

    List<List<Integer>> result = new ArrayList<>();
    int n, k;

    /*
    public List<List<Integer>> subsets(int[] nums) {
        n = nums.length;
        for (k = 0; k <= n; k++) {
            backtrack(0, new ArrayList<Integer>(), nums);
        }
        return result;
    }

    private void backtrack(int start, ArrayList<Integer> curr, int[] nums) {
        if (curr.size() == k) {
            result.add(new ArrayList<>(curr));
            return;
        }

        for (int i = start; i < n; i++) {
            curr.add(nums[i]);
            backtrack(i + 1, curr, nums);
            curr.remove(curr.size() - 1);
        }
    }*/

    /*public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> output = new ArrayList();
        int n = nums.length;

        for (int i = (int)Math.pow(2, n); i < (int)Math.pow(2, n + 1); ++i) {
            // generate bitmask, from 0..00 to 1..11
            String bitmask = Integer.toBinaryString(i).substring(1);

            // append subset corresponding to that bitmask
            List<Integer> curr = new ArrayList();
            for (int j = 0; j < n; ++j) {
                if (bitmask.charAt(j) == '1') curr.add(nums[j]);
            }
            output.add(curr);
        }
        return output;
    }*/

    /*public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        result.add(new ArrayList<>());
        for (int num : nums) {
            int n = result.size();
            for(int i=0;i<n;i++) {
                List<Integer> integers = new ArrayList<>(result.get(i));
                integers.add(num);
                result.add(integers);
            }
        }
        return result;
    }*/

/*    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        result.add(new ArrayList<>());
        for (int num : nums) {
            List<List<Integer>> newSubsets = new ArrayList<>();
            for (List<Integer> curr : result) {
                newSubsets.add(new ArrayList<Integer>(curr) {{
                    add(num);
                }});
            }
            for (List<Integer> curr : newSubsets) {
                result.add(curr);
            }
        }
        return result;
    }*/

    /*public List<List<Integer>> subsets(int[] nums) {
        n = nums.length;
        for (k = 0; k <= n; k++) {
            backtrack(0, new ArrayList<Integer>(), nums);
        }
        return result;
    }

    private void backtrack(int first, ArrayList<Integer> curr, int[] nums) {
        if (curr.size() == k) {
            result.add(new ArrayList<>(curr));
            return;
        }

        for (int i = first; i < n; i++) {
            curr.add(nums[i]);
            backtrack(i + 1, curr, nums);
            curr.remove(curr.size() - 1);
        }
    }*/

    /*public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        result.add(new ArrayList<>());
        for (int num : nums) {
            int size = result.size();
            for (int i = 0; i < size; i++) {
                List<Integer> subset = new ArrayList<>(result.get(i));
                subset.add(num);
                result.add(subset);
            }
        }
        return result;
    }*/

    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(result, nums, 0, new ArrayList());
        return result;
    }

    private void backtrack(List<List<Integer>> result, int[] nums, int first, ArrayList arrayList) {
        result.add(new ArrayList<>(arrayList));
        for(int i = first; i< nums.length; i++) {
            arrayList.add(nums[i]);
            backtrack(result, nums, i + 1, arrayList);
            arrayList.remove(arrayList.size() - 1);
        }
    }
}
