package com.company;

import java.util.ArrayList;
import java.util.List;

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

    private void dfs(TreeNode node, List<Integer> inorder) {
         if (node == null) return;

        /* dfs(node.left, inorder);
         inorder.add(node.val);
         dfs(node.right, inorder);*/

        //preorder traversal
       /* inorder.add(node.val);
        dfs(node.left, inorder);
        dfs(node.right, inorder); */

        //postorder traversal
        dfs(node.left, inorder);
        dfs(node.right, inorder);
        inorder.add(node.val);



     }

     public List<Integer> inorderTraversal(TreeNode root) {
         List<Integer> inorder = new ArrayList<Integer>();
         dfs(root, inorder);
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
