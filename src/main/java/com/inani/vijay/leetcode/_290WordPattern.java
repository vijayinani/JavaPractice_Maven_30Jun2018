package com.inani.vijay.leetcode;

import java.util.HashMap;
import java.util.Map;

public class _290WordPattern {

    public static void main(String[] args) {
        System.out.println(new _290WordPattern().wordPattern("abba", "dog cat cat dog"));
    }

    public boolean wordPattern(String pattern, String s) {
        Map<Character, String> characterStringMap = new HashMap<>();
        Map<String, Character> stringCharacterMap = new HashMap<>();

        String[] stringsSplit = s.split(" ");

        if (stringsSplit.length != pattern.length()) {
            return false;
        }

        for (int i = 0; i < pattern.length(); i++) {
            if (!characterStringMap.containsKey(pattern.charAt(i)) && !stringCharacterMap.containsKey(stringsSplit[i])) {
                characterStringMap.put(pattern.charAt(i), stringsSplit[i]);
                stringCharacterMap.put(stringsSplit[i], pattern.charAt(i));
            } else {
                if (!characterStringMap.containsKey(pattern.charAt(i))) {
                    characterStringMap.put(pattern.charAt(i), stringsSplit[i]);
                }
                if (!stringCharacterMap.containsKey(stringsSplit[i])) {
                    stringCharacterMap.put(stringsSplit[i], pattern.charAt(i));
                }

                if (!(characterStringMap.get(pattern.charAt(i)).equals(stringsSplit[i]) && stringCharacterMap.get(stringsSplit[i]).equals(pattern.charAt(i)))) {
                    return false;
                }
            }
        }
        return true;
    }
}

