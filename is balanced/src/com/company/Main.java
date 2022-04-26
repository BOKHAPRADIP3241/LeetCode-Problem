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

    public boolean isBalanced(TreeNode root) {
        return dfsHeight(root) != -1;
    }
    public int dfsHeight(TreeNode root) {
        if (root == null) return 0;

        int leftH = dfsHeight(root.left);
        if (leftH == -1) return -1;

        int rightH = dfsHeight(root.right);
        if (rightH == -1) return -1;

        if (Math.abs(leftH - rightH) > 1) return -1;

        return Math.max(leftH, rightH) + 1;
    }

    public static void main(String[] args) {
	// write your code here
        Main Root = new Main();
        Root.root = new TreeNode(1);
        Root.root.left = new TreeNode(2);
        Root.root.right = new TreeNode(3);
        Root.root.left.left = new TreeNode(4);
        Root.root.left.right = new TreeNode(5);
        Root.root.left.right.left = new TreeNode(6);
        //Root.root.right.right = new TreeNode(7);

        boolean res = Root.isBalanced(Root.root);
        System.out.println(res);
    }
}
