package com.inani.vijay.dummy;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapExample {
    public static void main(String[] args) {
        Map<String, String> stringStringMap = new ConcurrentHashMap<>();
        System.out.println(stringStringMap);
        stringStringMap.put("one", "one");
        stringStringMap.put("one", "one");
        stringStringMap.put("one", "one");
        System.out.println(stringStringMap);
        Set<Map.Entry<String, String>> entries = stringStringMap.entrySet();
        for (Map.Entry entry : entries) {
            entry.setValue("three");
        }
        Iterator<Map.Entry<String, String>> iterator = stringStringMap.entrySet().iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next().getKey());
        }
        System.out.println(stringStringMap);
    }
}
