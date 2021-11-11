package com.inani.vijay.leetcode;

import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public class _460LFUCache {
    class LFUCache {

        int capacity;
        int min = -1;
        Map<Integer, Integer> keyToVal;
        Map<Integer, Integer> keyToCount;
        Map<Integer, Set<Integer>> countToKeys;

        public LFUCache(int capacity) {
            this.capacity = capacity;
            keyToVal = new HashMap<>();
            keyToCount = new HashMap<>();
            countToKeys = new HashMap<>();
        }

        public int get(int key) {
            if (!keyToVal.containsKey(key)) {
                return -1;
            }

            int count = keyToCount.get(key);
            countToKeys.get(count).remove(key);
            if (count == min && countToKeys.get(count).size() == 0) {
                min++;
            }
            putToCount(key, count + 1);
            return keyToVal.get(key);
        }

        public void put(int key, int value) {
            if (capacity <= 0) {
                return;
            }

            if (keyToVal.containsKey(key)) {
                keyToVal.put(key, value);
                get(key);
                return;
            }

            if (keyToVal.size() >= capacity) {
                evict(countToKeys.get(min).iterator().next());
            }

            min = 1;
            putToCount(key, min);
            keyToVal.put(key, value);
        }

        private void putToCount(int key, int count) {
            keyToCount.put(key, count);
            if (!countToKeys.containsKey(count)) {
                countToKeys.put(count, new LinkedHashSet<>());
            }
            countToKeys.get(count).add(key);
        }

        private void evict(Integer key) {
            countToKeys.get(min).remove(key);
            keyToVal.remove(key);
        }
    }

/**
 * Your LFUCache object will be instantiated and called as such:
 * LFUCache obj = new LFUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */
}
