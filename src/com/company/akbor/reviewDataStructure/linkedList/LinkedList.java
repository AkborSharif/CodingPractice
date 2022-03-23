package com.company.akbor.reviewDataStructure.linkedList;

public class LinkedList {

    public class Node{
        private int value;
        private Node next;
        Node(int value){
            this.value = value;
        }
    }
    private Node first;
    private Node last;

    public void add(int val){
        Node newNode = new Node(val);
        if (first != null) {
            last.next = newNode;
        } else {
            first = newNode;
        }
        last = newNode;
    }

    public void addFirst(int val){
        Node newNode = new Node(val);
        if(first != null){
            newNode.next = first;
        }else{
            last = newNode;
        }
        first = newNode;
    }

    public void remove(){
        if (first!=null){
            Node curr = first;
            while(curr.next.next!=null){
                curr = curr.next;
            }
            last = curr;
            curr.next = null;
        }
    }

    public void removeFirst(){
        if (first!=null){
           first = first.next;
        }
    }

    public void print(){
        if (first != null){
            Node curr = first;
            while (curr!=null){
                System.out.print(curr.value + "->");
                curr= curr.next;
            }
            System.out.println("null");
        }
    }

    public int peek(){
        if (first==null){
            System.out.println("empty list");
        }
        return first.value;
    }

}
