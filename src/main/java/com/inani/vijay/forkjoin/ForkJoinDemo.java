package com.inani.vijay.forkjoin;

import java.util.concurrent.*;

public class ForkJoinDemo {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService forkJoinPool = new ForkJoinPool();
        ForkJoinTask<Integer> result = ((ForkJoinPool) forkJoinPool).submit(new Calculator(4));
        System.out.println(result.get());
    }
}

class Calculator extends RecursiveTask<Integer> {

    private int x;

    public Calculator(int x) {
        this.x = x;
    }

    @Override
    protected Integer compute() {
        if (x <= 1) {
            return x;
        }

        Calculator calculator = new Calculator(x - 1);
        calculator.fork();

        return x * x + calculator.join();
    }
}
