package com.company.akbor.codingProblems.linkedList;

public class MergeTwoSortedList {
    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
            this.next = null;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(0);
        ListNode curr = head;
        while (l1 != null && l2 != null) {
            if (l1.val <= l2.val) {
                curr.next = l1;
                l1 = l1.next;
            } else {
                curr.next = l2;
                l2 = l2.next;
            }
            curr = curr.next;
        }
        //popst processing
        if (l1 == null) {
            curr.next = l2;
        }
        if (l2 == null) {
            curr.next = l1;
        }
        return head.next;
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        ListNode temp1 = new ListNode(2);
        l1.next = temp1;

        ListNode l2 = new ListNode(2);
        ListNode temp2 = new ListNode(4);
        l2.next = temp2;


        ListNode output = mergeTwoLists(l1, l2);

        ListNode curr = output;
        while (curr != null) {
            System.out.print(curr.val + " ");
            curr = curr.next;
        }


    }
}
