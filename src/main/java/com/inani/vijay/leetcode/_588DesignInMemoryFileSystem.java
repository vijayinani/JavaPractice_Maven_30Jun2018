package com.inani.vijay.leetcode;

import java.util.*;

public class _588DesignInMemoryFileSystem {

    File root;

    public _588DesignInMemoryFileSystem() {
        root = new File();
    }

    class File {
        boolean isFile = false;
        Map<String, File> files = new HashMap<>();
        String content = "";
    }

    public List<String> ls(String path) {
        File t = root;
        List<String> files = new ArrayList<>();
        if (!path.equals("/")) {
            String[] d = path.split("/");
            for (int i = 1; i < d.length; i++) {
                t = t.files.get(d[i]);
            }
            if (t.isFile) {
                files.add(d[d.length - 1]);
                return files;
            }
        }
        List<String> result = new ArrayList<>(t.files.keySet());
        Collections.sort(result);
        return result;
    }

    public void mkdir(String path) {
        File t = root;
        String[] d = path.split("/");
        for (int i = 1; i < d.length; i++) {
            if (!t.files.containsKey(d[i])) {
                t.files.put(d[i], new File());
            }
            t = t.files.get(d[i]);
        }
    }

    public String readContentFromFile(String filePath) {
        File t = root;
        String[] d = filePath.split("/");
        for (int i = 1; i < d.length - 1; i++) {
            t = t.files.get(d[i]);
        }
        return t.files.get(d[d.length - 1]).content;
    }

    public void addContentToFile(String filePath, String content) {
        File t = root;
        String[] d = filePath.split("/");
        for (int i = 1; i < d.length - 1; i++) {
            t = t.files.get(d[i]);
        }

        if (!t.files.containsKey(d[d.length - 1])) {
            t.files.put(d[d.length - 1], new File());
        }

        t = t.files.get(d[d.length - 1]);
        t.isFile = true;
        t.content = t.content + content;
    }
}
