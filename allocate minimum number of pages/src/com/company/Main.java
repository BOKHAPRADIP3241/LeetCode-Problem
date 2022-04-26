package com.company;

public class Main {
    private static boolean isPossible(int[] a, int pages, int students) {
        int cnt = 0;
        int sumAllocated = 0;

        for (int i = 0; i < a.length; i++) {
            if (sumAllocated + a[i] > pages) {
                cnt++;
                sumAllocated = a[i];

                if (sumAllocated > pages || a[i] > pages) return false;
            }
            else {
                sumAllocated += a[i];

            }
        }

        if (cnt < students) return true;
        return false;

    }



    public static int books(int[] a, int b) { // b = student
        if (b > a.length) return -1;
        int low = a[0];
        int high = 0;

        for (int i = 0; i < a.length; i++) {
            high = high + a[i];
            low = Math.min(low,a[i]);
        }

        int res = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (isPossible(a, mid, b)) {
                res = mid;
                high = mid - 1;
            }
            else {
                low = mid + 1;
            }
        }
        return res;

    }

    public static void main(String[] args) {
	// write your code here
        int[] a = {12,34,67,90};
        int b = 2;
        int res = books(a,b);
        System.out.println(res);
    }
}
