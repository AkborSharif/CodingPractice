package com.company.dataStructure.javaArrayList;

import java.util.ArrayList;

public class JavaArrayList {
    public static void main(String[] args) {
        ArrayList<Person> person = new ArrayList<>();

        person.add(new Person("Akbor", 24, 'M'));
        person.add(new Person("Newaz", 24, 'M'));
        person.add(new Person("Samia", 24, 'F'));
        person.add(new Person("Atkia", 8, 'F'));
        person.add(new Person("Anjara", 1, 'F'));


        System.out.println("name" + '\t' +
                '\t' + "age" +
                '\t' + "gender");
        System.out.println("----------------------");
        for (Person p : person) {
            System.out.println(p.toString());
        }

    }
}
