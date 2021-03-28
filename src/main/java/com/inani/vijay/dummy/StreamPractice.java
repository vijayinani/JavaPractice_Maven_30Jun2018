package com.inani.vijay.dummy;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamPractice {
    public static void main(String[] args) {
        List<String> myList = new ArrayList<>();
        myList.add("Vijay1");
        myList.add("Vijay2");
        myList.add("Vijay3");
        myList.add("Vijay4");
        myList.add("Vijay5");
        System.out.println(myList);
        Stream<String> stream = myList.stream();
        myList.add("Vijay6");
        myList.add("Vijay7");
        System.out.println(stream.count());
        myList.add("Vijay8");
        myList.add("Vijay9");
        //System.out.println(stream.count());
        System.out.println(myList);
    }
}

