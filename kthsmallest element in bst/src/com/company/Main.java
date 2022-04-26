package com.company;

import java.util.Stack;

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

    public int kThSmallest(TreeNode root, int k) {
        Stack<TreeNode> stack = new Stack<TreeNode>();

        TreeNode node = root;
        int cnt = 0;

        while (true) {
            if (node != null) {
                stack.push(node);
                node = node.left;
            }
            else {
                if (stack.isEmpty()) {
                    break;
                }
                node = stack.pop();
                cnt++;
                if (cnt == k) return node.val;
                node = node.right;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
	// write your code here
        Main m = new Main();
        m.root = new TreeNode(5);
        m.root.left = new TreeNode(3);
        m.root.right = new TreeNode(6);
        m.root.left.left = new TreeNode(2);
        m.root.left.right = new TreeNode(4);
        m.root.right.right = new TreeNode(7);

        int k = 2;
        int res = m.kThSmallest(m.root, k);
        System.out.println(res);
    }
}
