package com.inani.vijay.leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class _94BinaryTreeInorderTraversal {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList();
        inOrder(root, result);
        return result;
    }

    private void inOrder(TreeNode root, List<Integer> result) {
        if (root == null) return;
        inOrder(root.left, result);
        result.add(root.val);
        inOrder(root.right, result);
    }

    public List<Integer> inOrderTraversalIterative(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        Stack<TreeNode> nodes = new Stack<>();
        TreeNode curr = root;
        while (curr != null || !nodes.isEmpty()) {
            while (curr != null) {
                nodes.add(curr);
                curr = curr.left;
            }
            curr = nodes.pop();
            result.add(curr.val);
            curr = curr.right;
        }
        return result;
    }

}
