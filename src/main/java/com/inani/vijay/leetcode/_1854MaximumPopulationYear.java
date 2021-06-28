package com.inani.vijay.leetcode;

public class _1854MaximumPopulationYear {

    public static void main(String[] args) {
        System.out.println(new _1854MaximumPopulationYear().maximumPopulation(new int[][]{{1950, 1961}, {1960, 1971}, {1970, 1981}}));
    }

    public int maximumPopulation(int[][] logs) {
        int[] population = new int[2051];
        int res = 0;
        for (int[] current : logs) {
            ++population[current[0]];
            --population[current[1]];
        }
        for (int i = 1950; i <= 2050; i++) {
            population[i] += population[i - 1];
            res = population[i] > population[res] ? i : res;
        }
        return res;
    }
}
