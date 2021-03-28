package com.inani.vijay.leetcode;

public class _653TwoSumIVInputisaBST {

    public boolean findTarget(TreeNode root, int k) {
        if (root == null) {
            return false;
        }
        return dfs(root, root, k);
    }

    private boolean dfs(TreeNode root, TreeNode curr, int k) {
        if (curr == null) return false;
        return search(root, curr, k - curr.val) || dfs(root, curr.left, k) || dfs(root, curr.right, k);
    }

    private boolean search(TreeNode root, TreeNode curr, int remaining) {
        if (root == null) {
            return false;
        }

        if (root != curr && root.val == remaining) {
            return true;
        }

        if (root.val > remaining) {
            return search(root.left, curr, remaining);
        } else {
            return search(root.right, curr, remaining);
        }
    }
}
