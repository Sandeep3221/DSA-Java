package _3Loops;

import java.util.Scanner;

public class displayAP {
        public static void main(String[] args) {
                @SuppressWarnings("resource")
                Scanner sc = new Scanner(System.in);
                System.out.print("Enter the terms to dispaly ");
                int n = sc.nextInt();
                for(int i=2;i<=(3*n-1);i=i+3){
                        System.out.println(i);
                }
        }
}
