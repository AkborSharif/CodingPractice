package com.company.akbor.dataStructure.javaArray;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
          Array a = new Array(4);
          a.print();
          a.insert(1);
          a.insert(2);
          a.insert(3);
          a.insert(4);
          a.print();

        List<String> list1 = new ArrayList<>();
        list1.add("Akbor");
        list1.add("Babar");
        list1.add("Samia");
        list1.add("Newaz");
        list1.add("Atkia");
        list1.add("Anjara");

        for (String n: list1){
            System.out.println(n);
        }


    }
}
