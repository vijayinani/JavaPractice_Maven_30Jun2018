package com.inani.vijay.leetcode;

import com.inani.vijay.Node;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class _429NaryTreeLevelOrderTraversal {
    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null) return result;
        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            List<Integer> currLevel = new ArrayList<>();
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                Node curr = queue.poll();
                currLevel.add(curr.val);
                for (Node c : curr.children) {
                    queue.offer(c);
                }
            }
            result.add(currLevel);
        }
        return result;
    }
}
