package _3Loops;

import java.util.Scanner;

public class countdigits {
        public static void main(String[] args) {
                @SuppressWarnings("resource")
                Scanner sc = new Scanner(System.in);
                System.out.print("Enter  number: ");
                int n = sc.nextInt();
                int count = 0;
                while (n!=0) {
                        n /=10;
                        count++;
                }
                System.out.println("The number of digts in " + n + " is " +count);
        }
}
