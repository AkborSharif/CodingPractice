package com.company.akbor.reviewDataStructure.interfaces;

public interface Animal {
    default void eat() {
        System.out.println("Animal");
    }
}
