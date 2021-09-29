package com.company.dataStructure.customArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();

        arrayList.addFirst(0);
        arrayList.addLast(5);
        arrayList.addLast(8);
        arrayList.addLast(3);
        arrayList.addLast(4);
        arrayList.display();

        arrayList.addFirst(1);
        arrayList.display();

        arrayList.deleteLast();
        arrayList.deleteLast();
        arrayList.deleteLast();
        arrayList.display();

        arrayList.deleteFirst();
        arrayList.deleteFirst();
        arrayList.display();

        arrayList.deleteFirst();
        arrayList.display();
    }
}
