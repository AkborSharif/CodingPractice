package com.company.akbor.dataStructure.stack;

public class Stack {
    /*
     *A stack is a LIFO (Last In First Out — the element placed at last can be
     * accessed at first) structure which can be commonly found in many
     * programming languages. This structure is named as “stack” because it
     * resembles a real-world stack — a stack of plates.
     * */
    public class Node {
        private int value;
        private Node next;

        Node(int value) {
            this.value = value;
        }
    }

    private Node first;
    private Node last;

    public void display() {
        if (first != null) {
            Node curr = first;
            while (curr != null) {
                System.out.print(curr.value + "->");
                curr = curr.next;
            }
            System.out.println("null");
        } else {
            System.out.println("No element inserted");
        }
    }

    public void push(int value) {
        Node newNode = new Node(value);
        if (first == null) {
            first = newNode;
            last = newNode;
        } else {
            last.next = newNode;
            last = newNode;
        }
    }

    public void pop() {
        if (first != null) {
            Node curr = first;
            while (curr.next.next != null) {
                curr = curr.next;
            }
            last = curr;
            last.next = null;
        }
    }

    public int peek() {
        if (first != null) {
            return first.value;
        }
        return -1;
    }

    public boolean isEmpty() {
        return first == null;
    }

}
