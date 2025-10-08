package _4PatternPrint;

import java.util.Scanner;

public class fliptriangle {
        public static void main(String[] args) {
                @SuppressWarnings("resource")
                Scanner sc=new Scanner(System.in);
                System.out.print("Enter the rows ");
                int n = sc.nextInt();
                for(int i=1;i<=n;i++){
                        for(int j=1;j<=n+1-i;j++){
                                System.out.print("* ");
                        }
                        System.out.println();
                }
        }
}
