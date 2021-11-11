package com.inani.vijay.leetcode;

import java.util.ArrayList;
import java.util.List;

public class _897IncreasingOrderSearchTree {
    public TreeNode increasingBST(TreeNode root) {
        List<Integer> values = new ArrayList<>();
        inOrder(root, values);
        TreeNode dummy = new TreeNode(0);
        TreeNode curr = dummy;

        for(int val: values) {
            TreeNode node = new TreeNode(val);
            curr.right = node;
            curr = curr.right;
        }

        return dummy.right;
    }

    private void inOrder(TreeNode node, List<Integer> values) {
        if(node == null) {
            return;
        }

        inOrder(node.left, values);
        values.add(node.val);
        inOrder(node.right, values);
    }
}
