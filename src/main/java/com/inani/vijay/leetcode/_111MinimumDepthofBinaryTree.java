package com.inani.vijay.leetcode;

import java.util.LinkedList;
import java.util.Queue;

public class _111MinimumDepthofBinaryTree {



    public int minDepth(TreeNode root) {
        if(root == null) return 0;
        int depth = 1;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()) {
            depth++;
            int size = queue.size();
            while(size >= 0) {
                TreeNode node = queue.poll();
                if (node.left == null && node.right == null) {
                    return depth;
                }
                if (node.left != null) {
                    queue.offer(node.left);
                }
                if (node.right != null) {
                    queue.offer(node.right);
                }
                size--;
            }
        }
        return depth;
    }
}
