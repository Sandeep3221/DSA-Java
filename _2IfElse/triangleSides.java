package _2IfElse;

import java.util.Scanner;

public class triangleSides {
        public static void main(String[] args) {
                @SuppressWarnings("resource")
                Scanner sc = new Scanner(System.in);
                System.out.print("Enter first side");
                int a =sc.nextInt();
                System.out.print("Enter second side");
                int b =sc.nextInt();
                System.out.print("Enter third side");
                int c =sc.nextInt();
                if(a+b>c && b+c>a && c+a>b){
                        System.out.println("It is a valid triangle");
                }else{
                        System.out.println("Not a valid triangle");
                }
        }
}
