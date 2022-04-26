package com.company;

public class Main {
    public static void nextPermutation(int[] a) {
        if (a == null || a.length <= 1) return;
        int i = a.length - 2;
        while(i >= 0 && a[i] >= a[i+1]) i--;
        if (i >= 0) {
            int j = a.length - 1;
            while(a[j] <= a[i]) j--;
            swap(a, i, j);
        }
        reverse(a, i+1, a.length - 1);
    }

    public static  void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    public static void reverse(int[] a, int i, int j) {
        while (i < j) swap(a, i++, j--);
    }

    public static void main(String[] args) {
	// write your code here
        int[] a = new int[] {1,4,3,2,5};
        nextPermutation(a);
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}
