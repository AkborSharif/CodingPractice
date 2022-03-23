package com.company.akbor.reviewDataStructure.hashTable;

public class HashTable {
    public class Node{
        private int value;
        private Node next;

        Node(int value){
            this.value = value;
        }
    }
    private int size;
    private Node[] array;
    HashTable(int size){
        this.size = size;
        this.array = new Node[size];

        for (int i = 0; i <array.length ; i++) {
            array[i] = null;
        }
    }

    public int hashFunction(int value){
        return value%this.size;
    }
    public void insert(int value){
        Node newNode = new Node(value);
        int index = hashFunction(value);
        newNode.next = array[index];
        array[index] = newNode;
    }

    public void display(){
        int i = 0;
        for (Node n:array) {
            Node curr = n;
            System.out.print(i+ ": ");
            while (curr!=null){
                System.out.print(curr.value+ "->");
                curr = curr.next;
            }
            i++;
            System.out.println("null");
        }
    }

    public boolean has(int value) {
        int index = hashFunction(value);
        Node curr = array[index];
        while (curr != null) {
            if (curr.value == value) {
                return true;
            }
            curr = curr.next;
        }
        return false;
    }


}
