package com.inani.vijay.leetcode;

import java.util.ArrayList;
import java.util.List;

public class PalindromePartitioning_131 {

    public static void main(String[] args) {
        System.out.println(new PalindromePartitioning_131().partition("aab"));
    }

    public List<List<String>> partition(String s) {
        List<List<String>> result = new ArrayList<>();
        backtrack(result, s, new ArrayList<>(), 0);
        return result;
    }

    private void backtrack(List<List<String>> result, String s, ArrayList<String> tempList, int start) {
        if (s.length() == start) {
            result.add(new ArrayList<>(tempList));
        } else {
            for (int i = start; i < s.length(); i++) {
                if (isPalindrome(s, start, i)) {
                    tempList.add(s.substring(start, i + 1));
                    backtrack(result, s, tempList, i + 1);
                    tempList.remove(tempList.size() - 1);
                }
            }
        }
    }

    private boolean isPalindrome(String s, int low, int high) {
        while (low < high) {
            if (s.charAt(low++) != s.charAt(high--)) return false;
        }
        return true;
    }


}
