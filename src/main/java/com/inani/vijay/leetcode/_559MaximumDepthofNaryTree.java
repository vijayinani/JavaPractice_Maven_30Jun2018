package com.inani.vijay.leetcode;

import com.inani.vijay.Node;

import java.util.LinkedList;
import java.util.Queue;

public class _559MaximumDepthofNaryTree {

    public int maxDepth(Node root) {
        if (root == null) {
            return 0;
        }

        int maxDepth = 0;
        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                Node node = queue.poll();
                for (Node c : node.children) {
                    queue.offer(c);
                }
            }
            maxDepth++;
        }
        return maxDepth;
    }
}
