package com.company;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public class Main {

//    public int f(int i , int j, String s, String t, int[][] dp) {
//        if (i < 0 || j < 0) return 0;
//
//        if (dp[i][j] != -1) return dp[i][j];
//
//        if (s.charAt(i) == t.charAt(j)) return dp[i][j] = 1 + f(i-1, j-1, s , t, dp);
//
//        return dp[i][j] =  Math.max(f(i-1, j, s, t, dp), f(i, j-1, s, t, dp));
//    }
//
//    public int LCS(String s, String t) {
//        int n = s.length();
//        int m = t.length();
//        int[][] dp = new int[n][m];
//        for (int[] row : dp) {
//            Arrays.fill(row,-1);
//        }
//
//        return f(n-1, m-1, s, t, dp);
//
//    }

    //tabulation code

    public int lcs(String s, String t) {
        int n = s.length();
        int m = t.length();

        int[][] dp = new int[n+1][m+1];
        for (int[] raw : dp) {
            Arrays.fill(raw,0);
        }
        for (int i = 0; i <= n; i++) dp[i][0] = 0;
        for (int j = 0; j <= m; j++) dp[0][j] = 0;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++){
                if (s.charAt(i-1) == t.charAt(j-1)) dp[i][j] = 1 + dp[i-1][j-1];
                else {
                    dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
                }
            }

        }
        return dp[n][m];

    }
    public void rev(String p) {

        String str= p, nstr="";
        char ch;
        for (int i=0; i<str.length(); i++)
        {
            ch= str.charAt(i); //extracts each character
            nstr= ch+nstr; //adds each character in front of the existing string
        }
    }

    public int longestPalindromic(String s) {
        String t = s;
        rev(t);
        return lcs(s,t);

    }

    int minIns(String str){
        return str.length() - longestPalindromic(str);
    }

//    public int LCS(String s, String t) {
//        int n = s.length();
//        int m = t.length();
//        int[][] dp = new int[n][m];
//        for (int[] row : dp) {
//            Arrays.fill(row,-1);
//        }
//
//        return f(n-1, m-1, s, t, dp);
//
//    }

    public static void main(String[] args) {
	// write your code here
        String s = "prap";

        Main M = new Main();
        int  res = M.minIns(s);

        System.out.println(res);

    }
}
