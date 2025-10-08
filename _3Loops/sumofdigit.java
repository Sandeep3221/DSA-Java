package _3Loops;

import java.util.Scanner;

public class sumofdigit {
        public static void main(String[] args) {
                @SuppressWarnings("resource")
                Scanner sc = new Scanner(System.in);
                System.out.print("Enter  number: ");
                int n = sc.nextInt();
                int sum=0;
                while (n!=0) {
                        sum+=n%10;
                        n /= 10;
                }
                System.out.println("The sum of the digits is " +sum  );
        }
}
