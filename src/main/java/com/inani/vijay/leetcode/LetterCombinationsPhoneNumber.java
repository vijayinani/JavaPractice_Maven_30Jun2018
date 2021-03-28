package com.inani.vijay.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LetterCombinationsPhoneNumber {

    public static void main(String[] args) {
        System.out.println(new LetterCombinationsPhoneNumber().letterCombinations("234"));
    }

/*    public List<String> letterCombinations(String digits) {

        if(digits == null || digits.length() == 0) return new LinkedList<>();

        String[] intToString = {"0", "1", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};

        LinkedList<String> ans = new LinkedList<>();
        ans.add("");

        while (ans.peek().length() != digits.length()) {
            String s = ans.remove();
            for (char c : intToString[Character.getNumericValue(digits.charAt(s.length()))].toCharArray()) {
                ans.add(s + c);
            }
        }
        return ans;
    }*/

    Map<Integer, String> map = new HashMap<>();

    public List<String> letterCombinations(String digits) {

        StringBuilder sb = new StringBuilder();
        List<String> result = new ArrayList<>();

        map.put(2, "abc");
        map.put(3, "def");
        map.put(4, "ghi");
        map.put(5, "jkl");
        map.put(6, "mno");
        map.put(7, "pqrs");
        map.put(8, "tuv");
        map.put(9, "wxyz");
        dfs(digits, 0, sb, result);
        return result;
    }

    private void dfs(String digits, int i, StringBuilder sb, List<String> result) {
        if (i == digits.length()) {
            result.add(sb.toString());
            return;
        }

        String letters = map.get(digits.charAt(i) - 48);
        for (int j = 0; j < letters.length(); j++) {
            sb.append(letters.charAt(j));
            dfs(digits, i + 1, sb, result);
            sb.deleteCharAt(sb.length() - 1);
        }
    }


}
