package com.company;

public class Main {
    int merge(int[] arr, int[] temp, int left, int mid, int right){
        int i, j, k;
        int inv_count = 0;

        i = left;
        j = mid;
        k = left;

        while(i <= mid-1 && j <= right){
            if (arr[i] <= arr[j]){
                temp[k++] = arr[i++];
            }
            else {
                temp[k++] = arr[j++];
                inv_count = inv_count + (mid - i);
            }
        }

        while (i <= mid - 1){
            temp[k++] = arr[i++];
        }

        while (j <= right){
            temp[k++] = arr[j++];

        }

         for (i = left; i <= right; i++) {
             arr[i] = temp[i];
         }
             return inv_count;

    }


        public static int _mergeSort(int[] arr, int[] temp,int left,int right) {

            int mid, inv_count = 0;
            if (right > left) {
                mid = (left + right) / 2;
                inv_count += _mergeSort(arr, temp, left, mid);
                inv_count += _mergeSort(arr, temp, mid + 1, right);
            }
            return inv_count;
        }

    public static void main(String[] args) {
	// write your code here
        int[] arr = {8,4,2,1,6,5,7};
        int n = arr.length;
        int[] temp = new int[0];
        int ans = _mergeSort(arr, temp,0,arr.length - 1);
        System.out.println(ans);

    }
}
