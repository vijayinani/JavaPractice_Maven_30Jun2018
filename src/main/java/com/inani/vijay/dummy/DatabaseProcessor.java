package com.inani.vijay.dummy;

import java.util.concurrent.Callable;
import java.util.concurrent.ThreadLocalRandom;

public class DatabaseProcessor implements Callable<Void> {

    private String databaseInfo;

    public DatabaseProcessor(String databaseInfo) {
        this.databaseInfo = databaseInfo;
    }

    @Override
    public Void call() throws Exception {
        System.out.println(String.format("START database operation : %s", databaseInfo));
        Thread.sleep(ThreadLocalRandom.current().nextInt(3000, 6000));
        System.out.println(String.format("COMPLETED database operation: %s", databaseInfo));
        return null;
    }
}
