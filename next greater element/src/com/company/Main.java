package com.company;

import java.util.Stack;

public class Main {
    public static int[] nextElement(int[] nums) {
        int n = nums.length;
        Stack<Integer> st = new Stack<>();
        int[] nge = new int[n];
        for (int i = 2 * n - 1; i >= 0; i--) {
            while (st.isEmpty() == false && st.peek() <= nums[i % n]) {
                st.pop();
            }
            if (i < n) {
                if (st.isEmpty() ==false) nge[i] = st.peek();
                else
                    nge[i] = -1;
        }
            st.push(nums[i%n]);
    }
        return nge;

}

    public static void main(String[] args) {
	// write your code here
        int[] nums = {4,12,5,3,1,2,5,3,1,2,4,6};
        int[] res = nextElement(nums);
        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i] + " ");
        }
    }
}
