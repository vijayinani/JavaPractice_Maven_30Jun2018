package com.inani.vijay.leetcode;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class _145BinaryTreePostorderTraversal {
    /*
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        postOrder(root, result);
        return result;
    }

    private void postOrder(TreeNode curr, List<Integer> result) {
        if (curr != null) {
            postOrder(curr.left, result);
            postOrder(curr.right, result);
            result.add(curr.val);
        }
    }

    */

    public List<Integer> postorderTraversal(TreeNode root) {
        LinkedList<Integer> result = new LinkedList<>();
        Stack<TreeNode> stack = new Stack<>();
        while (!stack.isEmpty() || root != null) {
            if (root != null) {
                stack.push(root);
                result.addFirst(root.val);
                root = root.right;
            } else {
                TreeNode node = stack.pop();
                node = node.left;
            }
        }
        return result;
    }
}
