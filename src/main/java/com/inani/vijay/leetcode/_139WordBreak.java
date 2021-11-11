package com.inani.vijay.leetcode;

import java.util.*;

public class _139WordBreak {

    public static void main(String[] args) {
        System.out.println(new _139WordBreak().wordBreak("leetcode", Arrays.asList(new String[]{"leet", "code"})));
    }

    public boolean wordBreak(String s, List<String> wordDict) {
        Set<String> dict = new HashSet<>(wordDict);

        return evaluate(s, dict);
    }

    private boolean evaluate(String s, Set<String> dict) {

        if (s.length() == 0) {
            return true;
        }

        for (int i = 1; i <= s.length(); i++) {
            if (dict.contains(s.substring(0, i)) && evaluate(s.substring(i), dict)) {
                return true;
            }
        }
        return false;
    }
}

