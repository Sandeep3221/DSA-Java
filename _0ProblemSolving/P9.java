
package _0ProblemSolving;

import java.util.Arrays;

public class P9 {
    public static void moveZeroes(int[] arr) {
        // Your code goes here

        int j=0;
        for(int i=0;i<arr.length;i++){
                if(arr[i]!=0){
                        int temp=arr[i];
                        arr[i]=arr[j];
                        arr[j]=temp;
                        j++;
                }
                

        }
    }

    public static void main(String[] args) {
        int[] arr1 = {0, 1, 0, 3, 12};
        moveZeroes(arr1);
        System.out.println(Arrays.toString(arr1)); // Expected: [1, 3, 12, 0, 0]

        int[] arr2 = {0, 0, 1};
        moveZeroes(arr2);
        System.out.println(Arrays.toString(arr2)); // Expected: [1, 0, 0]
    }
}