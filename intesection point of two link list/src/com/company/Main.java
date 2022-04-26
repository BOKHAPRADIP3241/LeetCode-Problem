package com.company;

import com.sun.source.tree.LiteralTree;

import java.util.List;

public class Main {

    public static class ListNode {
        public ListNode head;
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    private ListNode head;

    public static ListNode interSectionPoint(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) return null;

        ListNode a = headA;
        ListNode b = headB;
        while (a != b) {
            a = a == null ? headB : a.next;
            b = b == null ? headA : b.next;
        }
        return a;
    }

    static void print(ListNode head)
    {
        if (head == null)
            System.out.print("null");
        while (head.next != null) {
            System.out.print(head.val+ ".");
            head = head.next;
        }
        System.out.print(head.val);
    }

    public static void main(String[] args) {
	// write your code here
        ListNode li = new ListNode();
        li.head = new ListNode(1);
        li.head.next= new ListNode(2);
        li.head.next.next= new ListNode(8);
        li.head.next.next.next= new ListNode(7);

        Main li1 = new Main();
        li1.head = new ListNode(2);
        li1.head.next= new ListNode(8);
        li1.head.next.next= new ListNode(1);
        li1.head.next.next.next= new ListNode(3);
        li1.head.next.next.next.next= new ListNode(8);
        li1.head.next.next.next.next= new ListNode(7);



        ListNode headA = li.head;
        ListNode headB = li1.head;
        ListNode re = interSectionPoint(headA, headB);
        print(re);



    }
}
