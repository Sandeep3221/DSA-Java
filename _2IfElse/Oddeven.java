package _2IfElse;

import java.util.Scanner;

public class Oddeven {
        public static void main(String[] args) {
                @SuppressWarnings("resource")
                Scanner sc = new Scanner(System.in);
                System.out.print("Enter the positive number ");
                int num = sc.nextInt();
                if(num%2==0){
                        System.out.println("The number is even");
                }else{
                        System.out.println("The number is odd");
                }
        }
}
