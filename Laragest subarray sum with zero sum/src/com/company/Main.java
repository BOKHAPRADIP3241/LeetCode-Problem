package com.company;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Main {
    public static int maxLen(int[] a , int n){
        Map<Integer,Integer> map = new HashMap<Integer,Integer>();
        int maxi = 0;
        int sum = 0;
        for (int i = 0; i<n; i++) {
            sum += a[i];
             if (sum == 0){
                 maxi = i + 1;
             }
             else {
                 if (map.get(sum) != null){
                     maxi = Math.max(maxi , i - map.get(sum));

                 }
                 else {
                     map.put(sum,i);
                 }
             }

        }
        return maxi;
    }

    public static void main(String[] args) {
	// write your code here
        int[] a = {15,-2,2,-8,1,7,10,23};
        int n = 8;
        System.out.println(maxLen(a,n));

    }
}
