package com.inani.vijay;

import com.inani.vijay.leetcode.TreeNode;

public class Findancestorsofagivennodeinabinarytree {

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

        findancestorsofagivennodeinabinarytree(node1, 1);
    }

    private static boolean findancestorsofagivennodeinabinarytree(TreeNode node, int k) {
        if (node == null) {
            return false;
        }

        if (node.val == k) {
            return true;
        }

        if (findancestorsofagivennodeinabinarytree(node.left, k) || findancestorsofagivennodeinabinarytree(node.right, k)) {
            System.out.println(node.val + " ");
            return true;
        }

        return false;
    }
}
