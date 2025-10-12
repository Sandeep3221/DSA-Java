package _5Methods;

import java.util.Scanner;

public class maxOfThree {
        public static void main(String[] args) {
                @SuppressWarnings("resource")
                Scanner sc=new Scanner(System.in);
                System.out.println("Enter the numbers");
                int a=sc.nextInt();
                int b=sc.nextInt();
                int c=sc.nextInt();
                System.out.println("The max of nums "+Math.max(Math.max(a, b),c));
                //try this same thig for 4 numbers
        }
}
