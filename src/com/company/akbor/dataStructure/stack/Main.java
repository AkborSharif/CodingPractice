package com.company.akbor.dataStructure.stack;

public class Main {
    public static void main(String[] args) {
        //LIFO
        Stack stack = new Stack();

        System.out.println("Is stack empty? " + stack.isEmpty());

        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.display();

        System.out.println("Peek value is: " + stack.peek());

        stack.pop();
        stack.pop();
        stack.display();

        System.out.println("Peek value is: " + stack.peek());
        System.out.println("Is stack empty? " + stack.isEmpty());
    }
}
