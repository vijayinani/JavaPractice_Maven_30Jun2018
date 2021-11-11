package com.inani.vijay.leetcode;

import java.util.LinkedList;
import java.util.Queue;

public class _919CompleteBinaryTreeInserter {

    /**
     * Definition for a binary tree node.
     * public class TreeNode {
     * int val;
     * TreeNode left;
     * TreeNode right;
     * TreeNode() {}
     * TreeNode(int val) { this.val = val; }
     * TreeNode(int val, TreeNode left, TreeNode right) {
     * this.val = val;
     * this.left = left;
     * this.right = right;
     * }
     * }
     */
    class CBTInserter {

        private TreeNode root;

        public CBTInserter(TreeNode root) {
            this.root = root;
        }

        public int insert(int v) {
            Queue<TreeNode> queue = new LinkedList<>();
            queue.offer(this.root);
            while (true) {
                TreeNode node = queue.poll();
                if (node.right != null) {
                    queue.offer(node.left);
                    queue.offer(node.right);
                } else {
                    if (node.left == null) {
                        node.left = new TreeNode(v);
                    } else {
                        node.right = new TreeNode(v);
                    }
                    return node.val;
                }
            }
        }

        public TreeNode get_root() {
            return this.root;
        }
    }

/**
 * Your CBTInserter object will be instantiated and called as such:
 * CBTInserter obj = new CBTInserter(root);
 * int param_1 = obj.insert(v);
 * TreeNode param_2 = obj.get_root();
 */
}
