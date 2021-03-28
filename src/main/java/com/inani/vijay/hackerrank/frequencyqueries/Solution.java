package com.inani.vijay.hackerrank.frequencyqueries;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static java.util.stream.Collectors.joining;

public class Solution {

    // Complete the freqQuery function below.
    static List<Integer> freqQuery(List<int[]> queries) {

        List<Integer> result = new ArrayList<>();
        Map<Integer, Integer> intermediateResult = new HashMap<>();
        Map<Integer, Integer> counts = new HashMap<>();

        for (int[] integers : queries) {

            int value = integers[1];

            if (integers[0] == 1) {
                intermediateResult.putIfAbsent(value, 0);
                intermediateResult.put(value, intermediateResult.get(value) + 1);
                counts.putIfAbsent(intermediateResult.get(value), 0);
                counts.put(intermediateResult.get(value), counts.get(intermediateResult.get(value)) + 1);
                if (counts.containsKey(intermediateResult.get(value) - 1)) {
                    counts.put(intermediateResult.get(value) - 1, counts.get(intermediateResult.get(value) - 1) - 1);
                    if (counts.get(intermediateResult.get(value) - 1) == 0) {
                        counts.remove(intermediateResult.get(value) - 1);
                    }
                }

            } else if (integers[0] == 2) {
                if (intermediateResult.containsKey(value)) {
                    int decrementedValue = intermediateResult.get(value);
                    if (intermediateResult.get(value) == 1) {
                        intermediateResult.remove(value);
                    } else {
                        intermediateResult.put(value, intermediateResult.get(value) - 1);
                    }
                    if (counts.get(decrementedValue) == 1) {
                        counts.remove(decrementedValue);
                    } else {
                        counts.put(decrementedValue, counts.get(decrementedValue) - 1);
                    }
                    counts.putIfAbsent(decrementedValue - 1, 0);
                    counts.put(decrementedValue - 1, counts.get(decrementedValue - 1) + 1);
                }

            } else if (integers[0] == 3) {
                if (counts.containsKey(value)) {
                    result.add(1);
                } else {
                    result.add(0);
                }
            }
        }
        return result;
    }

    public static void main(String[] args) throws IOException {
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("input.txt"))) {
            int q = Integer.parseInt(bufferedReader.readLine().trim());
            List<int[]> queries = new ArrayList<>(q);
            Pattern p = Pattern.compile("^(\\d+)\\s+(\\d+)\\s*$");
            for (int i = 0; i < q; i++) {
                int[] query = new int[2];
                Matcher m = p.matcher(bufferedReader.readLine());
                if (m.matches()) {
                    query[0] = Integer.parseInt(m.group(1));
                    query[1] = Integer.parseInt(m.group(2));
                    queries.add(query);
                }
            }
            List<Integer> ans = freqQuery(queries);
            try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("output.txt"))) {
                bufferedWriter.write(
                        ans.stream()
                                .map(Object::toString)
                                .collect(joining("\n"))
                                + "\n");
            }
        }
    }
}