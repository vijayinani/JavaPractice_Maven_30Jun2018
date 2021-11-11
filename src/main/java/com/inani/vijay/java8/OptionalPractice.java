package com.inani.vijay.java8;

import java.util.Optional;

public class OptionalPractice {
    public static void main(String[] args) {
        String name = null;
        String finalName = Optional.ofNullable(name).orElseGet(() -> "Vijay");
        System.out.println(finalName);
    }
}
