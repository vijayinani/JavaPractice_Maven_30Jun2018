package com.inani.vijay;

import java.lang.ref.WeakReference;

class Gfg {
    public void print(int x) {
        System.out.println("x");
    }
}

public class WeakReferenceExample {

    public static void main(String[] args) {
        Gfg g = new Gfg();
        WeakReference<Gfg> weakReference = new WeakReference<>(g);
        g.print(10);
        g = null;
        g = weakReference.get();
        System.gc();
        g.print(10);
    }

}
