package com.inani.vijay.dummy;

import java.util.Iterator;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.*;

public class ExecutorSynchronization {

    private static Queue<String> downloadQueue = new ConcurrentLinkedQueue();
    private static Queue<String> processorQueue = new ConcurrentLinkedQueue();
    private static Queue<String> databaseDumpQueue = new ConcurrentLinkedQueue();
    
    private static List<Future<String>> downloadList = new CopyOnWriteArrayList<>();
    private static List<Future<String>> processorList = new CopyOnWriteArrayList<>();

    public static void main(String[] args) throws ExecutionException, InterruptedException {

        new Thread(() -> queueFileToDownload()).start();
        new Thread(() -> addToProcessorQueue()).start();
        new Thread(() -> addToDatabaseDumpQueue()).start();

        new Thread(() -> downloaderService()).start();
        new Thread(() -> processorService()).start();
        new Thread(() -> databaseDumpService()).start();
    }

    private static void addToProcessorQueue() {
        addToNextWorkflowQueue(downloadList, processorQueue);
    }

    private static void addToDatabaseDumpQueue() {
        addToNextWorkflowQueue(processorList, databaseDumpQueue);
    }

    private static void addToNextWorkflowQueue(List<Future<String>> list, Queue<String> queue) {
        while (true) {
            Iterator<Future<String>> iterator = list.iterator();
            while (iterator.hasNext()) {
                Future<String> next = iterator.next();
                if (next.isDone()) {
                    try {
                        queue.offer(next.get());
                        list.remove(next);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    } catch (ExecutionException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }

    private static void databaseDumpService() {
        ExecutorService databaseExecutorService = Executors.newFixedThreadPool(3);
        String databaseInfo = null;
        while (true) {
            databaseInfo = databaseDumpQueue.poll();
            if (databaseInfo != null) {
                databaseExecutorService.submit(new DatabaseProcessor(databaseInfo));
            }
        }
    }

    private static void processorService() {
        ExecutorService processorExecutorService = Executors.newFixedThreadPool(3);
        String fileToProcess = null;
        while (true) {
            fileToProcess = processorQueue.poll();
            if (fileToProcess != null) {
                processorList.add(processorExecutorService.submit(new FileProcessor(fileToProcess)));

            }
        }
    }

    private static void downloaderService() {
        ExecutorService downloaderExecutorService = Executors.newFixedThreadPool(3);
        String fileToDownload = null;
        while (true) {
            fileToDownload = downloadQueue.poll();
            if (fileToDownload != null) {
                downloadList.add(downloaderExecutorService.submit(new FileDownloader(fileToDownload)));
            }
        }
    }

    private static void queueFileToDownload() {

        int count = 0;
        while (count < 5) {
            String fileName = String.valueOf(System.currentTimeMillis());
            try {
                Thread.sleep(ThreadLocalRandom.current().nextInt(3000, 6000));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(String.format("ADDED %s to the downloadQueue for downloading", fileName));
            downloadQueue.offer(fileName);
            count++;
        }
    }
}
