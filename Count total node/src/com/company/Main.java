package com.company;

public class Main {
    private TreeNode root;
    public static int countNode(TreeNode root) {
        if (root == null) return 0;
        int left = getHeightLeft(root);
        int right = getHeightRight(root);

        if (left == right) return ((2<<(left)) - 1);

        else return countNode(root.left) + countNode(root.right) +1;
    }

    public static int getHeightLeft(TreeNode root) {
        int count = 0;
        while (root.left != null) {
            count++;
            root = root.left;
        }
        return count;

    }

    public static int getHeightRight(TreeNode root) {
        int count = 0;
        while (root.right != null) {
            count++;
            root = root.right;
        }
        return count;

    }

    public static void main(String[] args) {
	// write your code here
        Main Root = new Main();
        Root.root = new TreeNode();
        Root.root.left = new TreeNode(2);
        Root.root.right = new TreeNode(3);
        Root.root.left.left = new TreeNode(4);
        Root.root.left.right = new TreeNode(5);
        Root.root.right.left = new TreeNode(6);
        Root.root.right.right = new TreeNode(7);
        Root.root.left.left.left= new TreeNode(10);
        Root.root.left.left.right= new TreeNode(15);


        System.out.println(countNode(Root.root));

    }
}
