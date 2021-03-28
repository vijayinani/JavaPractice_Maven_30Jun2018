package com.inani.vijay.leetcode;

import java.util.ArrayList;
import java.util.List;

public class GenerateParentheses {

    public static void main(String[] args) {
        System.out.println(new GenerateParentheses().generateParenthesis(3));
    }

    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<>();
        backtrack(res, 0, 0, "", n);
        return res;
    }

    private void backtrack(List<String> res, int open, int close, String str, int max) {
        if (str.length() == max * 2) {
            res.add(str);
        }

        if (open < max) {
            backtrack(res, open + 1, close, str + "(", max);
        }
        if (close < open) {
            backtrack(res, open, close + 1, str + ")", max);
        }
    }
}
