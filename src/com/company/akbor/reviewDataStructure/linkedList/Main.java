package com.company.akbor.reviewDataStructure.linkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.print();

        list.addFirst(0);
        list.addFirst(-1);
        list.print();

        list.remove();
        list.print();

        list.removeFirst();
        list.removeFirst();
        list.print();

        System.out.println(list.peek());
    }
}
