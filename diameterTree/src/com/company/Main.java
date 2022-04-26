package com.company;

public class Main {

    private TreeNode root;

    public static int DiameterOfBinaryTree(TreeNode root) {
        int[] diameter = new int[1];
        height(root , diameter);
        return diameter[0];
    }

     private static int height(TreeNode node , int[] diameter) {

        if (node == null) {
            return 0;
        }

        int lh = height(node.left , diameter);
        int rh = height(node.right , diameter);

        diameter[0] = Math.max(diameter[0] , lh + rh);
        return 1 + Math.max(lh , rh);
    }


    public static void main(String[] args) {
	// write your code here
        int[] diameter = new int[1];
        Main Root = new Main();
        Root.root = new TreeNode(1);
        Root.root.left = new TreeNode(2);
        Root.root.right = new TreeNode(3);
        Root.root.left.left = new TreeNode(4);
        Root.root.left.right = new TreeNode(5);
        Root.root.right.left = new TreeNode(6);
        Root.root.right.right = new TreeNode(7);
       // Root.root.right.left.left = new TreeNode(8);
        System.out.println((DiameterOfBinaryTree(Root.root)));
        System.out.println(height(Root.root, diameter));

        

    }
}
