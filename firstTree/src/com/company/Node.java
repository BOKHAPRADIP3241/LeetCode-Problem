package com.company;



public class Node {

    int data;
    Node left;
    Node right;

    public Node(int key) {
        data = key;
    }
}




     public static void main(String[] args) {
         // write your code here
         Node root = new Node(1);
         root.left = new Node(2);
         root.right = new Node(3);
         root.right.left = new Node(4);
     }

