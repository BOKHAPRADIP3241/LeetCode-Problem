package com.company;

public class Main {
    private TreeNode root;
    public static TreeNode insertBst(TreeNode root, int val) {
        if (root == null) return new TreeNode(val);
        TreeNode cur = root;
        while(true) {
            if (cur.val <= val) {
                if (cur.right != null) cur = cur.right;

                else {
                    cur.right = new TreeNode(val);
                    break;
                }
            }
            else {
                if (cur.left != null) cur = cur.left;
                else {
                    cur.left = new TreeNode(val);
                    break;
                }
            }


        }
        return root;
    }

    public static void main(String[] args) {
	// write your code
        int val = 5;
        Main Root = new Main();
        Root.root = new TreeNode(6);
        Root.root.left = new TreeNode(3);
        Root.root.right = new TreeNode(8);
        Root.root.left.left = new TreeNode(2);
        Root.root.left.right = new TreeNode(4);
        Root.root.right.left = new TreeNode(7);
       // Root.root.right = new TreeNode(8);

        System.out.println(insertBst(Root.root,val));

    }
}
