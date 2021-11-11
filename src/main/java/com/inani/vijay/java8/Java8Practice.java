package com.inani.vijay.java8;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Java8Practice {
    public static void main(String[] args) {
        /*
        Map<String, List<String>> people = new HashMap<>();
        people.put("John", Arrays.asList("555-1123", "555-3389"));
        people.put("Mary", Arrays.asList("555-2243", "555-5264"));
        people.put("Steve", Arrays.asList("555-6654", "555-3242"));

        List<String> phones = people.values().stream()
                //.flatMap(Collection::stream)
                .map(i -> {
                    String str = null;
                    for (String s : i) {
                        str = s;
                    }
                    return str;
                })
                .collect(Collectors.toList());

        System.out.println(phones);

         */

        /*
        Map<String, Integer> nameMap = new HashMap<>();
        nameMap.put("John", 10);
        Integer value = nameMap.computeIfAbsent("John1", s -> s.length());
        System.out.println(value);

         */

        /*
        Map<String, Integer> salaries = new HashMap<>();
        salaries.put("John", 40000);
        salaries.put("Freddy", 30000);
        salaries.put("Samuel", 50000);

        salaries.replaceAll((name, value) -> name.contains("Freddy") ? value : value + 10000);

        System.out.println(salaries);

         */

        /*
        List<String> names = Arrays.asList("Angela", "Aaron", "Bob", "Claire", "David");

        List<String> namesWithA = names.stream()
                .filter(name -> name.startsWith("A"))
                .collect(Collectors.toList());

         */

        Stream<String> streamEmpty = Stream.empty();
    }
}
