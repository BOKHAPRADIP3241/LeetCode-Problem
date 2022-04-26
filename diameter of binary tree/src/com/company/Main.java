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

    public int diameterOfBinaryTree(TreeNode root) {
        int[] diameter = new int[1];
        height(root,diameter);
        return diameter[0];
    }

    public int height(TreeNode node, int[] diameter) {
        if (node == null) return 0;

        int lh = height(node.left, diameter);
        int rh = height(node.right, diameter);
        diameter[0] = Math.max(diameter[0], lh + rh);
        return 1 + Math.max(lh, rh);
    }

    public static void main(String[] args) {
	// write your code here
        Main Root = new Main();
        Root.root = new TreeNode(1);
        Root.root.left = new TreeNode(2);
        Root.root.right = new TreeNode(3);
        Root.root.left.left = new TreeNode(4);
        Root.root.left.right = new TreeNode(5);
       // Root.root.left.right.left = new TreeNode(6);
        Root.root.right.right = new TreeNode(7);

        int result = Root.diameterOfBinaryTree(Root.root);
        System.out.println(result);

    }
}
