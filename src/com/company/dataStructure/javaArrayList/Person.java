package com.company.dataStructure.javaArrayList;

public class Person {
    private String name = "";
    private int age = 0;
    private char gender = 'M';
    private int count = 0;

    Person(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        count++;
    }

    public int countPerson() {
        return this.count;
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
