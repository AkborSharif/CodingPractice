package com.company.akbor.codingProblems.linkedList;

public class ReverseLinkedList {
    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }

    public static ListNode reverseList(ListNode head) {
        ListNode prev = null;
        while (head != null) {
            ListNode Next = head.next;
            head.next = prev;
            prev = head;
            head = Next;
        }
        return prev;
    }


    public static void main(String[] args) {

        //creating a linkedList
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        node1.next = node2;
        node2.next = node3;

        //printing the original linkedlist
        System.out.println("Before: ");
        ListNode curr = node1;
        while (curr != null) {
            System.out.print(curr.val + "->");
            curr = curr.next;
        }
        if (curr == null) {
            System.out.println("null");
        }


        ListNode head = reverseList(node1);

        //printing the reverse linkedlist
        System.out.println("After: ");
        curr = head;
        while (curr != null) {
            System.out.print(curr.val + "->");
            curr = curr.next;
        }
        if (curr == null) {
            System.out.println("null");
        }
    }
}
