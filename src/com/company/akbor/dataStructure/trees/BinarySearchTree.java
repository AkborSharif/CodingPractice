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
public class BinarySearchTree extends Traversal {
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
            root = new Node(value);
        } else if (value <= root.value) {
            root.left = insert(root.left, value);
        } else {
            root.right = insert(root.right, value);
        }
        return root;
    }

    public int maxHeight(Node root) {
        if (root == null) {
            return 0;
        }
        int leftHeight = maxHeight(root.left);
        int rightHeight = maxHeight(root.right);

        return Math.max(leftHeight, rightHeight) + 1;
    }

    public int diameter(Node root) {
        if (root == null) {
            return 0;
        }
        int leftHeight = maxHeight(root.left);
        int rightHeight = maxHeight(root.right);
        int leftDiameter = diameter(root.left);
        int rightDiameter = diameter(root.right);

        return Math.max(1 + (leftHeight + rightHeight), Math.max(leftDiameter, rightDiameter));
    }

    public boolean balanced = true;

    public int getHeight(Node root) {
        if (root == null) {
            return 0;
        }
        int leftHeight = maxHeight(root.left);
        int rightHeight = maxHeight(root.right);
        if (Math.abs(leftHeight - rightHeight) > 1) {
            balanced = false;
        }
        return Math.max(leftHeight, rightHeight) + 1;
    }

    public boolean isBalanced(Node root) {
        getHeight(root);
        return balanced;
    }

}
