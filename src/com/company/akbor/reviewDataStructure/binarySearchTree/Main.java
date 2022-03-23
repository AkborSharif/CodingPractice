package com.company.akbor.reviewDataStructure.binarySearchTree;

public class Main {
    public static void main(String[] args) {
        binarySearchTree bst = new binarySearchTree();

        binarySearchTree.Node root = bst.insert(null, 10);
        root =  bst.insert(root, 5);
        root = bst.insert(root,  11);
        root = bst.insert(root, 20);
        root = bst.insert(root, 9);
        root = bst.insert(root, 5);
        root = bst.insert(root, 4);

        System.out.print("InOrder: ");
        bst.inOrder(root);
        System.out.println();
        System.out.print("PreOrder: ");
        bst.preOrder(root);
        System.out.println();
        System.out.print("PostOrder: ");
        bst.postOrder(root);
        System.out.println();
        System.out.print("DFS: ");
        bst.DFS(root);
        System.out.print("BFS: ");
        bst.BFS(root);
        System.out.println();

        System.out.println("MaxHeight: "+ bst.maxHeight(root));
        System.out.println("Diameter: "+ bst.diameter(root));
    }
}
