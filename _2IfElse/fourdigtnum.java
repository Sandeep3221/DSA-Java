package _2IfElse;

import java.util.Scanner;

public class fourdigtnum {
        public static void main(String[] args) {
                @SuppressWarnings("resource")
                Scanner sc = new Scanner(System.in);
                System.out.print("Enter a number");
                int n = sc.nextInt();
                if(n>999 && n<10000){
                        System.out.println("4 digit number");
                }else{
                        System.out.println("Not a 4 digit number");
                }
        }
}
