package com.company.akbor.dataStructure.hashTable;

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

        System.out.println("HashTable has 42 ? " + h.has(42));
        System.out.println("HashTable has 0 ? " + h.has(0));
        System.out.println();

        System.out.println("HashTable:");
        h.display();
        System.out.println();



        System.out.println("HashTable Delete Node:");
        h.delete(42);
        h.display();
        System.out.println();
        h.delete(30);
        h.display();
        System.out.println();
        h.delete(30);
        h.display();
        System.out.println();
        h.delete(2);
        h.display();
        System.out.println();
        h.delete(0);
        System.out.println();
        h.display();
    }
}
