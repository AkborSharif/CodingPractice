package com.company.akbor.codingProblems.linkedList;


public class AddTwoNumbers {
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

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode f = l1;
        ListNode l = l2;
        int carry = 0;
        int value;
        ListNode head = null;
        ListNode tail = null;


        while (f != null || l != null) {
            int firstValue = f != null ? f.val : 0;
            int secondValue = l != null ? l.val : 0;

            int sum = firstValue + secondValue + carry;
            carry = sum / 10;

            if (carry != 0) {
                value = sum % 10;
            } else {
                value = sum;
            }

            ListNode output = new ListNode(value);
            if (head == null) {
                head = output;
                tail = output;
            } else {
                tail.next = output;
                tail = tail.next;
            }


            if (f != null) {
                f = f.next;
            }
            if (l != null) {
                l = l.next;
            }

        }
        if (carry != 0) {
            ListNode output = new ListNode(carry);
            tail.next = output;
            tail = tail.next;
        }

        return head;
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(9);
        ListNode l2 = new ListNode(9);

        ListNode output = addTwoNumbers(l1, l2);
        ListNode curr = output;
        while (curr != null) {
            System.out.print(curr.val + " ");
            curr = curr.next;
        }
    }
}
