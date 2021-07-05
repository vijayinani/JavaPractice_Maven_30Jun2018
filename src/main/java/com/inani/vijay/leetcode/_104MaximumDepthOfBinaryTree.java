package com.inani.vijay.leetcode;

import java.util.LinkedList;
import java.util.Queue;

public class _104MaximumDepthOfBinaryTree {

    /*
    //Recursive
    public int maxDepth(TreeNode root) {
        if (root == null) return 0;
        int max = 1;
        max = 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
        return max;
    }
    */

    //Iterative
    public int maxDepth(TreeNode root) {
        if (root == null) return 0;
        int max = 0;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            int size = queue.size();
            max++;
            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();
                if (node.left != null) {
                    queue.offer(node.left);
                }
                if (node.right != null) {
                    queue.offer(node.right);
                }
            }
        }
        return max;
    }
}
