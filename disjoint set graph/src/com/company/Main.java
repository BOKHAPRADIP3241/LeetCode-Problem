package com.company;

import java.util.Scanner;

public class Main {
    static int parent[] = new int[100000];
   static int rank[] = new int[100000];
   static int n = 5;

   public static void makeSet() {
        for (int i=0; i<=n;i++) {
            parent[i] = i;
            rank[i] = 0;

        }
    }

    public static int findPar(int node) {
        if (node == parent[node]) {
            return node;
        }
        return parent[node] = findPar(parent[node]);  // path compression
    }

   public static void union(int u, int v) {
       u = findPar(u);
       v = findPar(v);

        if (rank[u] < rank[v]) {
            parent[u] = v;
        }
        else if (rank[v] < rank[u]) {
            parent[v] = u;
        }
        else {
            parent[v] = u;
            rank[u]++;
        }
    }




    public static void main(String[] args) {

         makeSet();
         int m;
        Scanner s = new Scanner(System.in);
        m = s.nextInt();
        while(m>=0) {
            int u=2,v=3;
            union(u,v);

        }
    }
}
