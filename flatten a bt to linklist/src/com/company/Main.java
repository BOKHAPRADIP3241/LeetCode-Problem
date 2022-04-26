package com.company;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {}
    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }

}


public class Main {
   private TreeNode root;
    /*TreeNode prev = null;
    public void flatten(TreeNode root) {
        if (root == null) return;

        flatten(root.right);
        flatten(root.left);

        root.right = prev;
        root.left = null;
        
        prev = root;
    }*/

    public void flatten(TreeNode root) {
        TreeNode curr = root;
        while (curr != null) {
            if (curr.left != null) {
                TreeNode prev = curr.left;
                while(prev.right != null) {
                    prev = prev.right;
                }

                prev.right = curr.right;
                curr.right = curr.left;
                curr.left = null;
            }
            curr = curr.right;
        }
    }



    public static void main(String[] args) {
        // write your code here
        Main Root = new Main();
        Root.root = new TreeNode(1);
        Root.root.left = new TreeNode(2);
        Root.root.right = new TreeNode(5);
        Root.root.left.left = new TreeNode(3);
        Root.root.left.right = new TreeNode(4);
        Root.root.right.right = new TreeNode(6);
        Root.root.right.right.right = new TreeNode(7);

        Root.flatten(Root.root);
        TreeNode curr = Root.root;
        while (curr != null) {
            System.out.println(curr.val);
            curr = curr.right;


        }
    }


    }
