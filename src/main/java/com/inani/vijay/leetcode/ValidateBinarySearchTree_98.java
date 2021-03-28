package com.inani.vijay.leetcode;

public class ValidateBinarySearchTree_98 {

    /*
    TreeNode prev;
    boolean isValidBST = true;
    */

    Integer prev;

    public static void main(String[] args) {
        /*TreeNode root = createBinarySearchTree(new int[]{2, 1, 3});
        System.out.println(new ValidateBinarySearchTree_98().isValidBST(root));
         */
        TreeNode node1 = new TreeNode(1);
        TreeNode node3 = new TreeNode(3);
        TreeNode node2 = new TreeNode(2, node1, node3);
        TreeNode node4 = new TreeNode(4, node2, null);
        TreeNode node8 = new TreeNode(8);
        TreeNode node10 = new TreeNode(10);
        TreeNode node9 = new TreeNode(9, node8, node10);
        TreeNode node6 = new TreeNode(6, null, node9);
        TreeNode node5 = new TreeNode(5, node4, node6);
        TreeNode root = node5;

        System.out.println(new ValidateBinarySearchTree_98().isValidBST(root));
    }

    /*
    private static TreeNode createBinarySearchTree(int[] values) {
         return TreeNode.insertLevelOrder(values, new TreeNode(), 0);
    }
    */

    //Approach 1: Recursive Traversal with Valid Range
    /*
    private boolean validate(TreeNode root, Integer low, Integer high) {
        if (root == null) return true;

        if ((low != null && root.val <= low) || (high != null && root.val >= high))
            return false;

        return (validate(root.left, low, root.val) && validate(root.right, root.val, high));
    }

    public boolean isValidBST(TreeNode root) {
        return validate(root, null, null);
    }

     */

    public boolean isValidBST(TreeNode root) {
        prev = null;
        return inorder(root);
    }

    private boolean inorder(TreeNode root) {
        if (root == null) {
            return true;
        }
        if (!inorder(root.left)) {
            return false;
        }
        if (prev != null && root.val <= prev) {
            return false;
        }
        prev = root.val;
        return inorder(root.right);
    }
}
