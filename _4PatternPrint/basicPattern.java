package _4PatternPrint;

import java.util.Scanner;

public class basicPattern {
        public static void main(String[] args) {
                @SuppressWarnings("resource")
                Scanner sc=new Scanner(System.in);
                System.out.print("Enter the rows ");
                int rows = sc.nextInt();
                System.out.print("Enter coulmns ");
                int col = sc.nextInt();
                for(int i=1;i<=rows;i++){// kitni lines hogi aur
                        for(int j=1;j<=col;j++){//har line me kitne stars print honge
                                System.out.print("* ");
                        }
                        System.out.println();
                }
        }
}
