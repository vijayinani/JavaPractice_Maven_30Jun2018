package com.inani.vijay.dummy;

import java.io.Serializable;

public final class MySingleton implements Serializable, Cloneable {

    private static volatile MySingleton INSTANCE = null;

    private MySingleton() {
    }

    public static final MySingleton getInstance() {
        if (INSTANCE == null) {
            synchronized (MySingleton.class) {
                if (INSTANCE == null) {
                    INSTANCE = new MySingleton();
                }
            }
        }
        return INSTANCE;
    }

    public final Object readResolve() {
        return getInstance();
    }

    @Override
    protected Object clone() {
        return getInstance();
    }
}
