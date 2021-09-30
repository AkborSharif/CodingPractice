package com.company.akbor.dataStructure.trees;

public class Main {
    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();
        Node tree = null;

        tree = bst.insert(tree, 5);
        tree = bst.insert(tree, 3);
        tree = bst.insert(tree, 8);
        tree = bst.insert(tree, 1);
        tree = bst.insert(tree, 6);
        tree = bst.insert(tree, 4);
        tree = bst.insert(tree, 7);

        System.out.print("in-order: ");
        bst.inOrder(tree);
        System.out.println();
        System.out.print("pre-order: ");
        bst.preOrder(tree);
        System.out.println();
        System.out.print("post-order: ");
        bst.postOrder(tree);
    }
}