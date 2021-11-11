package com.inani.vijay.thread;

public class Thread1 extends Thread{

    private Table t;

    Thread1 (Table t) {
        this.t = t;
    }
    @Override
    public void run() {
        t.printCount(10);
    }
}
