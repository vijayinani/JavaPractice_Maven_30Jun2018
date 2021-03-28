package com.inani.vijay.leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class _144BinaryTreePreorderTraversal {

    /*private void preOrder(TreeNode root, List<Integer> result) {
        if(root != null) {
            result.add(root.val);
            preOrder(root.left, result);
            preOrder(root.right, result);
        }
    }*/

    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        Stack<TreeNode> rights = new Stack<>();
        while (root != null) {
            result.add(root.val);
            if (root.right != null) {
                rights.push(root.right);
            }
            root = root.left;
            if (root == null && !rights.isEmpty()) {
                root = rights.pop();
            }
        }
        return result;
    }
}
