package com.company;

import java.util.ArrayList;

public class Main {
    int[] reverse(int[] rev) {
        int n = rev.length;;
        int s = 0;
        int e = n-1;

        while (s < e) {
            int temp = rev[s];
            rev[s] = rev[e];
            rev[e] = temp;
            s++;
            e--;
        }
        return rev;
    }

    public int[] findArraySum(int[] num1, int[] num2, int n, int m) {
        int i = n - 1;
        int j = m - 1;
        int carry = 0;
        int[] ans;


        while (i >= 0 && j >= 0) {
            int val1 = num1[i];
            int val2 = num2[j];

            int sum = val1 + val2 + carry;

            carry = sum / 10;
            sum = sum % 10;
            ans = sum;
            i--;
            j--;
        }

        while(i >= 0) {
            int sum = num1[i] + carry;
            carry = sum / 10;
            sum = sum % 10;
            ans.add(sum);
            i--;
        }

        while(j >= 0) {
            int sum = num2[j] + carry;
            carry = sum / 10;
            sum = sum % 10;
            ans.add(sum);
            j--;
        }

        while(carry != 0) {
            int sum = carry;
            carry = sum / 10;
            sum = sum % 10;
            ans.add(sum);

        }
        int[] res = ans.toArray();
        return reverse(res);
    }

    public static void main(String[] args) {
	// write your code here
    }
}
