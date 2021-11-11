package com.inani.vijay;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

public class ArrayListForEachExample {

    public static void main(String[] args) {

        List<String> stocks = new ArrayList<>();
        stocks.add("Google");
        stocks.add("Apple");
        stocks.add("Microsoft");
        stocks.add("Facebook");

        // Consumer<Object> consumer = new com.inani.vijay.ArrayListForEachExample().new MyConsumer();

        Consumer<String> stringConsumer = new Consumer<String>() {

            @Override
            public void accept(String s) {
                System.out.println("Processed " + s);
            }
        };

        // stocks.forEach(consumer);
        stocks.forEach(stringConsumer);

        //lambda style
        stocks.forEach(x -> System.out.println("Processed " + x));

        List<String> strings = Collections.synchronizedList(stocks);
        strings.add("VIjay");

    }


    private static int sumIterator(List<Integer> list) {
        Iterator<Integer> it = list.iterator();
        int sum = 0;
        while (it.hasNext()) {
            int num = it.next();
            if (num > 10) {
                sum += num;
            }
        }

        int sum1 = list.stream().filter(x -> x > 10).mapToInt(i -> i).sum();

        return sum;
    }


    class MyConsumer implements Consumer<Object> {

        @Override
        public void accept(Object t) {
            System.out.println("Processing " + t);
        }

    }


}
