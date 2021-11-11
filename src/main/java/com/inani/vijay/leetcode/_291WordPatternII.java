package com.inani.vijay.leetcode;

import java.util.HashMap;
import java.util.Map;

public class _291WordPatternII {

    Map<Character, String> pMap = new HashMap<>();
    Map<String, Character> sMap = new HashMap<>();

    public static void main(String[] args) {
        System.out.println(new _291WordPatternII().wordPatternMatch("abab", "redblueredblue"));
    }

    public boolean wordPatternMatch(String pattern, String s) {

        return dfs(pattern, 0, s, 0, pMap, sMap);
    }

    private boolean dfs(String pattern, int i, String s, int j, Map<Character, String> pMap, Map<String, Character> sMap) {
        if (i == pattern.length() && j == s.length()) return true;
        if (i == pattern.length() || j == s.length()) return false;

        char c = pattern.charAt(i);
        boolean insert = false;

        for (int k = j; k < s.length(); k++) {
            String str = s.substring(j, k + 1);
            System.out.println(str);
            if (pMap.containsKey(c) && pMap.get(c) != str) continue;
            if (sMap.containsKey(str) && sMap.get(str) != c) continue;
            if (!pMap.containsKey(c) && !sMap.containsKey(str)) {
                pMap.put(c, str);
                sMap.put(str, c);
                insert = true;
            }
            if (dfs(pattern, i + 1, s, k + 1, pMap, sMap)) return true;

            if (insert) {
                pMap.remove(c);
                sMap.remove(str);
            }
        }
        return false;
    }
}
