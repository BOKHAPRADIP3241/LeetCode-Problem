package com.company;

public class Main {
    private TreeNode root;

    public  static boolean isSameTree(TreeNode p,TreeNode q) {
        if (p == null && q == null){
            return (p==q);
        }
        return (p.val == q.val) && isSameTree(p.left, q.left) && isSameTree(p.right, q.right);

    }

    public static void main(String[] args) {
	// write your code here
        Main Root = new Main();
        Root.root = new TreeNode(1);
        Root.root.left = new TreeNode(2);
        Root.root.right = new TreeNode(3);
        Root.root.left.left = new TreeNode(4);
        Root.root.left.right = new TreeNode(5);
        Root.root.right.left = new TreeNode(6);
        Root.root.right.right = new TreeNode(7);

        Main second = new Main();
        second.root = new TreeNode(1);
        second.root.left = new TreeNode(2);
        second.root.right = new TreeNode(3);
        second.root.left.left = new TreeNode(4);
        second.root.left.right = new TreeNode(5);
        second.root.right.left = new TreeNode(6);
        second.root.right.right = new TreeNode(7);
        System.out.println(isSameTree(Root.root, second.root));

    }
}
