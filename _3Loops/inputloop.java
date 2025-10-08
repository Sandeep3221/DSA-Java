package _3Loops;

import java.util.Scanner;

public class inputloop {
        public static void main(String[] args) {
                @SuppressWarnings("resource")
                Scanner sc=new Scanner(System.in);
                System.out.println("Enter the limit");
                int limit = sc.nextInt();
                for(int i=1;i<=limit;i++){
                        System.out.println("Sandeep");
                }
        }
}
