package com.inani.vijay.dummy;

public class Demo {
    public static void main(String[] args) {

        MyInterface myInterface = new MyInterface() {
            @Override
            public int getValue(String str) {
                return 0;
            }
        };

        System.out.println(myInterface.getValue("str"));
    }
}
