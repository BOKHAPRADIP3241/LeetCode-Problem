package com.company;

public class Main {
     public static int findDuplicate(int[] arr){
         int slow = arr[0];
         int fast = arr[0];

         do {
             slow = arr[slow];
             fast = arr[arr[fast]];
         }while (slow != fast);
         fast = arr[0];
         while (slow != fast){
             slow = arr[slow];
             fast = arr[fast];
         }
          return slow;

     }


    public static void main(String[] args) {
         int[] arr = {2,3,5,4,5,4,6,8};

        System.out.println(findDuplicate(arr));
	// write your code here
    }
}
