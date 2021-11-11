package com.inani.vijay.leetcode;

import java.util.HashMap;
import java.util.Map;

public class _146LRUCache {

    class LRUCache {

        class Node {
            Node next;
            Node prev;
            int key;
            int value;

            Node(int key, int value) {
                this.key = key;
                this.value = value;
            }
        }

        int capacity;
        Map<Integer, Node> cacheMap = new HashMap<>();

        Node head = new Node(0, 0);
        Node tail = new Node(0, 0);

        public LRUCache(int capacity) {
            this.capacity = capacity;
            head.next = tail;
            tail.prev = head;
        }

        public int get(int key) {
            if (cacheMap.containsKey(key)) {
                Node node = cacheMap.get(key);
                remove(node);
                insert(node);
                return node.value;
            } else {
                return -1;
            }
        }

        public void put(int key, int value) {
            if (cacheMap.containsKey(key)) {
                remove(cacheMap.get(key));
            }

            if (cacheMap.size() == capacity) {
                remove(tail.prev);
            }

            insert(new Node(key, value));
        }

        private void insert(Node node) {
            cacheMap.put(node.key, node);
            Node headNext = head.next;
            head.next = node;
            node.prev = head;
            headNext.prev = node;
            node.next = headNext;
        }

        private void remove(Node node) {
            cacheMap.remove(node.key);
            node.prev.next = node.next;
            node.next.prev = node.prev;
        }
    }

    /**
     * Your LRUCache object will be instantiated and called as such:
     * LRUCache obj = new LRUCache(capacity);
     * int param_1 = obj.get(key);
     * obj.put(key,value);
     */
}
