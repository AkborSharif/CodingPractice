package com.company.akbor.reviewDataStructure.interfaces;

public class Eat implements Animal, Human {
    public static void main(String[] args) {
        Eat e = new Eat();
        e.eat();
    }

    @Override
    public void eat() {
        Animal.super.eat();
    }
}
