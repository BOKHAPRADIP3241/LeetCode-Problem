package com.company;

import java.util.Stack;

public class Main {
    public static int largestRectangleArea(int[] heights){
        int n = heights.length;
        Stack<Integer> st =new Stack<>();
        int maxA = 0;
        for (int i  = 0; i <= n; i++){
            while (!st.empty() && (i == n || heights[st.peek()] >= heights[i])){
                int height = heights[st.pop()];
                int width;
                if (st.empty()){
                    width = i;
                }
                else{
                    width = i - st.peek() - 1;
                }
                maxA = Math.max(maxA, width * height);
            }
            st.push(i);
        }
        return maxA;

    }

    public static void main(String[] args) {

	// write your code here

        int[] heights = {3,1,5,6,10,13};
        System.out.println(largestRectangleArea(heights));
    }



}
