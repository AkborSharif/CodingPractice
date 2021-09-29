package com.company.dataStructure.customArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();

        arrayList.addFirst(0);
        arrayList.addLast(3);
        arrayList.addLast(4);
        arrayList.addLast(5);
        arrayList.addLast(6);
        arrayList.display();

        System.out.println(arrayList.indexOf(4));
        System.out.println(arrayList.indexOf(3));
        System.out.println(arrayList.indexOf(9));


        boolean hasFour = arrayList.contains(4);
        if (hasFour == true) {
            System.out.println("List Contains 4");
        } else {
            System.out.println("List does not contains 4");
        }

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
