package com.inani.vijay.completablefuture;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CompletableFutureDemo {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        CompletableFutureDemo completableFutureDemo = new CompletableFutureDemo();
        System.out.println(completableFutureDemo.calculate(100).get());

        CompletableFuture<Void> hello_runnable = CompletableFuture.runAsync(new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello Runnable");
            }
        });
        System.out.println(hello_runnable.get());
    }

    public Future<String> calculate(int num) {
        CompletableFuture<String> completableFuture = new CompletableFuture();
        Executors.newCachedThreadPool().submit(() -> {
            completableFuture.complete("Hello");
        });
        return completableFuture;
    }
}
