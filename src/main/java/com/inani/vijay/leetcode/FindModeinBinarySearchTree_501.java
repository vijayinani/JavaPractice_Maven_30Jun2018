package com.inani.vijay.leetcode;

import java.util.ArrayList;
import java.util.List;

public class FindModeinBinarySearchTree_501 {

    TreeNode prev;
    int count = 0;
    int maxCount = -1;
    List<Integer> modes = new ArrayList();

    public int[] findMode(TreeNode root) {
        prev = root;
        inorder(root);
        int[] result = new int[modes.size()];
        int i = 0;
        for (int mode : modes) {
            result[i] = mode;
            i++;
        }
        return result;
    }

    private void inorder(TreeNode curr) {
        if (curr == null) return;
        inorder(curr.left);
        count = prev.val == curr.val ? count + 1 : 1;
        if (count == maxCount) {
            modes.add(curr.val);
        } else if (count > maxCount) {
            modes.clear();
            modes.add(curr.val);
            maxCount = count;
        }
        prev = curr;
        inorder(curr.right);
    }
}
