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
    private TreeNode p, q;

    public TreeNode lowestCommonAancestor(TreeNode root, TreeNode p, TreeNode q) {

        if (root == null) return null;

        int curr = root.val;
        if (curr <p.val && curr < q.val)  {
            return lowestCommonAancestor(root.right, p, q);
        }
        if (curr > p.val && curr > q.val) {
            return lowestCommonAancestor(root.left, p, q);
        }
        return root;

    }

    public static void main(String[] args) {
	            Main Root = new Main();
                Root.root = new TreeNode(4);
                Root.root.left = new TreeNode(2);
                Root.root.right = new TreeNode(6);
                Root.root.left.left = new TreeNode(1);
                Root.root.left.right = new TreeNode(3);
                Root.root.right.left = new TreeNode(5);
                Root.root.right.right = new TreeNode(7);
                //Root.root.right.left.left = new TreeNode(8);
        Root.p = new TreeNode(5);
        Root.q = new TreeNode(7);

        TreeNode res = Root.lowestCommonAancestor(Root.root, Root.p, Root.q);
        System.out.println(res);
    }
}
