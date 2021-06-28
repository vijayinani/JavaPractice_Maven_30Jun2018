package com.inani.vijay.leetcode;

import java.util.HashMap;
import java.util.Map;

public class _337HouseRobberIII {

    /*public int rob(TreeNode root) {
        int[] result = helper(root);
        return Math.max(result[0], result[1]);
    }

    private int[] helper(TreeNode node) {
        if (node == null) {
            return new int[]{0, 0};
        }
        int[] left = helper(node.left);
        int[] right = helper(node.right);

        int rob = node.val + left[1] + right[1];
        int notRob = Math.max(left[0], left[1]) + Math.max(right[0], right[1]);

        return new int[]{rob, notRob};
    }*/

    Map<TreeNode, Integer> robResult = new HashMap<>();
    Map<TreeNode, Integer> notRobResult = new HashMap<>();

    public int rob(TreeNode root) {
        return helper(root, false);
    }

    private int helper(TreeNode node, boolean parentRobbed) {

        if (node == null) {
            return 0;
        }

        if (parentRobbed) {
            if (robResult.containsKey(node)) {
                return robResult.get(node);
            }
            int result = helper(node.left, false) + helper(node.right, false);
            robResult.put(node, result);
            return result;
        } else {
            if (notRobResult.containsKey(node)) {
                return notRobResult.get(node);
            }
            int rob = node.val + helper(node.left, true) + helper(node.right, true);
            int notRob = helper(node.left, false) + helper(node.right, false);
            int result = Math.max(rob, notRob);
            notRobResult.put(node, result);
            return result;
        }
    }
}
