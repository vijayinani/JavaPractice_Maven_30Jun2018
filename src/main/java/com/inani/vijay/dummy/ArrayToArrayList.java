package com.inani.vijay.dummy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayToArrayList {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        String[] elements = {"one", "two", "three"};
        List<String> strings = new ArrayList<>(Arrays.asList(elements));
        strings.add("new");
        strings.set(1, "new");
        System.out.println(strings);

    }
}
