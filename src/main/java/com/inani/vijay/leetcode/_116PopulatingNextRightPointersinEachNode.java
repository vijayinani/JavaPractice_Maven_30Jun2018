package com.inani.vijay.leetcode;

class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {
    }

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
}

public class _116PopulatingNextRightPointersinEachNode {
    public Node connect(Node root) {
        helper(root, null);
        return root;
    }

    private void helper(Node curr, Node next) {
        if (curr == null) {
            return;
        }
        curr.next = next;
        helper(curr.left, curr.right);
        helper(curr.right, curr.next == null ? null : curr.next.left);
    }
}

