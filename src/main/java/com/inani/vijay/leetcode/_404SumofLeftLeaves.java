package com.inani.vijay.leetcode;

import java.util.LinkedList;
import java.util.Queue;

public class _404SumofLeftLeaves {

    public int sumOfLeftLeaves(TreeNode root) {
        if (root == null) return 0;
        int sum = 0;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            if(node.left != null && node.left.left == null && node.left.right == null) {
                sum += node.left.val;
            }
            if(node.left != null) {
                queue.offer(node.left);
            }
            if(node.right != null) {
                queue.offer(node.right);
            }
        }
        return sum;
    }
}
