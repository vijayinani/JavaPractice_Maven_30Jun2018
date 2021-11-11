package com.inani.vijay.leetcode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class _705DesignHashSet {

    class MyHashSet {

        List<List<Integer>> myHashSet = null;
        public int BUCKETS = 100;

        /**
         * Initialize your data structure here.
         */
        public MyHashSet() {
            myHashSet = new ArrayList<>(BUCKETS);
            for (int i = 0; i < BUCKETS; i++) {
                myHashSet.add(null);
            }
        }

        public void add(int key) {
            int bucket = key % BUCKETS;
                if(myHashSet.get(bucket) == null) {
                myHashSet.set(bucket, new LinkedList<>());
            }
            if(!myHashSet.get(bucket).contains(key)) {
                myHashSet.get(bucket).add(key);
            }
        }

        public void remove(int key) {
            int bucket = key % BUCKETS;
            if(myHashSet.get(bucket) != null && myHashSet.get(bucket).contains(key)) {
                myHashSet.get(bucket).remove(Integer.valueOf(key));
            }
        }

        /**
         * Returns true if this set contains the specified element
         */
        public boolean contains(int key) {
            int bucket = key % BUCKETS;
            return myHashSet.get(bucket) != null && myHashSet.get(bucket).contains(key);
        }
    }

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */
}
