package com.inani.vijay.leetcode;

public class FindTheDuplicateNumber_287 {

    public static void main(String[] args) {
        System.out.println(new FindTheDuplicateNumber_287().findDuplicate(new int[]{1, 3, 4, 2, 2, 5, 6}));
    }

    // Sorting
    /*
    public int findDuplicate(int[] nums) {
        Arrays.sort(nums);
        for (int i = 1; i < nums.length; i++) {
            if (nums[i - 1] == nums[i]) {
                return nums[i];
            }
        }
        return -1;
    }
    */

    //Set
    /*
    public int findDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int num:nums) {
            if(set.contains(num)) {
                return num;
            }
            set.add(num);
        }
        return -1;
    }*/

    public int findDuplicate(int[] nums) {
        int slow = nums[0];
        int fast = nums[nums[0]];
        while (slow != fast) {
            slow = nums[slow];
            fast = nums[nums[fast]];
        }
        fast = 0;
        while (slow != fast) {
            slow = nums[slow];
            fast = nums[fast];
        }
        return slow;
    }

}
