package _3Loops;

import java.util.Scanner;

public class reverseofnum {
        public static void main(String[] args) {
                @SuppressWarnings("resource")
                Scanner sc = new Scanner(System.in);
                System.out.print("Enter  number: ");
                int n = sc.nextInt();
                int reverse=0;
                while (n!=0) {
                        reverse *= 10;
                        reverse+=(n%10);
                        n /=10;
                }
                System.out.println(reverse);
        }
}
