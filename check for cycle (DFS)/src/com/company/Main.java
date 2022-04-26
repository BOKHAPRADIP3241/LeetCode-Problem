package com.company;

import java.lang.management.MonitorInfo;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    static boolean checkForCycle(int node, int parent, boolean[] vis, ArrayList<ArrayList<Integer>> adj) {
        vis[node] = true;
        for (Integer it : adj.get(node)) {
            if (vis[it] == false) {
                if (checkForCycle(it, node, vis, adj) == true) return true;
            } else if (it != parent) {
                return true;
            }
        }
        return false;
    }

    public boolean isCycle(int V, ArrayList<ArrayList<Integer>> adj) {
        boolean[] vis = new boolean[V + 1];
        Arrays.fill(vis, false);

        for (int i = 1; i <= V; i++) {
            if (vis[i] == false) {
                if (checkForCycle(i, -1, vis, adj))
                    return true;
            }
        }
        return false;
    }


    static void addEdge(ArrayList<ArrayList<Integer> > adj,
                        int u, int v)
    {
        adj.get(u).add(v);
        adj.get(v).add(u);
    }

    static void
    printGraph(ArrayList<ArrayList<Integer> > adj)
    {
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
        //int n = 3, m = 3;
        int V = 4;
        ArrayList<ArrayList<Integer>> Adj = new ArrayList<ArrayList<Integer>>(V);

        for (int i = 0; i <= V; i++)
            Adj.add(new ArrayList<Integer>());

        addEdge(Adj, 0, 1);
        //addEdge(Adj, 0, 4);
       // addEdge(Adj, 1, 3);
        //addEdge(Adj, 1, 4);
        //addEdge(Adj, 3, 1);
        addEdge(Adj, 3, 2);
        addEdge(Adj, 2, 3);
        addEdge(Adj, 2, 4);
        addEdge(Adj, 4, 1);
        addEdge(Adj, 4, 2);
        printGraph(Adj);

        Main m = new Main();


        boolean ans = m.isCycle(V, Adj);
        System.out.println(ans);


    }
}

