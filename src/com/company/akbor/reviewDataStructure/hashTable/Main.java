package com.company.akbor.reviewDataStructure.hashTable;

public class Main {
    public static void main(String[] args) {
        HashTable h = new HashTable(4);
        h.insert(30);
        h.insert(30);
        h.insert(20);
        h.insert(63);
        h.insert(70);
        h.insert(1);
        h.insert(8);
        h.insert(1);
        h.insert(2);
        h.insert(42);

        h.display();

        System.out.println(h.has(42));
    }
}
