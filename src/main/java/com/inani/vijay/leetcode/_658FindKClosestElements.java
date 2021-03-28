package com.inani.vijay.leetcode;

import java.util.ArrayList;
import java.util.List;

public class _658FindKClosestElements {

    public static void main(String[] args) {
        System.out.println(new _658FindKClosestElements().findClosestElements(new int[]{1, 2, 3, 4, 5}, 4, -1));
    }

    /*public List<Integer> findClosestElements(int[] arr, int k, int x) {
        List<Integer> nums = new ArrayList<>();
        for(int val:arr) {
            nums.add(val);

        }
        return findClosestElementsList(nums, k , x);
    }

    public List<Integer> findClosestElementsList(List<Integer> arr,  int k, int x) {
        Collections.sort(arr, (a, b) -> a == b ? a - b : Math.abs(a - x) - Math.abs(b - x));
        System.out.println(arr);
        arr = arr.subList(0,k);
        Collections.sort(arr);
        return arr;
    }*/


    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        int low = 0;
        int high = arr.length - 1;
        while (high - low >= k) {
            if (Math.abs(arr[low] - x) > Math.abs(arr[high] - x)) {
                low++;
            } else {
                high--;
            }
        }

        List<Integer> res = new ArrayList<>();
        for (int i = low; i <= high; i++) {
            res.add(arr[i]);
        }
        return res;
    }

    /*
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        int low = 0;
        int high = arr.length - k;
        while (low < high) {
            int mid = low + (high - low) / 2;
            if (x - arr[mid] > arr[mid + k] - x) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }
        return Arrays.stream(arr, low, low + k).boxed().collect(Collectors.toList());
    }
    */
}
