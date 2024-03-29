package com.company.akbor.dataStructure.linkedList;

public class LinkedList {
    /*A linked list is a sequential structure that consists of a sequence of items in
    linear order which are linked to each other.
    Hence, you have to access data sequentially and random access is not possible.
    Linked lists provide a simple and flexible representation of dynamic sets.
    */
    
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

    public void addLast(int value) {
        Node newNode = new Node(value);
        if (first == null) {
            first = newNode;
        } else {
            last.next = newNode;
        }
        last = newNode;
    }

    public void addFirst(int value) {
        Node newNode = new Node(value);
        if (first == null) {
            last = newNode;
        } else {
            newNode.next = first;
        }
        first = newNode;
    }

    public void deleteFirst() {
        if (first != null) {
            first = first.next;
        }
    }

    public void deleteLast() {
        if (first != null) {
            Node curr = first;
            while (curr.next.next != null) {
                curr = curr.next;
            }
            last = curr;
            last.next = null;
        }
    }

    public boolean contains(int value) {
        Node curr = first;
        while (curr != null) {
            if (curr.value == value) {
                return true;
            }
            curr = curr.next;
        }
        return false;
    }

    public int indexOf(int value) {
        int index = 0;
        Node curr = first;
        while (curr != null) {
            if (curr.value == value) {
                return index;
            } else {
                index++;
            }
            curr = curr.next;
        }
        return -1;
    }


}
