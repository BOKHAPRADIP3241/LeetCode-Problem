package com.company;

import java.util.Arrays;

public class Main {

    boolean isPosssible(int[] arr, int k, int mid) {
        int count = 1;
        int lastpos = arr[0];
        for (int i = 0; i<arr.length; i++) {
            if (arr[i] - lastpos >= mid) {
                count++;
                if (count == k) {
                    return true;
                }
                lastpos = arr[i];
            }
        }
        return false;
    }

    public int aggreCow(int[] arr, int k) {
        int s = 0;
        int maxi = -1;

        for (int i = 0; i < arr.length; i++) {
            maxi = Math.max(maxi,arr[i]);
        }

        int end = maxi;
        int ans = -1;
        int mid = s + (end - s) / 2;

        while (s <= end) {
            if (isPosssible(arr, k, mid)) {
                ans = mid;
                s = mid + 1;
            }

            else {
                s = mid - 1;
            }
            mid = s + (end - s) / 2;
        }
        return ans;
    }

//    public static boolean isPossible(int[] a, int n, int cows, int dis) {
//        int cntCows = 1;
//        int lastPlacedCows = a[0];
//        for (int i = 1; i < n; i++ ) {
//            if (a[i] - lastPlacedCows >= dis) {
//                cntCows++;
//                lastPlacedCows = a[i];
//            }
//        }
//        if (cntCows >= cows) return true;
//        return false;
//    }
//
//
   public static void main(String[] args) {
//	// write your code here
//        int n = 5;
//        int cows = 4;
//        int[] a = {1,2,4,8,9};
//        Arrays.sort(a);
//        int low = 1, high = a[n-1] - a[0];
//
//        while (low <= high) {
//            int mid = (low + high) / 2;
//
//            if (isPossible(a,n,cows,mid)) {
//                low = mid + 1;
//            }
//            else {
//                high = mid - 1;
//            }
//        }
//        System.out.println(high);
    }
}
