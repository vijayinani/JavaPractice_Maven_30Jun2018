package com.inani.vijay.leetcode;

import java.util.PriorityQueue;
import java.util.Queue;

public class _703KthLargestElementinaStream {

    public static void main(String[] args) {
        KthLargest kthLargest = new _703KthLargestElementinaStream().new KthLargest(3, new int[]{4, 5, 8, 2});
        System.out.println(kthLargest.add(3));
        System.out.println(kthLargest.add(5));
        System.out.println(kthLargest.add(10));
        System.out.println(kthLargest.add(9));
        System.out.println(kthLargest.add(4));
    }

    public class KthLargest {

        private int k;
        private Queue<Integer> queue;

        public KthLargest(int k, int[] nums) {
            queue = new PriorityQueue<>(k);
            this.k = k;
            for (int n : nums) {
                add(n);
            }
        }

        public int add(int val) {
            queue.offer(val);
            if(queue.size() > k) {
                queue.poll();
            }
            return queue.peek();
        }
    }

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */

}
