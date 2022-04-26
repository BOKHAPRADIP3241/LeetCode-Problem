package com.company;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public int f(int i, int j1, int j2, int r,int c ,int[][] grid,int[][][] dp) {
        if (j1 < 0 || j2 < 0 || j1 >=c || j2 >= c) return (int) -1e8;
        if (dp[i][j1][j2] != -1) return dp[i][j1][j2];
        if (i == r-1) {
            if (j1 == j2) return grid[i][j1];
            else
                return grid[i][j1] + grid[i][j2];

        }
        int maxi = (int)-1e8;

        for (int dj1 = -1; dj1<=+1; dj1++) {
            for (int dj2 = -1; dj2<=+1; dj2++) {
                int value = 0;
                if (j1 == j2) return grid[i][j1];
                else {
                    value = grid[i][j1] + grid[i][j2];
                    value += f(i+1,j1+dj1,j2 + dj2,r, c, grid,dp);
                    maxi = Math.max(maxi, value);

                }

            }
        }
        return dp[i][j1][j2] = maxi;
    }

    public int maximumChocolates(int r, int c, int[][] grid) {
        //dp[r][c][c]
        int[][][] dp = new int[r][c][c];
        for(int[][] row : dp) {
            for (int[] p : row) {
                Arrays.fill(p,-1);
            }

        }
        return f(0,0,c-1,r,c,grid,dp);
    }

    public static void main(String[] args) {
	// write your code here
        int[][] grid = {{2,3,1,2},{3,4,2,2},{5,6,3,5}};
        int r = grid.length;
        int c = grid[0].length;
        Main m = new Main();
        int res = m.maximumChocolates(r,c,grid);
        System.out.println(res);
    }
}
