package com.inani.vijay.thread;

public class Table {
    synchronized void printCount(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.println(i + " " + Thread.currentThread().getName());
        }
        try {
            Thread.sleep(4000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
