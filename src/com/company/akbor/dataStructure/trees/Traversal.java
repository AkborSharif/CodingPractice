package com.company.akbor.dataStructure.trees;

import java.util.ArrayList;
import java.util.LinkedList;

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
        LinkedList<Node> stack = new LinkedList<>();
        ArrayList<Integer> list = new ArrayList<>();
        while (true) {
            if (root != null) {
                stack.add(root);
                root = root.left;
            } else {
                if (stack.isEmpty()) {
                    break;
                }
                root = stack.pollLast();
                list.add(root.value);
                root = root.right;
            }
        }
        System.out.println(list);
    }

    public void preOrderIterative(Node root) {
        LinkedList<Node> stack = new LinkedList<>();
        LinkedList<Integer> list = new LinkedList<>();
        stack.add(root);

        while (!stack.isEmpty()) {
            Node node = stack.pollLast();
            list.addLast(node.value);
            if (node.right != null) {
                stack.add(node.right);
            }
            if (node.left != null) {
                stack.add(node.left);
            }

        }
        System.out.println(list);

    }

    public void postOrderIterative(Node root) {
        LinkedList<Node> stack = new LinkedList<>();
        LinkedList<Integer> list = new LinkedList<>();
        stack.add(root);

        while (!stack.isEmpty()) {
            Node node = stack.pollLast();
            list.addFirst(node.value);
            if (node.left != null) {
                stack.add(node.left);
            }
            if (node.right != null) {
                stack.add(node.right);
            }

        }
        System.out.println(list);
    }

    public void depthFirstSearch(Node root) {
        //preorder and depth first search are the same
        LinkedList<Node> stack = new LinkedList<>();
        LinkedList<Integer> list = new LinkedList<>();
        stack.add(root);

        while (!stack.isEmpty()) {
            Node node = stack.pollLast();
            list.addLast(node.value);
            if (node.right != null) {
                stack.add(node.right);
            }
            if (node.left != null) {
                stack.add(node.left);
            }

        }
        System.out.println(list);
    }

    public void breathFirstSearch(Node root) {
        LinkedList<Node> queue = new LinkedList<>();
        LinkedList<Integer> list = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            Node node = queue.poll();
            list.add(node.value);
            if (node.left != null) {
                queue.add(node.left);
            }
            if (node.right != null) {
                queue.add(node.right);
            }
        }
        System.out.println(list);
    }
}
