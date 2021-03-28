package com.inani.vijay.hackerrank.counttriplets;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class Solution {

    // Complete the countTriplets function below.
    static long countTriplets(List<Long> arr, long r) {

        Map<Long, Long> map2 = new HashMap<>();
        Map<Long, Long> map3 = new HashMap<>();

        long count = 0;

        for (long current : arr) {
            if (map3.containsKey(current)) {
                count = count + map3.get(current);
            }

            if (map2.containsKey(current)) {
                if (!map3.containsKey(current * r)) {
                    map3.put(current * r, 0L);
                }
                map3.put(current * r, map3.get(current * r) + map2.get(current));
            }
            if (!map2.containsKey(current * r)) {
                map2.put(current * r, 0L);
            }
            map2.put(current * r, map2.get(current * r) + 1);
        }

        return count;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String[] nr = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int n = Integer.parseInt(nr[0]);

        long r = Long.parseLong(nr[1]);

        List<Long> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Long::parseLong)
                .collect(toList());

        long ans = countTriplets(arr, r);

        System.out.println(ans);

        bufferedReader.close();
    }
}
