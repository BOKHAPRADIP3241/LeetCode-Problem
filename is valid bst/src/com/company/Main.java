package com.company;

public class Main {
    private TreeNode root;

    public static boolean isValidBst(TreeNode root) {
        return isValidBst(root, Long.MIN_VALUE, Long.MAX_VALUE);

    }

    public static boolean isValidBst(TreeNode root, long minVal, long maxVal) {
        if (root == null) return true;
        if (root.val >= maxVal || root.val <= minVal) return false;
        return isValidBst(root.left, minVal, root.val) && isValidBst(root.right, root.val, maxVal);

    }

    public static void main(String[] args) {
	// write your code here
        Main Root = new Main();
        Root.root = new TreeNode(4);
        Root.root.left = new TreeNode(1);
        Root.root.right = new TreeNode(6);
        Root.root.right.left = new TreeNode(5);
        Root.root.right.right = new TreeNode(8);

        System.out.println(isValidBst(Root.root));
    }
}
