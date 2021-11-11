package com.inani.vijay.leetcode;

public class _169MajorityElement {

    // Boyer Moore Voting Algorithm

    public int majorityElement(int[] nums) {

        int count = 0;
        Integer majority = null;

        for(int i = 0; i < nums.length; i++) {
            if(count == 0) {
                majority = nums[i];
            }

            if(majority == nums[i]) {
                count++;
            } else {
                count--;
            }
        }

        return majority;
    }
}
