package _4PatternPrint;

import java.util.Scanner;

public class printingRhombus {
        public static void main(String[] args) {
                @SuppressWarnings("resource")
                Scanner sc=new Scanner(System.in);
                System.out.print("Enter the rows ");
                int n = sc.nextInt();
                for(int i=1;i<=n;i++){//lines
                        for(int j=1;j<=n-i;j++){//spaces
                                System.out.print(" "+" ");
                        }
                        for(int j=1;j<n;j++){//stars
                                System.out.print("*"+" ");
                        }
                        System.out.println();
                }
        
        }
}
