package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import java.util.stream.LongStream;

class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {}
        TreeNode(int val) {
        this.val = val;
        }

        TreeNode(int va, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
        }
}

public class Main {
    private TreeNode root;
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> inorder = new ArrayList<Integer>();
        Stack<TreeNode> stack = new Stack<TreeNode>();
        TreeNode node = root;

        while (true) {

            if (node != null) {
                stack.push(node);
                node = node.left;
            }
            else {
                if (stack.isEmpty()) break;

                node = stack.pop();
                inorder.add(node.val);
                node = node.right;
            }
        }
        return inorder;
    }

    public static void main(String[] args) {
	// write your code here
        Main Root = new Main();
        Root.root = new TreeNode(1);
        Root.root.left = new TreeNode(2);
        Root.root.right = new TreeNode(7);
        Root.root.left.left = new TreeNode(3);
        Root.root.left.right = new TreeNode(4);
        Root.root.left.right.left = new TreeNode(5);
        Root.root.left.right.right = new TreeNode(6);
        List<Integer> res = Root.inorderTraversal(Root.root);
        System.out.println(res);
    }
}
