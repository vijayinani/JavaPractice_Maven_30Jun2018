package com.inani.vijay.dummy;

import java.util.concurrent.Callable;
import java.util.concurrent.ThreadLocalRandom;

public class FileDownloader implements Callable<String> {

    private String fileToDownload;

    public FileDownloader(String fileToDownload) {
        this.fileToDownload = fileToDownload;
    }

    @Override
    public String call() throws Exception {
        System.out.println(String.format("START Downloading file: %s", fileToDownload));
        Thread.sleep(ThreadLocalRandom.current().nextInt(3000, 6000));
        System.out.println(String.format("COMPLETED Downloading file: %s", fileToDownload));
        return fileToDownload;
    }
}
