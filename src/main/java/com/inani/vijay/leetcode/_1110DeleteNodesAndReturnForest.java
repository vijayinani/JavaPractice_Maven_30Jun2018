package com.inani.vijay.leetcode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class _1110DeleteNodesAndReturnForest {
    public List<TreeNode> delNodes(TreeNode root, int[] to_delete) {
        List<TreeNode> result = new ArrayList<>();
        Set<Integer> deleteSet = new HashSet<>();
        for (int val : to_delete) {
            deleteSet.add(val);
        }
        TreeNode node = deleteNode(root, deleteSet, result);
        if (node != null) {
            result.add(root);
        }
        return result;
    }

    private TreeNode deleteNode(TreeNode node, Set<Integer> deleteSet, List<TreeNode> result) {
        if (node == null) {
            return null;
        }

        node.left = deleteNode(node.left, deleteSet, result);
        node.right = deleteNode(node.right, deleteSet, result);

        if (deleteSet.contains(node.val)) {
            if (node.left != null) {
                result.add(node.left);
            }
            if (node.right != null) {
                result.add(node.right);
            }
            return null;
        }

        return node;
    }
}
