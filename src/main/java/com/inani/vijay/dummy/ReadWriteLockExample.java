package com.inani.vijay.dummy;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class ReadWriteLockExample {

    Map<String, String> map = new HashMap<>();
    ReadWriteLock readWriteLock = new ReentrantReadWriteLock();
    Lock writeLock = readWriteLock.writeLock();
    Lock readLock = readWriteLock.readLock();

    public static void main(String[] args) {
        ReadWriteLockExample example = new ReadWriteLockExample();
        example.put("vijay", "inani");
        example.put("vijay2", "inani");
        example.remove("vijay2");
        System.out.println(example.containsKey("vijay"));
        System.out.println(example.get("vijay"));
    }

    public void put(String key, String value) {
        try {
            writeLock.lock();
            map.put(key, value);
        } finally {
            writeLock.unlock();
        }
    }

    public String remove(String key) {
        try {
            writeLock.lock();
            return map.remove(key);
        } finally {
            writeLock.unlock();
        }
    }

    public String get(String key) {
        try {
            readLock.lock();
            return map.get(key);
        } finally {
            readLock.unlock();
        }
    }

    public boolean containsKey(String key) {
        try {
            readLock.lock();
            return map.containsKey(key);
        } finally {
            readLock.unlock();
        }
    }
}
