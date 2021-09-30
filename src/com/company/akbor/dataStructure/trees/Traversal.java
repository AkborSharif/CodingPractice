package com.company.akbor.dataStructure.trees;

public class Traversal {
    public void inOrderRecursive(Node root) {

        if (root != null) {
            inOrderRecursive(root.left);
            System.out.print(root.value + " ");
            inOrderRecursive(root.right);
        }
    }

    public void preOrderRecursive(Node root) {

        if (root != null) {
            System.out.print(root.value + " ");
            preOrderRecursive(root.left);
            preOrderRecursive(root.right);
        }
    }

    public void postOrderRecursive(Node root) {

        if (root != null) {
            postOrderRecursive(root.left);
            postOrderRecursive(root.right);
            System.out.print(root.value + " ");
        }
    }

    public void inOrderIterative(Node root) {

    }

    public void preOrderIterative(Node root) {

    }

    public void postOrderIterative(Node root) {

    }
}
