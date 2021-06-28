package com.inani.vijay.leetcode;

public class _1598CrawlerLogFolder {

    public static void main(String[] args) {
        System.out.println(new _1598CrawlerLogFolder().minOperations(new String[]{"d1/", "d2/", "./", "d3/", "../", "d31/"}));
    }


    public int minOperations(String[] logs) {
        int level = 0;
        for (String currentLog : logs) {
            if (currentLog.contains("..")) {
                if (level > 0) {
                    level--;
                }
            } else if (currentLog.contains(".")) {
                continue;
            } else {
                level++;
            }
        }
        return level;
    }
}
