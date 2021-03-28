package com.inani.vijay.dummy;

public class BinaryTreeDemo {

    private static Node node = null;

    public static void main(String[] args) {
        int[] nums = {15, 200, 25, -5, 0, 100, 20, 12, 126, 1000, -150};
        node = new Node(20);
        for (int currentNum : nums) {
            node.addNode(currentNum);
        }
        node.inOrderTraversal();
        System.out.println();
        node.preOrderTraversal();
        System.out.println();
        node.postOrderTraversal();

        System.out.println();
        System.out.println(null == node.searchValue(node, 121) ? "Not found" : "Found");
        System.out.println(null == node.searchValue(node, 25) ? "Not found" : "Found");
        System.out.println(null == node.searchValue(node, 12) ? "Not found" : "Found");
        System.out.println(null == node.searchValue(node, 1000) ? "Not found" : "Found");
        System.out.println(null == node.searchValue(node, 126) ? "Not found" : "Found");
        System.out.println(null == node.searchValue(node, 20) ? "Not found" : "Found");
        System.out.println(null == node.searchValue(node, 99) ? "Not found" : "Found");

//        node = node.delete(node, 99);
//        node.inOrderTraversal();
//        System.out.println();
//        node = node.delete(node, 99);
//        node.inOrderTraversal();
//        System.out.println();
        node = node.delete(node, 126);
        node.inOrderTraversal();
        System.out.println();
        node = node.delete(node, -150);
        node.inOrderTraversal();
        System.out.println();
        node = node.delete(node, 0);
        node.inOrderTraversal();
        System.out.println();
        node = node.delete(node, 200);
        node.inOrderTraversal();
        System.out.println();
        node = node.delete(node, 20);
        node.inOrderTraversal();
        System.out.println();
    }
}
