package com.inani.vijay.hackerrank.arrayreduction;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution {
    public static void main(String[] args) throws IOException {
//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
//
//        int numCount = Integer.parseInt(bufferedReader.readLine().trim());
//
//        List<String> numTemp = new ArrayList<>();
//
//        IntStream.range(0, numCount).forEach(i -> {
//            try {
//                numTemp.add(bufferedReader.readLine().replaceAll("\\s+$", ""));
//            } catch (IOException ex) {
//                throw new RuntimeException(ex);
//            }
//        });
//
//        List<Integer> num = numTemp.stream()
//                .map(String::trim)
//                .map(Integer::parseInt)
//                .collect(toList());
//
//        int res = reductionCost(num);
//
//        bufferedWriter.write(String.valueOf(res));
//        bufferedWriter.newLine();
//
//        bufferedReader.close();
//        bufferedWriter.close();

        List<Integer> num = new ArrayList<>();
        num.add(1);
        num.add(2);
        num.add(3);
        num.add(4);
        int res = reductionCost(num);
        System.out.println(res);
    }

    // Complete the reductionCost function below.
    static int reductionCost(List<Integer> num) {
        Collections.sort(num);
        int result = 0;
        while (num.size() > 1) {
            int currentTotal = num.get(0) + num.get(1);
            result = result + currentTotal;
            num.add(currentTotal);
            num.remove(1);
            num.remove(0);
            Collections.sort(num);
        }
        return result;
    }
}