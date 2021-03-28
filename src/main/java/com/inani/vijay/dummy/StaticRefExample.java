package com.inani.vijay.dummy;

import java.util.Collections;
import java.util.List;

public class StaticRefExample {
    public static void main(String[] args) {
        DataService dataService = new DataService();
        List<String> listOfUserNames = dataService.getAllUserNames();
        System.out.println("Users list: " + listOfUserNames);
        Collections.sort(listOfUserNames, StaticRefExample::compare);
        System.out.println("Sorted users list: " + listOfUserNames);
    }

    private static int compare(String a, String b) {
        return getLastName(a).compareTo(getLastName(b));
    }

    private static String getLastName(String name) {
        int i = name.indexOf(" ");
        return i != -1 ? name.substring(i + 1) : name;
    }
}
