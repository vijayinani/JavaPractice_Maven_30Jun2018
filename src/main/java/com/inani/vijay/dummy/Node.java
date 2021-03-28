package com.inani.vijay.dummy;

public class Node {

    private int data;
    private Node left;
    private Node right;

    public Node(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }

    public void addNode(int num) {
        if (num < this.data) {
            if (this.left != null) {
                this.left.addNode(num);
            } else {
                this.left = new Node(num);
            }
        } else {
            if (this.right != null) {
                this.right.addNode(num);
            } else {
                this.right = new Node(num);
            }
        }
    }

    public Node searchValue(Node node, int num) {
        if (node == null || node.data == num) {
            return node;
        }

        if (num < node.data) {
            return searchValue(node.left, num);
        }

        return searchValue(node.right, num);
    }

    public void inOrderTraversal() {
        if (this.left != null) {
            this.left.inOrderTraversal();
        }
        System.out.print(this.data + " ");
        if (this.right != null) {
            this.right.inOrderTraversal();
        }
    }

    public void preOrderTraversal() {
        System.out.print(this.data + " ");
        if (this.left != null) {
            this.left.preOrderTraversal();
        }
        if (this.right != null) {
            this.right.preOrderTraversal();
        }
    }

    public void postOrderTraversal() {
        if (this.left != null) {
            this.left.postOrderTraversal();
        }
        if (this.right != null) {
            this.right.postOrderTraversal();
        }
        System.out.print(this.data + " ");
    }

    public Node delete(Node node, int num) {
        if (node == null) {
            return node;
        }

        if (num < node.data) {
            node.left = delete(node.left, num);
        } else if (num > node.data) {
            node.right = delete(node.right, num);
        } else {
            if (node.left == null) {
                return node.right;
            } else if (node.right == null) {
                return node.left;
            }
            node.data = minValue(node.right);
            node.right = delete(node.right, node.data);
        }
        return node;
    }

    int minValue(Node root) {
        int minv = root.data;
        while (root.left != null) {
            minv = root.left.data;
            root = root.left;
        }
        return minv;
    }

    @Override
    public String toString() {
        return String.valueOf(this.data);
    }
}
