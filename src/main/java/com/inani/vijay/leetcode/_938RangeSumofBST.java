package com.inani.vijay.leetcode;

import java.util.Stack;

public class _938RangeSumofBST {
    public int rangeSumBST(TreeNode root, int low, int high) {
        int sum = 0;
        Stack<TreeNode> treeNodes = new Stack<>();
        treeNodes.push(root);
        while (!treeNodes.isEmpty()) {
            TreeNode pop = treeNodes.pop();
            if(pop == null) {
                return 0;
            }
            if(pop.val > low) {
                treeNodes.push(pop.left);
            }
            if(pop.val < high) {
                treeNodes.push(pop.right);
            }
            if(pop.val >= low && pop.val <= high) {
                sum += pop.val;
            }
        }
        return sum;
    }
}
