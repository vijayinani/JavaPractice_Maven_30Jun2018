package com.inani.vijay.thread;

public class Thread2 extends Thread{

    Table t;

    Thread2(Table t) {
        this.t = t;
    }

    @Override
    public void run() {
        t.printCount(8);
    }
}
