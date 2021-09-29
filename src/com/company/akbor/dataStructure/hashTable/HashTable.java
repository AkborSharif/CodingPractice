package com.company.akbor.dataStructure.hashTable;
    /*
    Hash Table
    is a data structure that stores values which have keys associated with each of them.
    Furthermore, it supports lookup efficiently if we know the key associated with the value.
    Hence it is very efficient in inserting and searching, irrespective of the size of the data.

    Direct Addressing
    uses the one-to-one mapping between the values and keys when storing in a table.
    However, there is a problem with this approach when there is a large number of key-value pairs.
    The table will be huge with so many records and may be impractical or even impossible to be stored,
    given the memory available on a typical computer.
    To avoid this issue we use hash tables.

    Hash Function
    A special function named as the hash function (h) is used to overcome the aforementioned problem in direct addressing.

    In direct accessing, a value with key k is stored in the slot k. Using the hash function,
    we calculate the index of the table (slot) to which each value goes.
    The value calculated using the hash function for a given key is called the hash value which indicates the index of the table to which the value is mapped.
    h(k) = k % m
    h: Hash function
    k: Key of which the hash value should be determined
    m: Size of the hash table (number of slots available). A prime value that is not close to an exact power of 2 is a good choice for m.
    */

class HashTable {
    public class Node {
        int data;
        Node next;

        public Node(int value) {
            this.data = value;
            this.next = null;
        }
    }

    private int size;
    private Node[] array;

    public HashTable(int size) {
        this.size = size;
        this.array = new Node[size];
        for (int i = 0; i < size; i++) {
            array[i] = null;
        }
    }

    public int hashFunction(int value) {
        return value % size;
    }

    public void insert(int value) {
        int index = hashFunction(value);
        //System.out.println(index);
        Node newNode = new Node(value);
        newNode.next = array[index];
        array[index] = newNode;
    }

    public void display() {
        int i = 0;
        for (Node n : array) {
            System.out.print(i + " : ");
            while (n != null) {
                System.out.print(n.data + "->");
                n = n.next;
            }
            System.out.print("null");
            System.out.println();
            i++;
        }

    }

    public boolean has(int value) {
        int index = hashFunction(value);
        Node curr = array[index];
        while (curr != null) {
            if (curr.data == value) {
                return true;
            }
            curr = curr.next;
        }
        return false;
    }
}




