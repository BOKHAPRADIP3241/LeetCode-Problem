package com.company;

import java.util.Scanner;

public class Main {
    private TreeNode root;
    public static TreeNode lowestCommonAncestor(TreeNode root, TreeNode P, TreeNode Q) {

        if (root == null || root == P || root == Q) {
            return root;
        }
        TreeNode left = lowestCommonAncestor(root.left, P, Q);
        TreeNode right= lowestCommonAncestor(root.right, P, Q);

        if (left == null) return right;
        else if (right == null) return left;
        else {
            return root;
        }

    }

    public static void main(String[] args) {
	// write your code here
        Main Root = new Main();
        Root.root = new TreeNode(1);
        Root.root.left = new TreeNode(2);
        Root.root.right = new TreeNode(3);
        //Root.root.left.left = new TreeNode(4);
        Root.root.left.right = new TreeNode(9);
        Root.root.right.left = new TreeNode(4);
        Root.root.right.right = new TreeNode(5);
        Root.root.right.left.left = new TreeNode(8);
        Root.root.right.right.left = new TreeNode(6);
        Root.root.right.right.right = new TreeNode(7);
        //Scanner scanner = new Scanner(System.in);
        TreeNode p = Root.root.right.right.right;
        TreeNode q = Root.root.right.left.left;
        System.out.println(lowestCommonAncestor(Root.root, p, q));
    }
}
