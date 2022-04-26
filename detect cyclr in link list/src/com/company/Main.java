package com.company;

import java.util.List;

public class Main {

    private ListNode head;

    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public static ListNode detectCycle(ListNode head) {
        if (head == null || head.next == null) return null;

        ListNode slow = head;
        ListNode fast = head;
        ListNode entry = head;

        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                while (slow != entry) {
                    slow = slow.next;
                    entry = entry.next;
                }
                return entry;
            }
        }
        return null;
    }

   /*public static void printList(ListNode head) {
        if (head == null) {
            System.out.println("Null");
        }
        while (head.next != null) {
            System.out.print(head.val);
            head = head.next;
            // System.out.print("->");
        }
        System.out.print(head.val);


    }*/


    public static void main(String[] args) {

        Main li = new Main();
        li.head = new ListNode(1);
        li.head.next = new ListNode(3);
        li.head.next.next = new ListNode(2);
        li.head.next.next.next = new ListNode(4);
        li.head.next.next.next.next = new ListNode(7);
        li.head.next = new ListNode(5);
        li.head = detectCycle(li.head);
        printList(li.head);


    }
}


