package com.inani.vijay.leetcode;

import java.util.ArrayList;
import java.util.List;

public class _797AllPathsFromSourcetoTarget {
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> currPath = new ArrayList<>();
        currPath.add(0);
        findPath(graph, 0, currPath, result);
        return result;
    }

    private void findPath(int[][] graph, int node, List<Integer> currPath, List<List<Integer>> result) {
        if (node == graph.length - 1) {
            result.add(new ArrayList<>(currPath));
            return;
        }

        for (int i : graph[node]) {
            currPath.add(i);
            findPath(graph, i, currPath, result);
            currPath.remove(currPath.size() - 1);
        }
    }
}
