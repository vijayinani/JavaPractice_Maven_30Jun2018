
package com.inani.vijay.leetcode;
public class _1283FindtheSmallestDivisorGivenaThreshold {

    public static void main(String[] args) {
        System.out.println(new _1283FindtheSmallestDivisorGivenaThreshold().smallestDivisor(new int[]{1,2,5,9}, 6));
    }

    /*public int smallestDivisor(int[] nums, int threshold) {
        int i = 1;
        while (true) {
            int sum = 0;
            for (int currVal : nums) {
                sum += currVal / i;
                if (currVal % i != 0) {
                    sum += 1;
                }
                if (sum > threshold) {
                    break;
                }
            }
            if (sum <= threshold) {
                return i;
            }
            i++;
        }
    }*/

    /*public int smallestDivisor(int[] nums, int threshold) {
        int min = 1;
        int max = 100000;
        while (min < max) {
            int mid = (min + max) / 2;
            int sum = 0;
            for (int currVal : nums) {
                sum += (currVal + mid - 1) / mid;
                if (sum > threshold) break;
            }
            if (sum > threshold) {
                min = mid + 1;
            } else {
                max = mid;
            }
        }
        return min;
    }*/

    public int smallestDivisor(int[] nums, int threshold) {
        int min =  1;
        int max = 1000000;
        while(min < max) {
            int mid = min + (max - min) / 2;
            int sum = 0;
            for(int i: nums) {
                sum += i / mid;
                if (i % mid != 0) {
                    sum += 1;
                }
                if(sum > threshold) {
                    break;
                }
            }
            if(sum > threshold) {
                min = mid + 1 ;
            } else {
                max = mid;
            }
        }
        return min;
    }
}
