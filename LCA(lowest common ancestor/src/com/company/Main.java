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
    public static TreeNode p,q;

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null || root == p || root == q) {
            return root;
        }

        TreeNode left = lowestCommonAncestor(root.left, p, q);
        TreeNode right = lowestCommonAncestor(root.right, p, q);

        if (left == null) {
            return right;
        } else if (right == null) return left;

        else {
            return root;
        }
    }
    public static void main(String[] args) {
	// write your code here
        Main Root = new Main();
        Root.root = new TreeNode(1);
        Root.root.left = new TreeNode(2);
        Root.root.right = new TreeNode(3);
        Root.root.right.left = new TreeNode(4);
        Root.root.right.right = new TreeNode(5);
        Root.root.right.right.left = new TreeNode(6);
        Root.root.right.right.right = new TreeNode(7);
        Root.root.right.left.left = new TreeNode(8);

        Main p = new Main();
        p.root = new TreeNode(7);

        Main q = new Main();
        q.root = new TreeNode(8);

        System.out.println(Root.lowestCommonAncestor(Root.root,p.root,q.root));

    }
}
