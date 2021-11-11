package com.inani.vijay.leetcode;

import java.util.LinkedList;
import java.util.Queue;

public class _965UnivaluedBinaryTree {
    public boolean isUnivalTree(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            if (node != null) {
                if (node.left != null && node.val != node.left.val) {
                    return false;
                }
                if (node.right != null && node.val != node.right.val) {
                    return false;
                }
                if (node.left != null) {
                    queue.offer(node.left);
                }
                if (node.right != null) {
                    queue.offer(node.right);
                }
            }
        }
        return true;
    }
}
