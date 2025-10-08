package _4PatternPrint;

import java.util.Scanner;

public class floydsTriangle {
        public static void main(String[] args) {
                @SuppressWarnings("resource")
                Scanner sc=new Scanner(System.in);
                System.out.print("Enter the rows ");
                int rows = sc.nextInt();
                int a=1;
                for(int i=1;i<=rows;i++){
                        for(int j=1;j<i;j++){
                                System.out.print(a+" ");
                                a++;
                        }
                        System.out.println();
                }
        }
}
