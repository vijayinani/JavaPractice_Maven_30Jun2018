package com.inani.vijay;

import java.util.ArrayList;
import java.util.List;

public class PrintAllPathsFromGivenSourceToDestination {

    public int v;
    List<Integer>[] paths;

    public PrintAllPathsFromGivenSourceToDestination(int v) {
        this.v = v;
        paths = new ArrayList[v];
    }

    public static void main(String[] args) {
        // Create a sample graph
        PrintAllPathsFromGivenSourceToDestination g = new PrintAllPathsFromGivenSourceToDestination(4);
        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(0, 3);
        g.addEdge(2, 0);
        g.addEdge(2, 1);
        g.addEdge(1, 3);

        // arbitrary source
        int s = 2;

        // arbitrary destination
        int d = 3;

        System.out.println(
                "Following are all different paths from "
                        + s + " to " + d);
        g.printAllPaths(s, d);
    }

    private void printAllPaths(int s, int d) {
        boolean[] visited = new boolean[v];
        List<Integer> pathsList = new ArrayList<>();
        pathsList.add(s);
        evaluate(s, d, visited, pathsList);

    }

    private void evaluate(int s, int d, boolean[] visited, List<Integer> pathsList) {
        if (s == d) {
            System.out.println(pathsList);
            return;
        }

        visited[s] = true;
        for (Integer x : paths[s]) {
            if (!visited[x]) {
                pathsList.add(x);
                evaluate(x, d, visited, pathsList);
                pathsList.remove(x);
            }
        }
        visited[s] = false;
    }

    private void addEdge(int start, int end) {
        if (paths[start] == null) {
            paths[start] = new ArrayList<>();
        }
        paths[start].add(end);
    }
}
