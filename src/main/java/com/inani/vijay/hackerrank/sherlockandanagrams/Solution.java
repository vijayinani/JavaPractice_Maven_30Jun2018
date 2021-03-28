package com.inani.vijay.hackerrank.sherlockandanagrams;

import java.io.IOException;
import java.util.*;

public class Solution {

    private static final Scanner scanner = new Scanner(System.in);

    // Complete the sherlockAndAnagrams function below.
    static int sherlockAndAnagrams(String s) {

        int count = 0;

        Map<String, Set<Tuple2>> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j <= s.length(); j++) {
                String temp = s.substring(i, j);
                char[] chars = temp.toCharArray();
                Arrays.sort(chars);
                temp = String.valueOf(chars);
                if (!map.containsKey(temp)) {
                    map.put(temp, new HashSet<>());
                }
                map.get(temp).add(new Tuple2(i, j));
            }
        }

        for (String currentKey : map.keySet()) {
            int size = map.get(currentKey).size();
            if (size > 1) {
                count = count + (size * (size - 1)) / 2;
            }
        }

        return count;
    }

    public static void main(String[] args) throws IOException {

        int q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int qItr = 0; qItr < q; qItr++) {
            String s = scanner.nextLine();

            int result = sherlockAndAnagrams(s);

            System.out.println(result);
        }


        scanner.close();
    }

    public static class Tuple2 {
        int start;
        int end;

        public Tuple2(int start, int end) {
            this.start = start;
            this.end = end;
        }

        public Tuple2() {
        }

        @Override
        public String toString() {
            return "Tuple2{" +
                    "start=" + start +
                    ", end=" + end +
                    '}';
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Tuple2 tuple2 = (Tuple2) o;
            return start == tuple2.start &&
                    end == tuple2.end;
        }

        @Override
        public int hashCode() {
            return Objects.hash(start, end);
        }
    }
}
