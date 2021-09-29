package com.company.akbor.dataStructure.queue;

public class Main {
    public static void main(String[] args) {
        //FIFO
        Queue queue = new Queue();
        System.out.println("Is queue empty? " + queue.isEmpty());
        queue.push(3);
        queue.push(4);
        queue.push(5);
        queue.push(7);
        queue.push(9);
        queue.display();
        System.out.println("Peek value is: " + queue.peek());


        queue.pop();
        queue.pop();
        queue.display();

        System.out.println("Peek value is: " + queue.peek());
        System.out.println("Is queue empty? " + queue.isEmpty());
    }
}
