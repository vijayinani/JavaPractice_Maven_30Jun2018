package com.inani.vijay.dummy;

public class ClassLoaderTest {
    public static void main(String[] args) {
        System.out.println(String.class.getClassLoader());
        System.out.println();
        System.out.println(ClassLoaderTest.class.getClassLoader());
    }
}
