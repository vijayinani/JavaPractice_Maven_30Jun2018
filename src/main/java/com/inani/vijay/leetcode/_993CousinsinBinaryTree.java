package com.inani.vijay.leetcode;

import java.util.LinkedList;
import java.util.Queue;

public class _993CousinsinBinaryTree {
    public boolean isCousins(TreeNode root, int x, int y) {
        if (root == null) return false;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            boolean isXExist = false;
            boolean isYExist = false;
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();
                if (node.val == x) isXExist = true;
                if (node.val == y) isYExist = true;
                if (node.left != null && node.right != null) {
                    if (node.left.val == x && node.right.val == y) {
                        return false;
                    }
                    if (node.left.val == y && node.right.val == x) {
                        return false;
                    }
                }
                if (node.left != null) {
                    queue.offer(node.left);
                }
                if (node.right != null) {
                    queue.offer(node.right);
                }
            }
            if (isXExist && isYExist) return true;
        }
        return false;
    }
}
