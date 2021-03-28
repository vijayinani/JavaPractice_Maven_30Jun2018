package com.inani.vijay.dummy;

public class EffectivelyFinalLambdaExample {
    public static void main(String[] args) {
        String x = "value1";
        Runnable r = () -> System.out.println(x);
        //x = "value2"; // This is now effectively final
    }
}
