package com.company;

public class Main {
    private TreeNode root;

    public static int findCeil(TreeNode root, int key) {
        int ceil = -1;
        while (root != null) {
            if (root.val == key) {
                ceil = root.val;
                return ceil;
            }
            if (key > root.val) {
                root = root.right;
            }
            else {
                ceil = root.val;
                root = root.left;
            }
        }
        return ceil;
    }

    public static void main(String[] args) {
	// write your code here
        int key = 8;
        Main Root = new Main();
        Root.root = new TreeNode(10);
        Root.root.left = new TreeNode(5);
        Root.root.right = new TreeNode(13);
        Root.root.left.left = new TreeNode(3);
        Root.root.left.right = new TreeNode(6);
        Root.root.right.left = new TreeNode(11);
        Root.root.right.right = new TreeNode(14);
        Root.root.left.left.left = new TreeNode(2);
        Root.root.left.left.right = new TreeNode(4);
        Root.root.left.right.right = new TreeNode(9);
        System.out.println(findCeil(Root.root, key));

    }
}
