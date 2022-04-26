package com.company;

public class Main {
    private static double multiply(double number, int n) {
    double ans = 1.0;
    for (int i = 0; i < n; i++) {
        ans = ans * number;

    }
    return ans;
    }

    public static double getNthRoot(int n, int m) {
    double low = 1;
    double high = m;
    double eps = 1e-6;

    while((high - low) > eps) {
        double mid = (low + high) / 2.0;
        if (multiply(mid,n) < m) {
            low = mid;
        }
        high = mid;
    }
    return low;

    }

    public static void main(String[] args) {
	// write your code here
        int n = 3, m =27;
        double res = getNthRoot(n, m);
        System.out.println(res);
    }
}
