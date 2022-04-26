package com.company;

import java.util.Arrays;

public class Main {
    int f(int i, int j, String s, String t, int[][] dp) {

        if (i < 0) return j+1;
        if (j < 0) return i+1;

        if (dp[i][j] != -1) return dp[i][j];

        if (s.charAt(i) == t.charAt(j))
            return dp[i][j] = f(i - 1, j - 1, s, t, dp);

        return dp[i][j] = 1 + Math.min(f(i - 1, j, s, t, dp),
                Math.min(f(i, j - 1, s, t, dp), f(i - 1, j - 1, s, t, dp)));

    }

    public int editDistance(String s, String t) {
        int n = s.length();
        int m = t.length();
        p = new StringBuilder().reverse(s);

        int[][] dp = new int[n][m];

        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }

        return f(n-1, m-1, s, t, dp);
    }




    public static void main(String[] args) {
	// write your code here
        String s = "horse";
        String t = "ros";

        Main obj = new Main();

        System.out.println(obj.editDistance(s, t));
    }
}
