package com.company.akbor.dataStructure.javaArrayList;

public class Person {
    private static int count = 0;
    private String name = "";
    private int age = 0;
    private char gender = 'M';

    Person(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        count++;
    }

    public static int countPerson() {
        return count;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return
                name + '\t' +
                        '\t' + age +
                        '\t' + gender;
    }
}
