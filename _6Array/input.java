package _6Array;

import java.util.Scanner;

public class input {
        public static void main(String[] args) {
                @SuppressWarnings("resource")
                Scanner sc=new Scanner(System.in);
                System.out.print("Enter The size of Array: ");
                int n=sc.nextInt();
                System.out.print("Enter the elements ");
                int[] arr=new int[n];
                for(int i=0;i<n;i++){
                        arr[i]=sc.nextInt();
                }
                System.out.print("The elements in the array are ");
                for(int i=0;i<n;i++){
                        System.out.print(arr[i]+" ");
                }
        }
}
