package com.company;

public class TreeNode {
        int val;
        com.company.TreeNode left;
        com.company.TreeNode right;
        TreeNode(){}
        TreeNode(int val) {
            this.val = val;
        }

        public TreeNode(int val, com.company.TreeNode left, com.company.TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }

}
