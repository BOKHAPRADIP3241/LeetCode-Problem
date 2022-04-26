package com.company;

import javax.sound.midi.Soundbank;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Main {

    public  ArrayList<Integer> bfsOfGraph(int v, ArrayList<ArrayList<Integer> > adj) {
        ArrayList<Integer> bfs = new ArrayList<>();
        boolean vis[] = new boolean[v + 1];

        for (int i = 0; i < v; i++) {
            if (vis[i] == false) {
                Queue<Integer> q = new LinkedList<>();
                q.add(i);
                vis[i] = true;

                while (!q.isEmpty()) {
                    Integer node = q.poll();
                    bfs.add(node);

                    for (Integer it : adj.get(node)) {
                        if (vis[it] == false) {
                            vis[it] = true;
                            q.add(it);

                        }
                    }
                }
            }
        }
        return bfs;

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

        addEdge(Adj,0,1);
        addEdge(Adj,0,4);
        addEdge(Adj,1,2);
        addEdge(Adj,1,3);
        addEdge(Adj,1,4);
        addEdge(Adj,2,3);
        addEdge(Adj,3,4);
        printGraph(Adj);

        Main m = new Main();

        ArrayList<Integer> res = m.bfsOfGraph(V, Adj);
        System.out.println(res);


    }
}
