package com.inani.vijay.thread;

public class SubMethodDemo {

    public static void main(String[] args) {
        try {
            SubMethodDemo subMethodDemo = new SubMethodDemo();
            subMethodDemo.method1();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }

    public synchronized void method1() {
        method2();
    }

    private synchronized void method2() {
        method1();
    }
}
