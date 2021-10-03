package com.company.akbor.dataStructure.linkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();

        linkedList.addFirst(0);
        linkedList.addLast(3);
        linkedList.addLast(4);
        linkedList.addLast(5);
        linkedList.addLast(6);
        linkedList.display();
        
        System.out.println(linkedList.indexOf(4));
        System.out.println(linkedList.indexOf(3));
        System.out.println(linkedList.indexOf(9));


        boolean hasFour = linkedList.contains(4);
        if (hasFour == true) {
            System.out.println("List Contains 4");
        } else {
            System.out.println("List does not contains 4");
        }

        linkedList.addFirst(1);
        linkedList.display();

        linkedList.deleteLast();
        linkedList.deleteLast();
        linkedList.deleteLast();
        linkedList.display();

        linkedList.deleteFirst();
        linkedList.deleteFirst();
        linkedList.display();

        linkedList.deleteFirst();
        linkedList.display();
    }
}
