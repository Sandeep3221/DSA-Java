package _3Loops;

import java.util.Scanner;

public class primecomposite {
        @SuppressWarnings("resource")
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        if (n <= 1) {
            System.out.println(n + " is neither prime nor composite");
        } else {
            boolean prime = true;
            for (int i = 2; i < n; i++) {
                if (n % i == 0) {
                    prime = false;
                    break;
                }
            }

            if (prime)
                System.out.println(n + " is prime");
            else
                System.out.println(n + " is composite");
        }
    }
}
