package com.inani.vijay.dummy;

import java.util.HashMap;

class Entry {
    int value;
    int key;
    Entry left;
    Entry right;
}

public class LRUCache {
    HashMap<Integer, Entry> hashMap = new HashMap<>();
    Entry start, end;
    int CACHE_SIZE = 4;
}
