package com.inani.vijay.leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class _990SatisfiabilityofEqualityEquations {


    public static void main(String[] args) {
        System.out.println(new _990SatisfiabilityofEqualityEquations().equationsPossible(new String[]{"a==b", "a==c"}));
    }

    public boolean equationsPossible(String[] equations) {
        List<Integer>[] characterList = new ArrayList[26];
        for (int i = 0; i < characterList.length; i++) {
            characterList[i] = new ArrayList<>();
        }

        for (String eq : equations) {
            if (eq.charAt(1) == '=') {
                int x = eq.charAt(0) - 'a';
                int y = eq.charAt(3) - 'a';

                characterList[x].add(y);
                characterList[y].add(x);
            }
        }

        int[] colors = new int[26];

        int currColor = 0;
        for (int i = 0; i < characterList.length; i++) {
            if (colors[i] == 0) {
                currColor++;
                Stack<Integer> stack = new Stack<>();
                stack.push(i);
                while (!stack.isEmpty()) {
                    int node = stack.pop();
                    for (int val : characterList[node]) {
                        if (colors[val] == 0) {
                            colors[val] = currColor;
                            stack.push(val);
                        }
                    }
                }
            }
        }

        for (String eq : equations) {
            if (eq.charAt(1) == '!') {
                int x = eq.charAt(0) - 'a';
                int y = eq.charAt(3) - 'a';

                if (x == y || colors[x] != 0 && colors[x] == colors[y]) {
                    return false;
                }
            }
        }

        return true;
    }


}
