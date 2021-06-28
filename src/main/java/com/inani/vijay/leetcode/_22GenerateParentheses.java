package com.inani.vijay.leetcode;

import java.util.ArrayList;
import java.util.List;

public class _22GenerateParentheses {

    public static void main(String[] args) {
        System.out.println(new _22GenerateParentheses().generateParenthesis(3));
    }

    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        backtrack(n, 0, 0, "", result);
        return result;
    }

    private void backtrack(int n, int start, int end, String str, List<String> result) {
        if (str.length() == n * 2) {
            result.add(str);
            // return;
        }

        if (start < n) {
            backtrack(n, start + 1, end, str + "(", result);
        }
        if(end < start) {
            backtrack(n, start, end + 1, str + ")", result);
        }
    }

}
