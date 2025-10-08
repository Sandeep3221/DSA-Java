package _2IfElse;

import java.util.Scanner;

public class AbsoluteVal {

        public static void main(String[] args) {
                @SuppressWarnings("resource")
                Scanner sc = new Scanner(System.in);
                System.out.print("Enter the value ");
                int value = sc.nextInt();
                if(value>=0){
                        System.out.println(value);
                }else{
                        System.out.println(-value);
                }
        }
}