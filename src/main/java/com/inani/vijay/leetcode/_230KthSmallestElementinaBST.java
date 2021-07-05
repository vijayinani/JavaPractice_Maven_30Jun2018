package com.inani.vijay.leetcode;

import java.util.Stack;

public class _230KthSmallestElementinaBST {

    /*
    //Recursive
    public int kthSmallest(TreeNode root, int k) {
        List<Integer> result = new ArrayList<>();
        inOrder(root, result);
        return result.get(k - 1);
    }

    private void inOrder(TreeNode node, List<Integer> result) {
        if (node != null) {
            inOrder(node.left, result);
            result.add(node.val);
            inOrder(node.right, result);
        }
    }
    */

    public int kthSmallest(TreeNode root, int k) {
        Stack<TreeNode> stack = new Stack<>();
        while (true) {
            while (root != null) {
                stack.push(root);
                root = root.left;
            }
            root = stack.pop();
            if (--k == 0) return root.val;
            root = root.right;
        }
    }
}
