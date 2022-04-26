package com.company;

public class Main {

    public static class ListNode {
        public ListNode head;
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public boolean isPalidrome(ListNode head) {
        if (head == null || head.next == null) return true;

        ListNode slow = head;
        ListNode fast = head;

        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        slow.next = reverseList(slow.next);

        slow = slow.next;

        while (slow != null) {
            if (head.val != slow.val) return false;
            head = head.next;
            slow = slow.next;
        }
        return true;
    }
    public static ListNode reverseList(ListNode head) {
        ListNode dummy = null;
        while(head != null) {
            ListNode next = head.next;
            head.next = dummy;
            dummy = head;
            head = next;
        }
        return dummy;
    }

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

        ListNode li = new ListNode();
        li.head = new ListNode(1);
        li.head.next = new ListNode(2);
        li.head.next.next = new ListNode(3);
        li.head.next.next.next = new ListNode(3);
        li.head.next.next.next.next = new ListNode(2);
        li.head.next.next.next.next.next = new ListNode(5);
        Main m = new Main();


        System.out.println(m.isPalidrome(li.head));

    }
}
