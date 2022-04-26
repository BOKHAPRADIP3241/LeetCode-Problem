package com.company;

import java.sql.SQLOutput;

public class Solution {
    private TreeNode root;
    public static boolean isBalanced(TreeNode root) {

        return dfsHeight(root) != -1;
    }

     static int dfsHeight(TreeNode root){
        if (root == null) return 0;

        int leftHeight = dfsHeight(root.left);
        if (leftHeight == -1) return -1;
        int rightHeight = dfsHeight(root.right);
        if (rightHeight ==-1)return -1;

        if (Math.abs(leftHeight - rightHeight) > 1) return -1;
        return Math.max(leftHeight , rightHeight) + 1;


      }
    public static void main(String[] args) {
	// write your code here
        Solution Root = new Solution();
        Root.root = new TreeNode(1);
        Root.root.left = new TreeNode(2);
        Root.root.right = new TreeNode(3);
        Root.root.left.left = new TreeNode(4);
        Root.root.left.right = new TreeNode(5);
        Root.root.right.left = new TreeNode(6);
        //Root.root.right.right = new TreeNode(7);
        Root.root.right.left.left = new TreeNode(8);
        System.out.println(isBalanced(Root.root));
        System.out.println(dfsHeight(Root.root));

    }
}
