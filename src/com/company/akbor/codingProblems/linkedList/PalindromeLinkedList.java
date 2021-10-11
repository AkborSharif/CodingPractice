package com.company.akbor.codingProblems.linkedList;

public class PalindromeLinkedList {
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

    public static boolean isPalindrome(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        ListNode headOfOtherHalf = null;


        while (true) {
            fast = fast.next.next;

            if (fast == null) {
                headOfOtherHalf = slow.next;
                break;
            }
            if (fast.next == null) {
                headOfOtherHalf = slow.next.next;
                break;
            }
            slow = slow.next;
        }
        slow.next = null;
        headOfOtherHalf = reverseList(headOfOtherHalf);

        while (head != null) {
            if (head.val != headOfOtherHalf.val) {
                return false;
            }
            head = head.next;
            headOfOtherHalf = headOfOtherHalf.next;
        }
        return true;
    }

    public static void main(String[] args) {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(1);
        node1.next = node2;
        node2.next = node3;

        System.out.println(isPalindrome(node1));

        node1 = new ListNode(1);
        node2 = new ListNode(2);
        // node3 = new ListNode(2);
        node3 = new ListNode(3);
        ListNode node4 = new ListNode(1);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;

        System.out.println(isPalindrome(node1));
    }
}
