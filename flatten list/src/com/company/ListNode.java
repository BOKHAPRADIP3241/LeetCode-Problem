package com.company;

public class ListNode {
    public static void printList(ListNode head) {
        if (head == null) {
            System.out.println("Null");
        }
        while (head.next != null) {
            System.out.print(head.val);
            head = head.next;
            // System.out.print("->");
        }
        System.out.print(head.val);


    }


    public static void main(String[] args) {
        int k = 4;
        Main li = new Main();
        li.head= new ListNode(0);
        li.head.next = new ListNode(1);
        li.head.next.next = new ListNode(2);
        li.head.next.next.next = new ListNode(3);
        li.head.next.next.next.next = new ListNode(4);
        li.head.next.next.next.next.next = new ListNode(5);
        li.head.next.next.next.next.next.next = new ListNode(6);
}
