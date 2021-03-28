package com.inani.vijay.dummy;

public class TernaryOperatorTest {
    public static void main(String[] args) {
        String value = getValue() ? "first" : "second";
        System.out.println(value);

        Object obj = new String("str");
        int x = 10;
        System.out.println(obj instanceof String);
        System.out.println((Integer) x instanceof Integer);
        System.out.println(obj instanceof Object);
    }
    
    private static boolean getValue() {
        return true;
    }
}
