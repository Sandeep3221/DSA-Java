package _1Basics;

import java.util.Scanner;

public class Input {
 
        public static void main(String[] args) {
                @SuppressWarnings("resource")
                Scanner sc =new Scanner(System.in);// to take the input
                System.out.print("Enter the radius of the circle ");
                int r=sc.nextInt();
                double area= 3.14*r*r;
                System.out.println("The area of circle is " + area);
        }
 }