package com.inani.vijay.leetcode;

public class _110BalancedBinaryTree {
    boolean isBalanced = true;

    public static void main(String[] args) {
        TreeNode node1 = new TreeNode(1);
        TreeNode node2 = new TreeNode(2);
        TreeNode node3 = new TreeNode(3);
        TreeNode node4 = new TreeNode(4);
        TreeNode node5 = new TreeNode(5);
        TreeNode node6 = new TreeNode(6);
        node1.left = node2;
        node1.right = node3;
        node2.left = node4;
        node2.right = node5;
        node4.left = node6;

        System.out.println(new _110BalancedBinaryTree().isBalanced(node1));
    }

    public boolean isBalanced(TreeNode root) {
        if (root == null) return isBalanced;
        backtrack(root);
        return isBalanced;
    }

    private int backtrack(TreeNode root) {
        if(!isBalanced) {
            return Integer.MAX_VALUE;
        }
        if (root == null) return 0;
        int left = backtrack(root.left);
        int right = backtrack(root.right);
        if (Math.abs(left - right) > 1) isBalanced = false;
        return Math.max(left, right) + 1;
    }
}
