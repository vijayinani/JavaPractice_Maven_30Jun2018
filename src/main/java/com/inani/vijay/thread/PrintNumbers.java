package com.inani.vijay.thread;

public class PrintNumbers implements Runnable {

    public static final int NO_OF_THREADS = 3;
    public static final int MAX_DIGIT = 20;
    public static final String THREAD_NAME_PREFIX = "t";

    volatile int current = 1;
    private Object lock = new Object();

    public static void main(String[] args) {
        PrintNumbers printNumbers = new PrintNumbers();
        for (int i = 1; i <= NO_OF_THREADS; i++) {
            new Thread(printNumbers, THREAD_NAME_PREFIX + i).start();
        }
    }

    @Override
    public void run() {
        String printThread;
        while (current <= MAX_DIGIT) {
            synchronized (lock) {
                if (current % NO_OF_THREADS != 0) {
                    printThread = THREAD_NAME_PREFIX + current % NO_OF_THREADS;
                } else {
                    printThread = THREAD_NAME_PREFIX + NO_OF_THREADS;
                }

                if (!printThread.equals(Thread.currentThread().getName())) {
                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

                if (printThread.equals(Thread.currentThread().getName())) {
                    System.out.println(String.format("Thread %s : %s", Thread.currentThread().getName(), current));
                    current = current + 1;
                }

                lock.notifyAll();
            }
        }
    }
}