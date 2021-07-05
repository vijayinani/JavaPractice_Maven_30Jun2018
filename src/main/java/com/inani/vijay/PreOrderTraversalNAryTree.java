package com.inani.vijay;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class PreOrderTraversalNAryTree {

    public List<Integer> preorder(Node root) {
        List<Integer> result = new ArrayList<>();
        traverseIterative(root, result);
        traverseRecursive(root, result);
        return result;
    }

    private void traverseIterative(Node root, List<Integer> result) {
        Stack<Node> stack = new Stack<>();
        stack.push(root);
        while (!stack.isEmpty()) {
            Node curr = stack.pop();
            result.add(curr.val);
            for (int i = curr.children.size() - 1; i >= 0; i--) {
                stack.push(curr.children.get(i));
            }
        }
    }

    private void traverseRecursive(Node p, List<Integer> result) {
        if (p != null) {
            result.add(p.val);
            for (Node child : p.children) {
                traverseRecursive(child, result);
            }
        }
    }
}
