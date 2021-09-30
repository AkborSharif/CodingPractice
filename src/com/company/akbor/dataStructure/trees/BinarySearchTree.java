package com.company.akbor.dataStructure.trees;

/*
A tree is a hierarchical structure where data is organized hierarchically and are linked together.
This structure is different from a linked list whereas, in a linked list,
items are linked in a linear order.
Various types of trees have been developed throughout the past decades,
in order to suit certain applications and meet certain constraints.
Some examples are binary search tree,
B tree, treap, red-black tree, splay tree, AVL tree and n-ary tree.
 */
public class BinarySearchTree {
    /*
     * A binary search tree (BST), as the name suggests,
     * is a binary tree where data is organized in a hierarchical structure.
     * This data structure stores values in sorted order.
     * Every node in a binary search tree comprises the following attributes.
     * 1. value: The value stored in the node.
     * 2. left: The pointer to the left child.
     * 3. right: The pointer to the right child.
     * 4. p: The pointer to the parent node
     * A binary search tree exhibits a unique property that distinguishes it from other trees.
     * This property is known as the binary-search-tree property.
     * Let x be a node in a binary search tree.
     * If y is a node in the left subtree of x, then y.value ≤ x.value
     * If y is a node in the right subtree of x, then y.value ≥ x.value
     * */
    public Node insert(Node root, int value) {
        if (root == null) {
            Node newNode = new Node(value);
            root = newNode;
        } else if (value <= root.value) {
            root.left = insert(root.left, value);
        } else {
            root.right = insert(root.right, value);
        }
        return root;
    }

    public void inOrder(Node root) {

        if (root != null) {
            inOrder(root.left);
            System.out.print(root.value + " ");
            inOrder(root.right);
        }
    }

    public void preOrder(Node root) {

        if (root != null) {
            System.out.print(root.value + " ");
            preOrder(root.left);
            preOrder(root.right);
        }
    }

    public void postOrder(Node root) {

        if (root != null) {
            postOrder(root.left);
            postOrder(root.right);
            System.out.print(root.value + " ");
        }
    }
}
