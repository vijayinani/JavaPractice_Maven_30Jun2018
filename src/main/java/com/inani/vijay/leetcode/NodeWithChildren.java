package com.inani.vijay.leetcode;

import java.util.List;

class NodeWithChildren {
    public int val;
    public List<NodeWithChildren> children;

    public NodeWithChildren() {}

    public NodeWithChildren(int _val) {
        val = _val;
    }

    public NodeWithChildren(int _val, List<NodeWithChildren> _children) {
        val = _val;
        children = _children;
    }
};