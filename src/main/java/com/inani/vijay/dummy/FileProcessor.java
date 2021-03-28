package com.inani.vijay.dummy;

import java.util.concurrent.Callable;
import java.util.concurrent.ThreadLocalRandom;

public class FileProcessor implements Callable<String> {

    private String fileToProcess;

    public FileProcessor(String fileToProcess) {
        this.fileToProcess = fileToProcess;
    }

    @Override
    public String call() throws Exception {
        System.out.println(String.format("START processing file: %s", fileToProcess));
        Thread.sleep(ThreadLocalRandom.current().nextInt(3000, 6000));
        System.out.println(String.format("COMPLETED processing file: %s", fileToProcess));
        return fileToProcess;
    }
}
