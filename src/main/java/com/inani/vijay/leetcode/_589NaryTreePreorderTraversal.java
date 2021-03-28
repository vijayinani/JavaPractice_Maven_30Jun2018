package com.inani.vijay.leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class _589NaryTreePreorderTraversal {
    /*
    public List<Integer> preorder(Node root) {
        List<Integer> result = new ArrayList();
        traverse(root, result);
        return result;
    }

    public void traverse(Node p, List<Integer> result) {
        if(p!= null) {
        result.add(p.val);
        for(Node child: p.children) {
            traverse(child, result);
        }
        }
    }
    */

    public List<Integer> preorder(NodeWithChildren root) {
        List<Integer> result = new ArrayList();
        Stack<NodeWithChildren> stack = new Stack();
        if (root == null) return result;
        stack.push(root);
        while (!stack.isEmpty()) {
            NodeWithChildren curr = stack.pop();
            result.add(curr.val);
            for (int i = curr.children.size() - 1; i >= 0; i--) {
                stack.push(curr.children.get(i));
            }
        }
        return result;
    }
}
