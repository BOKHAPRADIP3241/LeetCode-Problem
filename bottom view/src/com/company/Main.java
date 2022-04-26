package com.company;

import java.util.*;

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

class Pair{
    int hd;
    TreeNode node;

    Pair() {}
    Pair(TreeNode _node, int _hd) {
        hd = _hd;
        node = _node;
    }
}

public class Main {
    private TreeNode root;

    public ArrayList<Integer> bottomView(TreeNode root) {
        ArrayList<Integer> ans = new ArrayList<>();
        if (root == null) return ans;

        Map<Integer, Integer> map = new TreeMap<>();
        Queue<Pair> q = new LinkedList<Pair>();
        q.add(new Pair(root,0));

        while(!q.isEmpty()) {
            Pair it = q.remove();
            int hd = it.hd;
            TreeNode temp = it.node;
            map.put(hd, temp.val);

            if (temp.left != null) {
                q.add(new Pair(temp.left, hd - 1));
            }
            if (temp.right != null) {
                q.add(new Pair(temp.right, hd + 1));
            }
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            ans.add(entry.getValue());
        }
        return ans;
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
        Root.root.right.right = new TreeNode(7);

        List<Integer> res = Root.bottomView(Root.root);
        System.out.println(res);
    }
}
