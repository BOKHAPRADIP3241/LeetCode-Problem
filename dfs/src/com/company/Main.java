package com.company;

import java.util.ArrayList;

public class Main {

    public void dfs(int node, boolean[] vis, ArrayList<ArrayList<Integer>> adj, ArrayList<Integer> storeDfs) {
        storeDfs.add(node);
        vis[node] = true;
        for (Integer it : adj.get(node)) {
            if (vis[it] == false) {
                dfs(it, vis,adj, storeDfs);
            }
        }

    }

    public ArrayList<Integer> dfsGraph(int V, ArrayList<ArrayList<Integer>> adj){
        ArrayList<Integer> storeDfs = new ArrayList<>();
        boolean[] vis = new boolean[V+1];

        for (int i = 0; i <= V; i++) {
            if (vis[i] == false) {
                dfs(i,vis,adj,storeDfs);
            }
        }
        return storeDfs;
    }


    static void addEdge(ArrayList<ArrayList<Integer>> adj, int u, int v)
    {
        adj.get(u).add(v);
        adj.get(v).add(u);
    }

    static void
    printGraph(ArrayList<ArrayList<Integer> > adj) {
        for (int i = 0; i < adj.size(); i++) {
            System.out.println("\nAdjacency list of vertex"
                    + i);
            System.out.print("head");
            for (int j = 0; j < adj.get(i).size(); j++) {
                System.out.print(" -> "
                        + adj.get(i).get(j));
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
	// write your code here
        int V = 4;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<ArrayList<Integer>>(V);

        for (int i = 0; i <= V; i++) {
            adj.add(new ArrayList<Integer>());

            addEdge(adj,0,1);
            addEdge(adj,0,4);
            addEdge(adj,1,2);
            addEdge(adj,1,3);
            addEdge(adj,1,4);
            addEdge(adj,2,3);
            addEdge(adj,3,4);
            printGraph(adj);

            Main m = new Main();

            ArrayList<Integer> res = m.dfsGraph(V, adj);
            System.out.println(res);


        }
    }
}
