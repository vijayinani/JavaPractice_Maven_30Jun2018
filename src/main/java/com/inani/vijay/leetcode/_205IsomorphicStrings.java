package com.inani.vijay.leetcode;

import java.util.HashMap;
import java.util.Map;

public class _205IsomorphicStrings {

    public static void main(String[] args) {
        // System.out.println(new _205IsomorphicStrings().isIsomorphic("paper", "title"));
        // System.out.println(new _205IsomorphicStrings().isIsomorphic("foo", "bar"));
        // System.out.println(new _205IsomorphicStrings().isIsomorphic("egg", "add"));
        System.out.println(new _205IsomorphicStrings().isIsomorphic("badc", "baba"));
    }

    public boolean isIsomorphic(String s, String t) {
        Map<Character, Character> sTot = new HashMap<>();
        Map<Character, Character> tTos = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);
            if (!sTot.containsKey(sChar) && !tTos.containsKey(tChar)) {
                sTot.put(sChar, tChar);
                tTos.put(tChar, sChar);
            } else {
                if (!sTot.containsKey(sChar)) {
                    sTot.put(sChar, tChar);
                }

                if (!tTos.containsKey(tChar)) {
                    tTos.put(tChar, sChar);
                }

                if (!(sTot.get(sChar) == tChar && tTos.get(tChar) == sChar)) {
                    return false;
                }
            }
        }
        return true;
    }
}
