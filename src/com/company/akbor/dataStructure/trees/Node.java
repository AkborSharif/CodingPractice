package com.company.akbor.dataStructure.trees;

public class Node {
    protected int value;
    protected Node left;
    protected Node right;

    Node(int value) {
        this.value = value;
        this.left = null;
        this.right = null;
    }
}